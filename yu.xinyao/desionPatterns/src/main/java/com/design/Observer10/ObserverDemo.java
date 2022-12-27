package com.design.Observer10;

public class ObserverDemo {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
//        secretary.setName("前台1号");
//        secretary.Attach(new StockObServer("同事1",secretary));
//        secretary.Attach(new NBAObServer("同事2",secretary));
//        secretary.setMessage("主管来了");
        secretary.Notify();
    }
}
