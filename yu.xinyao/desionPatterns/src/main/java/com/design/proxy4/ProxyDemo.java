package com.design.proxy4;

import java.math.BigInteger;

public class ProxyDemo {
    public static void main(String[] args) {
        Pursuit dh = new Pursuit("DH");
        SchoolGirl girl = new SchoolGirl();
        girl.setName("abc");
        GiveGift giveGift = new Proxy(girl,dh,"JT");
        giveGift.giveChocolate();
        giveGift.giveDolls();
        System.out.println(new BigInteger(1,"abc".getBytes()).toString(13));
    }
}
