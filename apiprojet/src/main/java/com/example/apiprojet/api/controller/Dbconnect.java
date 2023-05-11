package com.example.apiprojet.api.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbconnect {

    private String url;
    private String username;
    private String password;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public Dbconnect(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            this.connection = DriverManager.getConnection(url,username,password);
            this.statement = connection.createStatement();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Statement getStatement() {
        return statement;
    }
}
