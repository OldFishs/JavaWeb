package com.xxx.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet(
        urlPatterns = "/servlet2",
        initParams = {@WebInitParam(name="keya",value="value2a"),@WebInitParam(name="keyb",value="value2b")}
)

public class servlet2  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig sConfig = getServletConfig();
        //根据参数名获取参数值
        String keya = sConfig.getInitParameter("keya");
        System.out.println(keya);

        //获取所有的初始参数的名字（早期迭代器
//         hasMoreElements()    判断有没下一个参数 有true 无false
//         nextElement          取出下一个元素 向下移动游标
        Enumeration<String> initParameterNames = sConfig.getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String initParameterName = initParameterNames.nextElement();
            System.out.println(initParameterName + " = " + getInitParameter(initParameterName));
        }

        System.out.println("---------ServletContext获取参数------------");
//        获取servletContext
        ServletContext servletContext1 = getServletContext();
        ServletContext servletContext2 = sConfig.getServletContext();
        ServletContext servletContext3 = req.getServletContext();
        System.out.println(servletContext2 == servletContext3);
        System.out.println(servletContext1 == servletContext3);

        String encoding = servletContext3.getInitParameter("encoding");
        System.out.println(encoding);

        Enumeration<String> initParameterNames1 = servletContext2.getInitParameterNames();
        while(initParameterNames1.hasMoreElements()){
            String initParameterName = initParameterNames1.nextElement();
            System.out.println(initParameterName + " = " + getInitParameter(initParameterName));
        }

    }
}

