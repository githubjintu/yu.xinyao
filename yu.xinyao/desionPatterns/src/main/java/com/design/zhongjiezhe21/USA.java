package com.design.zhongjiezhe21;

public class USA extends Country{
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }
    // 声明
    public void declare(String message){
        unitedNations.declare(message,this);
    }

    // 获得消息
    public void getMessage(String message){
        System.out.println("获得对方消息："+message);
    }
}
