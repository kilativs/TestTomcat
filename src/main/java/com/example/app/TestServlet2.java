package com.example.app;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String id = req.getParameter("id");
        System.out.println(id);

        String method = req.getMethod();
        System.out.println(method);

        String name = req.getParameter("name");
        resp.getWriter().println("Hello "+ name + "!!!");
    }
}
