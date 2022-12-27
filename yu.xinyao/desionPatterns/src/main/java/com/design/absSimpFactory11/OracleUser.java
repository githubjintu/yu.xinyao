package com.design.absSimpFactory11;

public class OracleUser implements IUser{
    @Override
    public void insertUser(User user) {
        System.out.println("往Oracle中插入了一条数据："+user);
    }

    @Override
    public void getUserId(int id) {
        System.out.println("从Oracle中查到了关于USER的一条数据id："+id);
    }
}
