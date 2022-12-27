package com.design.stretegy2;

public class CashContext {
    private CashSuper cashSuper = null;
    public CashContext(String activity){
        switch (activity){
            case "无折扣":
                cashSuper = new CashNormal();
                break;
            case "8折":
                cashSuper = new CashRebate(0.8);
                break;
            case "满减":
                cashSuper = new CashReturn("300","100");
                break;
        }
    }
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
