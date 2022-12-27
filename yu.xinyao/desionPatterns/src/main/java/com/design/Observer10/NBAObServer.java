package com.design.Observer10;

public class StockObServer extends Observer{
    // 看股票同事类
    private String name;
    private Secretary secretary;
    public StockObServer(String name,Secretary secretary){
        super(name,secretary);
    }
    public void update(){
        System.out.println("请不要看股票，马上工作，"+name+","+
                secretary.getMessage()+"!!!"+secretary.getName()+"特来通知");
    }
}
