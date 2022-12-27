package com.design.adapter13;

import lombok.Data;

public class Center extends Player{
    public Center(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("中锋进攻方式"+super.name);
    }

    @Override
    public void defense() {
        System.out.println("中锋防守方式"+super.name);
    }
}
