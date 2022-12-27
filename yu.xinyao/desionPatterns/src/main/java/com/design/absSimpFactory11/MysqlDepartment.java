package com.design.absSimpFactory11;

public class MysqlDepartment implements IDepartment{
    @Override
    public void insertDepartment(Department department) {
        System.out.println("往Mysql中插入了一条部门数据："+department);
    }

    @Override
    public void getDepartmentId(int id) {
        System.out.println("从Mysql中查到了关于Depart的一条数据id："+id);

    }
}
