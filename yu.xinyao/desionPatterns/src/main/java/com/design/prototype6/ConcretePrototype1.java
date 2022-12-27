package com.design.prototype6;

import lombok.Data;

public class ConcretePrototype1 extends Prototype{

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clonePro() throws CloneNotSupportedException {
        return (Prototype)clone();
    }
}
