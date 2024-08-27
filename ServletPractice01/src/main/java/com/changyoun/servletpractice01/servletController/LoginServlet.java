package com.changyoun.servletpractice01.servletController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String targetName = "광택씨";
        String targetPassword = "rhkdxorTl";


        String name = req.getParameter("name");
        String password = req.getParameter("password");
        StringBuilder sb = new StringBuilder();
        if (targetName.equals(name) && targetPassword.equals(password)) {
            sb.append("반가워요 광택씨");
        } else {
            sb.append("또 비번 잊어버렸어?!");

        }

        resp.setContentType("text/html");


        PrintWriter out = resp.getWriter();
        out.print("<h1>" + sb.toString() + "</h1>");
        out.flush();
        out.close();
    }
}
