package com.design.abstractFactory;

public class SqlServerFactory extends IFactory{
    public SqlAbstractUser getSql(String type){
        return new SqlserverUser();
    }

    @Override
    SqlAbstractDepartment getSqlDP(String type) {
        return new SqlServerDepartment();
    }
}
