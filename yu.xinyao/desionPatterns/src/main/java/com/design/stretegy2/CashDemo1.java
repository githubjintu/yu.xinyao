package com.design.stretegy2;

public class CashDemo1 {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("满减");
        double result = cashContext.getResult(400);
        System.out.println(result);
    }
}
