package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/primenumbers")
public class PrimeNumberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter primariNumbersPage = resp.getWriter();
        boolean color = true;
        int line = 0;
        String outPage = "<h1> Вывод натуральных чисел </h1>";
        outPage+= "<table> <tbody>";

        for(int i = 2; i <= 1000; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if(line == 0){
                    outPage += "<tr>";
                }
                line++;
                if(color){
                    outPage = outPage + "<td style=\" background-color: black; color: white;\">" + i + "</td>";
                    color=false;
                }else {
                    outPage = outPage + "<td>" + i + "</td>";
                    color=true;
                }
                if(line % 8 == 0){
                    line = 0;
                    outPage += "</tr>";
                    if(color){
                        color=false;
                    }else color=true;
                }
                System.out.println(line);
            }
        }
        outPage+="</tbody></table>";
        primariNumbersPage.println(outPage);



    }
}
