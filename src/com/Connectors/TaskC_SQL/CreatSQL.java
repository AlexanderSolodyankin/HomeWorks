package com.Connectors.TaskC_SQL;

import com.Connectors.PostgreSQL_Connect;

import java.sql.*;

public class CreatSQL extends PostgreSQL_Connect implements ConnectTaskC_SQL {

    @Override
    public void CreateTableSQL(String write) {
//        Connection connection = null;
//        Statement statement = null;
        try {
          Connection connection = connect();
          Statement statement = connection.createStatement();
            statement.executeUpdate(write);
            statement.close();
            connection.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Tаблица создана");
    }

    @Override
    public void InsertTable(String insert) {
        try(Connection connection = connect();
        PreparedStatement statement = connection.prepareStatement(insert)){
            statement.executeUpdate();
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

    }

    @Override
    public void addColumsInTable(String table, String column) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(String.format("ALTER TABLE public.%s " +
                     "ADD COLUMN %s VARCHAR", table, column))) {
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
