package com.design.abstractFactory11;

public class OracleDepartment extends SqlAbstractDepartment{

    @Override
    void insert(Department department) {
        System.out.println("Oracle插入部门数据:"+department);
    }

    @Override
    void getDepartment(int id) {
        System.out.println("Oracle获取到id的部门:"+id);
    }
}
