package org.example.Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQL_Connect {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "7809";

    public  Connection connect() throws SQLException {

        try{
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
