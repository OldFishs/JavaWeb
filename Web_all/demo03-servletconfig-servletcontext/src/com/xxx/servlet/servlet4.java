package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servlet04")
public class servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //行相关   get/post uri http/1.1
        System.out.println(req.getMethod());//获取请求方式
        System.out.println(req.getScheme());//获取请求协议
        System.out.println(req.getProtocol());//获取协议及版本号
        System.out.println(req.getRequestURI());//获取请求的uri  项目内的资源路径
        System.out.println(req.getRequestURL());//获取请求的url  项目内资源的完整路径

        //URI   统一资源标识符     interface URI{}             资源定位的要求和规范
        //URL   统一资源定位符     class URL implement URL{}   具体的资源路径

        System.out.println(req.getLocalPort());//本应用容器端口号
        System.out.println(req.getServletPath());//客户端发请求的端口号
        System.out.println(req.getRemotePort());//客户端软件的端口号

        //头相关 根据名字单独获取某个请求头
        String accept = req.getHeader("Accept");
        System.out.println(accept);

        //获取所有请求头
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println(headerName + " : " + req.getHeader(headerName));
        }
    }
}
