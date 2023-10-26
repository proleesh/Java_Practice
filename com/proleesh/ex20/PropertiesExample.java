package com.proleesh.ex20;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();

        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("Driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}
