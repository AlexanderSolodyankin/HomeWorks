package com.company;

import com.Connectors.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDataBase {


    public static boolean insertUser(Users user){
        PostgreSQL_Connect connect = new PostgreSQL_Connect();
        String sql = "insert into Users(user_name,email, password, date_of_registration)" +
                "values(?, ?, ?, now())";
        int result = 0;

        try(Connection connection = connect.connect();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPossword());

            result = statement.executeUpdate();

        }catch (Exception e){
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
        return result > 0;
    }

    public static Users getUserByUserName(String userMail){
        PostgreSQL_Connect connect = new PostgreSQL_Connect();
        String sql = "select * from users where email = ?;";
        Users user = null;
        try (Connection connection = connect.connect();
        PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, userMail);

            try(ResultSet resultSet = statement.executeQuery()){

                if(resultSet.next()){
                    user = new Users();
                    user.setId(resultSet.getInt("user_id"));
                    user.setUserName(resultSet.getString("user_name"));
                    user.setEmail(resultSet.getString("email"));
                    user.setPossword(resultSet.getString("password"));
                    user.setDateOfRegistration(resultSet.getDate("date_of_registration"));
                }
            }
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return user;
    }

    public static boolean addUserLog(Users user, String loginResult){
        PostgreSQL_Connect con = new PostgreSQL_Connect();
        String sql = "insert into user_logs(user_id, login_time, login_result )" +
                "values (?, now(), ?);";
        int result = 0;
        try(Connection connection = con.connect();
        PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1,user.getId());
            stmt.setString(2,loginResult);

            result = stmt.executeUpdate();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": " + e.getMessage());
        }
        return result > 0 ;
    }
}
