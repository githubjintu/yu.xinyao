package com.design.stretegy2;

public class CashReturn extends CashSuper{
    public CashReturn(String moneyCondition,String moneyReturn){
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    @Override
    public double acceptCash(double money) {
        return money - (int)(money/moneyCondition)*moneyReturn;
    }
}
