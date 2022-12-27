package com.design.abstractFactory11;

public class OracleSqlFactory extends IFactory{
    @Override
    SqlAbstractUser getSql(String type) {
        return new OracleSqlUser();
    }

    @Override
    SqlAbstractDepartment getSqlDP(String type) {
        return new OracleDepartment();
    }
}
