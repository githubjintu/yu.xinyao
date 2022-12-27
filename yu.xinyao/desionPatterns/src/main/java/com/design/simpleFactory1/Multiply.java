package com.design.simpleFactory1;

public class Add extends Operation  {
    @Override
    public double getOperate() {
        return super.getNumberA()+super.getNumberB();
    }
}
