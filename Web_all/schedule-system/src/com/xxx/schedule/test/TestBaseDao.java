package com.xxx.schedule.test;

import com.xxx.schedule.dao.BaseDao;
import com.xxx.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.List;

public class TestBaseDao {
    private static BaseDao dao;

    @BeforeClass
    public static void initBaseDao(){
        dao = new BaseDao();
    }
    @Test
    public void testBaseQueryObject(){
        //查询结果集是单行单列的一个值的数据的方法
        String sql = "select count(1) from sys_user";
        Long count = dao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }

    @Test
    public void testBaseQuery(){
        String sql = "select uid,username,user_pwd userPwd from sys_user";
        List<SysUser> SysUserList = dao.baseQuery(SysUser.class, sql);
        SysUserList.forEach(System.out::println);
    }

    @Test
    public void testBaseUpdate(){
        String sql = "insert into sys_user(DEFAULT,?,?,?)";
        int rows = dao.baseUpdate(sql, 1, "admin", 0);
        System.out.println(rows);
    }
}
