package com.design.adapter13;

import lombok.Data;

abstract class Player {
    public String name;
    public Player(String name){
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
}
