package org.example.model;



import org.example.Connectors.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
                    return user;
                }
                return null;
            }
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
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
    public static List<UserLog> getListLogs(Users user){
        PostgreSQL_Connect getListLogsSQL = new PostgreSQL_Connect();
        String getLogs = "select * from user_logs ul \n" +
                "join Users u on u.user_id = ul.user_id \n" +
                "where u.email = ?";
        List<UserLog> userListLog = new ArrayList<>();
        try(Connection connection = getListLogsSQL.connect();
        PreparedStatement statement = connection.prepareStatement(getLogs);
        ResultSet resultSet = statement.executeQuery()){
            statement.setString(1, user.getEmail());
            UserLog userLog;

            while (resultSet.next()){
                userLog = new UserLog();
                userLog.setId(resultSet.getInt("user_log_id"));
                userLog.setLoginTime(resultSet.getTime("login_time"));
                userLog.setLoginResult(resultSet.getString("login_result"));
            }

        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }

        return userListLog;
    }
}
