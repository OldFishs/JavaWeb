package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletC")
public class servletC extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置响应体使用utf-8
        resp.setCharacterEncoding("GBK");
//        设置contenttype响应头用utf-8解码
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("nihao");
    }
}
