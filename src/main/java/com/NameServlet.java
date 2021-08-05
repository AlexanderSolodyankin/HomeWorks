package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/name")
public class NameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        if(req.getParameter("name") == null || req.getParameter("name").isEmpty()){
            req.setAttribute("result", " Наверное получилось");
        }
        else {
            req.setAttribute("result", " Ура получилось " + req.getParameter("name") + " ! ");
        }

        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
