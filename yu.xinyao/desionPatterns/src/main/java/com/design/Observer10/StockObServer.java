package com.design.Observer10;

public class StockObServer {
    // 看股票同事类
    private String name;
    private Inform inform;
    public StockObServer(String name,Inform inform){
        //super(name,inform);
        this.name = name;
        this.inform = inform;
    }
//    public void closeSTO(){
//        System.out.println("请不要看股票，马上工作，"+name+","+
//                inform.getMessage()+"!!!"+inform.getName()+"特来通知");
//    }
}
