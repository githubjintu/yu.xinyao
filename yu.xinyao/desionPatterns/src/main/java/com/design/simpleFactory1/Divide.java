package com.design.simpleFactory1;

public class Devide extends Operation  {
    @Override
    public double getOperate() {
        return super.getNumberA() / super.getNumberB();
    }
}
