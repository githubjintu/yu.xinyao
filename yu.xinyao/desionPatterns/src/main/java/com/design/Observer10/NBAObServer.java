package com.design.Observer10;

public class NBAObServer {
    // 看股票同事类
    private String name;
    private Inform inform;
    public NBAObServer(String name, Inform inform){
        //super(name,inform);
        this.name = name;
        this.inform = inform;
    }
//    public void closeNBA(){
//        System.out.println("请不要看NBA，马上工作，"+name+","+
//                inform.getMessage()+"!!!"+inform.getName()+"特来通知");
//    }
}
