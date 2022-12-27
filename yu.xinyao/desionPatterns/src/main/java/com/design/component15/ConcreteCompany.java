package com.design.component15;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{
    private List<Company> list = new ArrayList<>();
    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        list.add(c);
    }

    @Override
    public void remove(Company c) {
        list.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth+new String("-")+super.getName());
        list.forEach(a -> a.display(depth + 2));
    }

    @Override
    public void lineOfDuty() {
        list.forEach(Company::lineOfDuty);
    }
}
