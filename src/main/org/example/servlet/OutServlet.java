package org.example.servlet;

import org.example.model.UserDataBase;
import org.example.model.UserLog;
import org.example.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/outinfo")
public class OutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        Users user = new Users();
        user.setEmail(req.getParameter("email"));
        List<UserLog> userInfo = UserDataBase.getListLogs(user);
        String tabl = "<table>";
        for (int i = 0; i < userInfo.size(); i++) {
            tabl = tabl + " <tr>" + " Номер входа: "+userInfo.get(i).getId() + ", Время входа: "+userInfo.get(i).getLoginTime()
                    + ", Статус попытки входа: "+ userInfo.get(i).getLoginResult() + "</tr> <br> </br>";
        }
        tabl = tabl + "</table>";
        req.setAttribute("result", tabl);
        req.getRequestDispatcher("/page/userPage.jsp").forward(req, resp);
    }
}
