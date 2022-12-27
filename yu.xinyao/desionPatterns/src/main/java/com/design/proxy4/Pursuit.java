package com.design.proxy4;

public class Pursuit implements GiveGift{
    private String name;
    public void giveDolls(){};
    public void giveChocolate(){};
    public Pursuit(String name) {
        this.name = name;
    }
    public Pursuit(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
