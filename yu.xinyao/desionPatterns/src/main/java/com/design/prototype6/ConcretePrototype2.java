package com.design.prototype6;

public class ConcretePrototype1 extends Prototype{
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
