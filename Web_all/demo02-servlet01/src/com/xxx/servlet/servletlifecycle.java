package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
    servlet生命周期
    1 实例化               构造器         第一次请求       1
    2 初始化               init          构造完毕        1
    3 接收请求，处理服务     service       每次请求         多次
    4 销毁                 destory       关闭服务         1

    default-servlet



    1 servlet继承结构

    public interface Servlet {

    初始化方法，构造完毕后由tomcat自动调用完成初始化功能的方法
    void init(ServletConfig var1) throws ServletException;

    获得servletConfig对象的方法
    ServletConfig getServletConfig();

    接收用户请求，向用户响应信息的方法
    void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

    返回servlet字符串形式描述信息的方法
    String getServletInfo();

    回收前销毁，资源释放
    void destroy();
}


    2 抽象类
    public abstract class GenericServlet implements Servlet{
    ...

    3 源码解析
        1）部分推荐在servlet中重写do***方法处理请求，
        2）直接重写service也没有问题
        3）后续使用SpringMVC框架后，无需继承HttpServlet，处理请求的方法也无需是do***
        4）如果doGet和doPost中定义方法一样，可以让一个方法直接调用另一个方法
        掌握技能
            继承Httservlet，要么重写service，要么重写doGet/doPost（两者都重写servlet优先

 */

//@WebServlet(value = "/servletlifecycle",loadOnStartup = -1)
public class servletlifecycle extends HttpServlet {
    public servletlifecycle(){
        System.out.println("构造器");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
