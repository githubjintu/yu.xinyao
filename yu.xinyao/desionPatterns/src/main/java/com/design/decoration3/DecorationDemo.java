package com.design.decoration3;

public class DecorationDemo {
    public static void main(String[] args) {
        Person yjt = new Person("yjt");
        System.out.println("穿着");
        TShirts tShirts = new TShirts();
        Shone shone = new Shone();
        tShirts.Decorate(yjt);
        shone.Decorate(tShirts);
        shone.show();
    }
}
