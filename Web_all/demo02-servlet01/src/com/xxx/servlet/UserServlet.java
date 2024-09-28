package com.xxx.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//servlet开发流程
//1.创建javaweb项目，将tomcat添加为依赖
//2.重写service方法
//3.在service方法中，定义业务处理代码
//4.

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
//        1 从request对象中获取请求的任何信息（username参数）
//        2 处理业务的代码
//        3 将要响应的数据放入response   应该设置content—type响应头
//        4 在web.xml中，配置servlet对应的请求映射路径
        String username = requset.getParameter("username");//根据参数名获取参数值 无论参数在url参数后 还是在请求体中
        String info = "yes";

        if("username".equals(username)){
            info = "<h1>no</h1>";
        }

        response.setHeader("Content-Type", "text/html");

        PrintWriter writer = response.getWriter();//返回一个向响应体中打印字符串的打印流
        writer.println(info);
        writer.close();


    }
}
