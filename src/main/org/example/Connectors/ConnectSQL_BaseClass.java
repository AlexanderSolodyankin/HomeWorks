package org.example.Connectors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class ConnectSQL_BaseClass extends PostgreSQL_Connect implements ConnectSQL_Interface{
    @Override
    public  void createTableSQL(String write) {

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
    public  void insertTable(String insert) {
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(insert)){
            statement.executeUpdate();
            System.out.println("Данные внесены");
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
