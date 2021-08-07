package org.example.servlet;

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

       Users user = new Users(req.getParameter("login"), req.getParameter("email"), req.getParameter("password"));

        Users userLog = UserDataBase.getUserByUserName(user.getEmail());
        if(userLog != null){

            req.setAttribute("result", "Такой пользователь уже существует " + req.getParameter("login"));
        }else {
            req.setAttribute("result",  req.getParameter("login") + "Успешно зарегестрирован!!");
        }
       req.getRequestDispatcher("/page/userPage.jsp").forward(req, resp);
        UserDataBase.insertUser(user);
    }
}
