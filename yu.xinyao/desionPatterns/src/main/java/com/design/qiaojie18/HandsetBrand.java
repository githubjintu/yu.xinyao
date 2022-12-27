package com.design.qiaojie18;

abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;
    // 设置手机软件
    public void setHandsetSoft(HandsetSoft handsetSoft){
        this.handsetSoft = handsetSoft;
    }
    public abstract void run();
}
