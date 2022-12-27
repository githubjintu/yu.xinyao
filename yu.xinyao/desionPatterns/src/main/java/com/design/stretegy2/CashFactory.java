package com.design.stretegy2;

import lombok.Data;

@Data
public class CashFactory {
    private String activity;

    public static double createCashAccept(String activity,double money){
        CashSuper cashSuper = null;
        double finalMoney = 0.0d;
        switch (activity){
            case "无折扣":
                cashSuper = new CashNormal();
                finalMoney = cashSuper.acceptCash(money);
                break;
            case "8折":
                cashSuper = new CashRebate(0.8);
                finalMoney = cashSuper.acceptCash(money);
                break;
            case "满减":
                cashSuper = new CashReturn("300","100");
                finalMoney = cashSuper.acceptCash(money);
                break;
        }
        return finalMoney;
    }
}
