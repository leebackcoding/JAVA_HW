package com.changyoun.servletpractice01.servletController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginPage")
public class HomepageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입 폼</h1>\n" +
                "<form action=\"login\" method=\"POST\">\n" +
                "    <label for=\"name\">이름:</label>\n" +
                "    <input type=\"text\" id=\"name\" name=\"name\" required><br><br>\n" +
                "\n" +
                "    <label for=\"password\">비밀번호:</label>\n" +
                "    <input type=\"password\" id=\"password\" name=\"password\" required><br><br>\n" +
                "\n" +
                "    <button type=\"submit\">제출</button>\n" +
                "</form>");
        out.flush();
        out.close();
    }
}
