package com.example.ltw_login_form;

import java.io.*;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    // Hardcoded username and password
    static final String HARD_CODED_USERNAME = "admin";
    static final String HARD_CODED_PASSWORD = "password";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy authentication logic - check username and password
        boolean authenticated = username.equals(HARD_CODED_USERNAME) && password.equals(HARD_CODED_PASSWORD);

        // Set attributes to indicate the login status
        if (authenticated) {
            request.setAttribute("loginStatus", "success");
        } else {
            request.setAttribute("loginStatus", "failure");
        }

        // Forward the request to login.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}