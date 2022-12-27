package com.design.Observer10;

abstract class Observer {
    // 看其他摸鱼事情的同事类
    protected String name;
    protected Inform inform;
    public Observer(){}
    public Observer(String name,Inform inform){
        this.name = name;
        this.inform = inform;
    }
    public abstract void update();
}
