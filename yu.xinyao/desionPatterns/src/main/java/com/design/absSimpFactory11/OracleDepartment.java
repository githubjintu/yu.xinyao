package com.design.absSimpFactory11;

public class OracleDepartment implements IDepartment{
    @Override
    public void insertDepartment(Department department) {
        System.out.println("往Oracle中插入了一条部门数据："+department);
    }

    @Override
    public void getDepartmentId(int id) {
        System.out.println("从Oracle中查到了关于Depart的一条数据id："+id);
    }
}
