package com.xxx.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;

@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        //向upload文件中写入一个文件

        //获得一个指向项目部署位置下的某个文件/目录的磁盘真实路径
        String path = context.getRealPath("upload");
        FileOutputStream fos = new FileOutputStream(path);
        System.out.println(fos);

        //获得项目的上下文路径 项目的访问路径
        String contextPath = context.getContextPath();
    }
}
