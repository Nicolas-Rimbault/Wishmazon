package com.example.apiprojet.api.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbconnect {
    private static String url = "jdbc:mysql://localhost:3306/ecommerce";
    private static String username = "root";
    private static String password = "";
public static void connect(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connected");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM client");

        while (resultSet.next()){
            System.out.println(resultSet.getString("nom"));
        }

        connection.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}

}
