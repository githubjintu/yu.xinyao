package com.design.component15;

public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
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
        System.out.println("公司收入支出："+super.getName());
    }
}
