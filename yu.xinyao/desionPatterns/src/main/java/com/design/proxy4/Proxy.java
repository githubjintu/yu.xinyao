package com.design.proxy4;

public class Pursuit {
    private String name;
    public void giveDolls(){
        System.out.println("送娃娃");
    }
    public void giveChocolate(){
        System.out.println("送巧克力");
    }

    public Pursuit(String name) {
        this.name = name;
    }
}
