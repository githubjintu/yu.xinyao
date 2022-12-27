package com.design.abstractFactory11;

public class SqlServerDepartment extends SqlAbstractDepartment{

    @Override
    void insert(Department department) {
        System.out.println("sqlServer插入部门数据:"+department);
    }

    @Override
    void getDepartment(int id) {
        System.out.println("sqlServer获取到id的部门:"+id);
    }
}
