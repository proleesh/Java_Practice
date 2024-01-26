package com.proleesh.ex30;

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
    }

    public void retrieveOne() {
        System.out.println(bank.getAccountDetails("123456", "12345678"));
    }

    public void retrieveAll() {
        for (BankAccount bankAccount : bank.getAllAccounts()) {
            System.out.println(bankAccount);
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
}
