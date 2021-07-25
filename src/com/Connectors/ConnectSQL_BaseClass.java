package com.Connectors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ConnectSQL_BaseClass extends PostgreSQL_Connect implements ConnectSQL_Interface{
    @Override
    public void DDLInterface(String write) {
        try (Connection connection = connect();
             Statement statement = connection.createStatement()){
            statement.executeUpdate(write + "commit;");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println(write.contains("create")? "Создание таблицы успешна!":
                write.contains("drop")? "Удаление таблицы успешна!": "Команда успешна пройдена!");
    }

    @Override
    public void DMLInterface(String insert) {
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(insert)){
            statement.executeUpdate();
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void AddColumsInTable(String table, String column) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(String.format("ALTER TABLE public.%s " +
                     "ADD COLUMN %s VARCHAR", table, column))) {
            statement.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

}
