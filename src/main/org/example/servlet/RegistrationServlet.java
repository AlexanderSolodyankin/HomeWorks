package org.example.servlet;

import org.example.Connectors.ConnectSQL_BaseClass;
import org.example.Connectors.ConnectSQL_Interface;
import org.example.model.UserDataBase;
import org.example.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        System.out.println("Регистрация начата");
        createTableUsers();

       Users user = new Users(req.getParameter("login"), req.getParameter("email"), req.getParameter("password"));

        Users userLog = UserDataBase.getUserByUserName(user.getEmail());
        if(userLog != null){

            req.setAttribute("result", "Такой пользователь уже существует " + req.getParameter("login"));
        }else {
            req.setAttribute("result",  req.getParameter("login") + " Успешно зарегестрирован!!");
        }
       req.getRequestDispatcher("/page/userPage.jsp").forward(req, resp);
        UserDataBase.insertUser(user);
    }

    static void createTableUsers(){
        ConnectSQL_Interface createTable = new ConnectSQL_BaseClass();
        createTable.CreateTableSQL("create table if not exists Users(" +
                "user_id serial primary key," +
                "user_name varchar(100) not null," +
                "email varchar(100) not null unique," +
                "password varchar(50) not null," +
                "date_of_registration timestamp not null" +
                ");");

        createTable.CreateTableSQL("create table if not exists User_logs(" +
                "user_log_id serial primary key," +
                "user_id integer references Users(user_id) not null," +
                "login_time timestamp not null," +
                "login_result varchar(20) not null" +
                ");");
    }
}
