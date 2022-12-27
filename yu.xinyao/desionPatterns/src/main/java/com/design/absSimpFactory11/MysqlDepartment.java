package com.design.absSimpFactory11;

public class MysqlUser implements IUser{
    @Override
    public void insertUser(User user) {
        System.out.println("往Mysql中插入了一条数据："+user);
    }

    @Override
    public void getUserId(int id) {
        System.out.println("从Mysql中查到了关于USER的一条数据id："+id);

    }
}
