package com.company.config;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoSQL {
    private  final String url = "jdbc:postgresql://localhost:5432/";
    private  final String user = "postgres";
    private  final String password = "7809";

    public  Connection connect() throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
