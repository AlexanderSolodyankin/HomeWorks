package org.example.servlet;

import org.example.model.UserDataBase;
import org.example.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/come")
public class AuthorizeServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("asdh");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        System.out.println(req.getParameter("email"));
        System.out.println(req.getParameter("password"));
            String out = autorise(req.getParameter("email"), req.getParameter("password"));
        req.setAttribute("result", out);
        req.getRequestDispatcher("page/userPage.jsp");


    }







    public  String autorise(String userMail, String password){
        String messeg;
        Users user = UserDataBase.getUserByUserName(userMail);
        System.out.println("Прошла проверка на существование");
        if(user != null){
            messeg="Пользователь не найден!";
        }


        if(user.getPossword().equals(password)){
            UserDataBase.addUserLog(user,"SUCCESS");
            messeg = "Вход на учетную запись был успешен";
        }
        else {
            UserDataBase.addUserLog(user,"FAIL");
            messeg = "Вход на учетную запись был не успешен";
        }
        return messeg;

    }
}


