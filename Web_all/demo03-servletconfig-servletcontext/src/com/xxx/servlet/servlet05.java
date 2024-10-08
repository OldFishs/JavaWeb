package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/servlet05")
public class servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取键值对形式的参数
//        接收请求中的参数
//        根据参数名获取单个参数值
        String username = req.getParameter("username");
        System.out.println(username);
        String userpwd = req.getParameter("userpwd");
        System.out.println(userpwd);

//        根据参数名获取多个参数值
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(hobbies);

//        获取所有参数名
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String parameterName = parameterNames.nextElement();
            String[] parameterValues = req.getParameterValues(parameterName);
            if(parameterName.length()>1){
                System.out.println(parameterName + ":" + Arrays.toString(parameterValues));
            }else{
                System.out.println(parameterName + ":" + parameterValues[0])    ;
            }
        }

//        返回所有参数的map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
    }
}
