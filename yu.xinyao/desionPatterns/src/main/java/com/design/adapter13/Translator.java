package com.design.adapter13;

public class Translator extends Player{
    public Translator(String name){
        super(name);
        foreignCenter.setName(name);
    }
    private ForeignCenter foreignCenter = new ForeignCenter();
    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
