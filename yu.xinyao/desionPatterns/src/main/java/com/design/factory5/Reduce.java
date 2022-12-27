package com.design.simpleFactory1;

public class Reduce extends Operation  {
    @Override
    public double getOperate() {
        return super.getNumberA() - super.getNumberB();
    }
}
