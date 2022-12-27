package com.design.component15;

public class HRDepartment extends Company{
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(depth+new String("-")+super.getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println("员工培训管理："+super.getName());
    }
}
