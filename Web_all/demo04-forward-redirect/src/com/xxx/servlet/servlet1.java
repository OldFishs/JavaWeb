package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 重定向通过HttpServletRequest实现
        //2 响应重定向是服务端提示下的，客户端行为
        //3 客户端地址栏是变化的  客户端多次请求
        //4 后端有多个request对象  请求中参数不能自动传递
        //5 目标资源可以是视图资源
        //6 目标资源不能是WEB-INF中资源
        //7 目标资源可以是外部资源
        //优先使用重定向
        //接收用户请求
        System.out.println("servlet1 end");

        //响应重定向
        resp.setStatus(302);
        resp.sendRedirect("servlet2");
        resp.sendRedirect("a.html");

    }
}
