package com.design.adapter13;

public class Forwards extends Player{
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋进攻方式"+super.name);
    }

    @Override
    public void defense() {
        System.out.println("前锋防守方式"+super.name);
    }
}
