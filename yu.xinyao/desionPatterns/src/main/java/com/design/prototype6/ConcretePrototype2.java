package com.design.prototype6;

public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(String id) {
        super(id);
    }
    @Override
    public Prototype clonePro() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
