package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
       System.out.println(req.getParameter("login"));
       System.out.println(req.getParameter("email"));
       System.out.println(req.getParameter("password"));

       req.setAttribute("result","Привет " + req.getParameter("login"));

       req.getRequestDispatcher("/page/userPage.jsp").forward(req, resp);
    }
}
