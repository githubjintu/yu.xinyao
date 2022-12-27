package com.design.stretegy2;

public class CashDemo {
    public static void main(String[] args) {
        double c = CashFactory.createCashAccept("满减", 400);
        System.out.println(c);
    }
}
