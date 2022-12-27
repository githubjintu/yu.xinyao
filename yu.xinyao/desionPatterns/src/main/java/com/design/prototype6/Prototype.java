package com.design.prototype6;

import lombok.Data;

@Data
abstract class Prototype implements Cloneable{
    private String id;
    public Prototype(String id){
        this.id = id;
    }

    public abstract Prototype clonePro() throws CloneNotSupportedException;
}
