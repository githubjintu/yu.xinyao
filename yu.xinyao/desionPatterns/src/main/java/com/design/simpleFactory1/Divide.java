package com.design.simpleFactory1;

public class Divide extends Operation  {
    @Override
    public double getOperate() {
        return super.getNumberA() / super.getNumberB();
    }
}
