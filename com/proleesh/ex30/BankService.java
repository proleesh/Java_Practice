package com.proleesh.ex30;

import java.sql.*;

public class BankService {
    private static Connection con;
    private static BankService bank = new BankService();

    public BankService() {
        try{
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/udemytest",
                            "root",
                            "password");
            System.out.println("DB connection OK!");
        }catch(SQLException ex){
            System.out.println("Exception.");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        bank.retrieveOne();
    }
    public void retrieveOne(){
        System.out.println(bank.getAccountDetails("123456", "12345678"));
    }
    public BankAccount getAccountDetails(String branchCode, String accountNo){
        String selectSQL = "SELECT * FROM BANK_TABLE WHERE (BRANCH_CODE = ? AND ACCOUNT_NUMBER = ?)";
        BankAccount bankAccount = null;

        try(PreparedStatement ps = con.prepareStatement(selectSQL)){
            ps.setString(1, branchCode);
            ps.setString(2, accountNo);
            ResultSet resultSet = ps.executeQuery();

            if(!resultSet.next()){
                return bankAccount;
            }

            bankAccount = new BankAccount(
              resultSet.getString("BRANCH_CODE"),
              resultSet.getString(2),
              resultSet.getString("CUST_NAME"),
              resultSet.getString("CUST_ADDRESS"),
              resultSet.getDouble("BALANCE")
            );
        }catch (SQLException e){
            System.out.println("SQLException in getAccountDetails()");
            e.printStackTrace();
        }
        return bankAccount;
    }
}
