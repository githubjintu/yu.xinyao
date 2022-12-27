package com.design.factory5;

public class Reduce extends Operation {
    @Override
    public double getOperate() {
        return super.getNumberA() - super.getNumberB();
    }
}
