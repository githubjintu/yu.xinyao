package com.design.simpleFactory1;

import lombok.Data;

@Data
abstract class Operation {
    private String operate;
    private double numberA;
    private double numberB;

    public double getOperate() {
        return 0d;
    }
}
