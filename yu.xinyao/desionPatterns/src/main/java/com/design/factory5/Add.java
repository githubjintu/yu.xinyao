package com.design.factory5;

public class Add extends Operation {
    @Override
    public double getOperate() {
        return super.getNumberA()+super.getNumberB();
    }
}
