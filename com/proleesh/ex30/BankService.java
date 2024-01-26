package com.proleesh.ex30;

import com.proleesh.ex13.sec05.B;

import java.sql.*;
import java.util.ArrayList;

public class BankService {
    private static Connection con;
    private static BankService bank = new BankService();

    public BankService() {
        try {
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/udemytest",
                            "root",
                            "password");
            System.out.println("DB connection OK!");
        } catch (SQLException ex) {
            System.out.println("Exception.");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        bank.retrieveOne();
        bank.retrieveAll();
//        bank.deleteOne();
//        bank.deleteAll();
//        bank.add();
//        bank.update();
    }

    public void retrieveOne() {
        System.out.println(bank.getAccountDetails("123456", "12345678"));
    }

    public void retrieveAll() {
        for (BankAccount bankAccount : bank.getAllAccounts()) {
            System.out.println(bankAccount);
        }
    }

    public void deleteOne(){
        int nRows = bank.deleteBankAccount("123456", "12345678");
        if(nRows == 1){
            System.out.println("DELETE OK: " + nRows);
        }else{
            System.out.println("DELETE error: " + nRows);
        }
    }

    public void deleteAll(){
        bank.deleteAllAccounts();
    }

    public void add(){
        int nRows = bank.addBankAccount(
                new BankAccount("19234153", "24242424", "왕건", "개성시", 100)
        );
        if(nRows == 1){
            System.out.println("Add OK: " + nRows);
        }else{
            System.out.println("Add error: " + nRows);
        }
    }
    public void update(){
        BankAccount accountDetails = bank.getAccountDetails("19234153", "24242424");
        System.out.println("BEFORE Update: " + accountDetails);
        accountDetails.setCustName("김일성");
        accountDetails.setCustAddress("평양");
        int nRows = bank.updateBankAccount(accountDetails);
        if(nRows == 1){
            System.out.println("Update OK: " + nRows);
            System.out.println("AFTER Update: " + bank.getAccountDetails("19234153", "24242424"));
        }else{
            System.out.println("Add error: " + nRows);
        }
    }
    public BankAccount getAccountDetails(String branchCode, String accountNo) {
        String selectSQL = "SELECT * FROM BANK_TABLE WHERE (BRANCH_CODE = ? AND ACCOUNT_NUMBER = ?)";
        BankAccount bankAccount = null;

        try (PreparedStatement ps = con.prepareStatement(selectSQL)) {
            ps.setString(1, branchCode);
            ps.setString(2, accountNo);
            ResultSet resultSet = ps.executeQuery();

            if (!resultSet.next()) {
                return bankAccount;
            }

            bankAccount = new BankAccount(
                    resultSet.getString("BRANCH_CODE"),
                    resultSet.getString(2),
                    resultSet.getString("CUST_NAME"),
                    resultSet.getString("CUST_ADDRESS"),
                    resultSet.getDouble("BALANCE")
            );
        } catch (SQLException e) {
            System.err.println("SQLException in getAccountDetails()");
            e.printStackTrace();
        }
        return bankAccount;
    }

    // select all accounts
    public ArrayList<BankAccount> getAllAccounts() {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        String selectSQL = "SELECT * FROM BANK_TABLE";
        try (PreparedStatement ps = con.prepareStatement(selectSQL)) {
            boolean isResultSet = ps.execute();
            if (isResultSet) {
                ResultSet resultSet = ps.getResultSet();
                while (resultSet.next()) {
                    BankAccount bankAccount = new BankAccount(
                            resultSet.getString(1),
                            resultSet.getString("ACCOUNT_NUMBER"),
                            resultSet.getString("CUST_NAME"),
                            resultSet.getString("CUST_ADDRESS"),
                            resultSet.getDouble("BALANCE")
                    );
                    bankAccounts.add(bankAccount);
                }
            } else {
                System.out.println("Did an update!");
            }
        } catch (SQLException e) {
            System.err.println("SQLExcetion in getAllAccounts()");
            e.printStackTrace();
        }

        return bankAccounts;
    }

    public int deleteBankAccount(String branchCode, String accountNo){
        int nRows = -1;
        String deleteSQL = "DELETE FROM BANK_TABLE WHERE (BRANCH_CODE=? AND ACCOUNT_NUMBER=?)";
        try(PreparedStatement ps = con.prepareStatement(deleteSQL)){
            ps.setString(1, branchCode);
            ps.setString(2, accountNo);
            nRows = ps.executeUpdate();
        }catch(SQLException e){
            System.err.println("SQLException in deleteBankAccount()");
            e.printStackTrace();
        }
        return nRows;
    }
    public void deleteAllAccounts(){
        String deleteSQL = "DELETE FROM BANK_TABLE";
        try(PreparedStatement ps = con.prepareStatement(deleteSQL)){
            ps.executeUpdate();
        }catch(SQLException e){
            System.err.println("SQLException in deleteAllAccounts()");
            e.printStackTrace();
        }
    }

    public int addBankAccount(BankAccount bankAccount){
        int nRows = -1;
        String insertSQL = "INSERT INTO BANK_TABLE (BRANCH_CODE, ACCOUNT_NUMBER, CUST_NAME, CUST_ADDRESS, BALANCE)"
                + "VALUES (?,?,?,?,?)";
        try(PreparedStatement ps = con.prepareStatement(insertSQL)){
            ps.setString(1, bankAccount.getBranchCode());
            ps.setString(2, bankAccount.getAccountNo());
            ps.setString(3, bankAccount.getCustName());
            ps.setString(4, bankAccount.getCustAddress());
            ps.setDouble(5, bankAccount.getBalance());
            nRows = ps.executeUpdate();
        }catch (SQLException e){
            System.err.println("SQLException in addBankAccount()");
            e.printStackTrace();
        }
        return nRows;
    }

    public int updateBankAccount(BankAccount bankAccount){
        int nRows = -1;
        String updateSQL = "UPDATE BANK_TABLE SET CUST_NAME=?, CUST_ADDRESS=?, BALANCE=? "
                + "WHERE (BRANCH_CODE = ? AND ACCOUNT_NUMBER=?)";

        try(PreparedStatement ps = con.prepareStatement(updateSQL)){
            ps.setString(1, bankAccount.getCustName());
            ps.setString(2, bankAccount.getCustAddress());
            ps.setDouble(3, bankAccount.getBalance());
            ps.setString(4, bankAccount.getBranchCode());
            ps.setString(5, bankAccount.getAccountNo());
            nRows = ps.executeUpdate();
        }catch(SQLException e){
            System.err.println("SQLException in updateBankAccount()");
            e.printStackTrace();
            return nRows;
        }
        return nRows;
    }
}
