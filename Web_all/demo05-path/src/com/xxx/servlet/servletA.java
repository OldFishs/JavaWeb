package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletA")
public class servletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletA end");

//        重定向
//        1 相对路径写法
//          和前端相对路径规则一致

//        2 绝对路径写法
//            和前端规则一致
        resp.sendRedirect("../../../servletB");


//        请求转发
//        1 相对路径写法 一致

//        2 绝对路径
//            请求转发绝对路径不需要添加项目上下文    
    }
}
