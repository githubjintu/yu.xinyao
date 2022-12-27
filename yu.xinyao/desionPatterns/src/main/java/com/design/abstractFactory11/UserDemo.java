package com.design.abstractFactory;

public class UserDemo {
    public static void main(String[] args) {
        IFactory iFactory = new OracleSqlFactory();
        SqlAbstractDepartment sqlDP = iFactory.getSqlDP("111");
        sqlDP.insert(new Department());

    }
}
