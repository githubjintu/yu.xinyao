package com.design.singleton;

public class SingletonDept {

    public volatile Dept dept;

    public Dept getDept(){
        if (dept == null){
            synchronized(this){
                if (dept == null){
                    dept = new Dept();
                }
            }
        }
        return dept;
    }
}
