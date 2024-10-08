package com.xxx.servlet;

import javax.servlet.RequestDispatcher;
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

        //1 请求转发是通过HttpServletRequest实现的
        //2 请求转发是服务器内部行为 对客户端是屏蔽的
        //3 客户端只产生了一对请求 服务端只产生了一对request和response对象
        //4 客户端的地址栏是不变的
        //5 请求参数可以继续传递
        //6 目标资源可以是servlet动态资源 也可以是html静态资源
        //7 目标资源可以是WEB-INF下受保护的资源，是WEB-INF下资源唯一访问形式
        //8 目标资源不可以是外部资源


        //请求转发给b
        //获得请求转发器
//        RequestDispatcher servletB = req.getRequestDispatcher("servletB");
//        RequestDispatcher rd = req.getRequestDispatcher("a.html");
        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/b.html");
        //转发
        rd.forward(req, resp);
    }
}
