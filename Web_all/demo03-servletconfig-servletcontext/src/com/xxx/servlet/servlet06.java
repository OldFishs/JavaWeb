package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet06")
public class servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);

        String info = "<h1>hello</h1>";

        //设置响应头的相关api
        resp.setContentType("text/html");
        resp.setContentLength(info.getBytes().length);

        //设置响应体内容api
        //获得向响应体中输入文本字符输出流
        PrintWriter out = resp.getWriter();
        out.write(info);

        //获得向响应体中输入二进制的字节输出流
    }
}
