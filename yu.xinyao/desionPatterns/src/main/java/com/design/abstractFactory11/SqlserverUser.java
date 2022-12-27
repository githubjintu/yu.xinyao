package com.design.abstractFactory11;

public class SqlserverUser extends SqlAbstractUser {
    @Override
    public void insert(User user){
        System.out.println("SqlServer调用添加用户sql:"+user);
    }
    @Override
    public void getUser(int id){
        System.out.println("SqlServer调用查询用户sql:"+id);
    }
}
