package com.design.zhongjiezhe21;

public class USA extends Country{
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }
    // 声明
    public void declare(String message){
        System.out.println("获得对方消息："+message);
    }
}
