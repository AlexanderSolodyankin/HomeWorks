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
import java.util.Date;

@WebServlet("/register")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        createTableSQL();

        if(setUser(req.getParameter("email")) == null) {
            try (Connection connection = new PostgreSQL_Connect().connect();
                 PreparedStatement statement = connection.prepareStatement(String.format(
                         "INSERT INTO users( login, password, email, date, gender, text)" +
                                 "VALUES(?, ?, ?, '%s', ?, ?);", req.getParameter("date")))) {
                boolean gender;
                if (req.getParameter("gender").equals("man")) {
                    gender = true;
                } else gender = false;
                statement.setString(1, req.getParameter("login"));
                statement.setString(2, req.getParameter("password"));
                statement.setString(3, req.getParameter("email"));
                statement.setBoolean(4, gender);
                statement.setString(5, req.getParameter("text"));
                statement.executeUpdate();
                User user = setUser(req.getParameter("email"));
                if(user != null){
                    PrintWriter printWriter = resp.getWriter();
                    printWriter.println("<h1> Регистрация: " + user.getLogin() + " успешно завершена. </h1>" +
                            "<form action=\"index.jsp\">" +
                            " <button> На главную страницу </button>" +
                            "</form>");
                }
                System.out.println("Регистрация прошла успешно");
            } catch (Exception e) {
                System.out.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }else {
            PrintWriter printWriter = resp.getWriter();
            resp.setContentType("text/html; contentType=UTF-8");
            printWriter.println("<h1> Такая почта уже зарегестрирована </h1> <br>" +
                    "<form action=\"pages/register.jsp\">" +
                    "    <button> Вернутся к регистрации </button>" +
                    "</form>");
        }



    }

    static User setUser(String email){
        PostgreSQL_Connect connect = new ConnectSQL_BaseClass();
        User user;
        try (Connection connection = connect.connect();
        PreparedStatement statement = connection.prepareStatement
                ("Select * from users u where u.email = '" + email + "';");
             ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()){
                user = new User(resultSet.getString("login"),resultSet.getString("password"),
                        resultSet.getString("email"), resultSet.getDate("date"),
                        resultSet.getBoolean("gender"), resultSet.getString("text"));
                return user;
            }
        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    static void createTableSQL(){
        ConnectSQL_BaseClass createTable = new ConnectSQL_BaseClass();
        createTable.createTableSQL("CREATE TABLE IF NOT EXISTS users(" +
                "user_id serial primary key," +
                "login varchar(50) not null," +
                "password varchar(32) not null," +
                "email varchar(100) not null unique," +
                "date timestamp not null," +
                "gender boolean not null," +
                "text varchar(600) not null" +
                ");");
    }
}
