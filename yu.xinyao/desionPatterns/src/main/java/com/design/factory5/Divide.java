package com.design.factory5;

public class Divide extends Operation {
    @Override
    public double getOperate() {
        return super.getNumberA() / super.getNumberB();
    }
}
