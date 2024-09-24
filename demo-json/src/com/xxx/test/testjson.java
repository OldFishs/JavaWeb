package com.xxx.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xxx.pojo.Dog;
import com.xxx.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testjson {

    @Test
    public void testreadjson() throws JsonProcessingException {
        //实例化Person对象 将Person对象转化为JSON串
        Dog dog = new Dog("小黄");
        Person person = new Person("张三",10,dog);
        //转化为String  可以用Gson Jackson Fastjson
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(person);
        //JSON串
        System.out.println(s);


    }

    @Test
    public void testreadjson2() throws JsonProcessingException {
        //JSON串
        String personStr = "{\"name\":\"张三\",\"age\":10,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper mapper = new ObjectMapper();
        //转person对象
        Person person = mapper.readValue(personStr, Person.class);
        System.out.println(person);
    }


    //map
    @Test
    public void testmaptojson() throws JsonProcessingException {
        Map map = new HashMap();
        map.put("a","valuea");
        map.put("b","valueb");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }

    //list array
    @Test
    public void testlisttojson() throws JsonProcessingException {
//        List list = new ArrayList();
//        list.add("valuea");
//        list.add("valueb");
    //        String data[] = {"a","b","c"};
//        list.add(data);

        Dog dog = new Dog("小黄");
        Person person = new Person("张三",10,dog);
        List list = new ArrayList();
        list.add(person);
        System.out.println(list);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }

}
