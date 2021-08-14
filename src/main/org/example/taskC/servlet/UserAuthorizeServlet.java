package org.example.taskC.servlet;

import org.example.Connectors.ConnectSQL_BaseClass;
import org.example.Connectors.PostgreSQL_Connect;
import org.example.taskC.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/authorize")
public class UserAuthorizeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        User user = new User();
        createTableUserLogs();
        user.setEmail(req.getParameter("email"));
        String password = req.getParameter("password");
        boolean log;
        user = getUser(user);
        log = user.getPassword().equals(password);
        insertUserLog(log, user);
        PrintWriter perint = resp.getWriter();

        if(log){
            perint.println("<h1> Вход успешен </h1>");
        }else perint.println("<h1> Вход не успешен </h1>");


    }
    static void createTableUserLogs(){
        ConnectSQL_BaseClass connect = new ConnectSQL_BaseClass();
        connect.createTableSQL("create table if not exists user_log(" +
                "id serial primary key," +
                "times_log timestamp not null," +
                "status_logs varchar not null," +
                "id_user integer references users(user_id)" +
                ");");

    }
    static void insertUserLog(boolean status, User user){

        try(Connection connection = new ConnectSQL_BaseClass().connect();
            PreparedStatement statement = connection.prepareStatement
                    ("INSERT INTO user_log(times_log, status_logs, id_user)" +
                            "values(now(), ?, ?)")){
            statement.setString(1, status + "");
            statement.setInt(2,user.getId());
            statement.executeUpdate();

            System.out.println("Успешный вход");

        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    static User getUser (User user){
        User userGet ;
        try(Connection connection = new ConnectSQL_BaseClass().connect();
            PreparedStatement statement = connection.prepareStatement("select * from users where users.email= ?")){
            statement.setString(1, user.getEmail());
            try(ResultSet set = statement.executeQuery()){
                while(set.next()) {
                    userGet = new User(set.getInt("user_id"),
                            set.getString("login"),
                            set.getString("password"),
                            set.getString("email"),
                            set.getDate("date"),
                            set.getBoolean("gender"),
                            set.getString("text"));
                    return userGet;
                }
            }
        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }
}
