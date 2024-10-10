package com.xxx.schedule.pojo;

import lombok.*;

import java.util.Objects;

/*1 实体类类名和表格名称要相对应（对应不是一致
  2 实体类的属性名和表格的列
  3 属性私有
  4 属性应该具备getter setter
  5 必须具备无参构造器
  6 实现序列化接口
  7 应该重写类的hashcode和equals方法
  8 toString是否重写都可以

  使用Lombok生成getter setter 全参构造 无参构造 equals hashcode
    Lombok使用步骤
        1 idea安装Lombok插件
        2 勾选enable annotation propcesser
        3 导入Lombok依赖
        4 实体类添加注解
*/

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
public class SysUser {
    private Integer uid;
    private String username;
    private String userPwd;

//    public SysUser(){
//
//    }
//
//    public SysUser(Integer id, String username, String userpwd) {
//        this.id = id;
//        this.username = username;
//        this.userpwd = userpwd;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUserpwd() {
//        return userpwd;
//    }
//
//    public void setUserpwd(String userpwd) {
//        this.userpwd = userpwd;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SysUser sysUser = (SysUser) o;
//        return Objects.equals(id, sysUser.id) && Objects.equals(username, sysUser.username) && Objects.equals(userpwd, sysUser.userpwd);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, username, userpwd);
//    }
}
