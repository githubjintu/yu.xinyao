package com.design.Observer10;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Data
public class Secretary {
    // 同事列表
    private List<Observer> list = new ArrayList<>();
    // 把需要通知的同事加进集合，针对抽象编程，所以使用观察者
//    @Override
//    public void Attach(Observer observer){
//        list.add(observer);
//    }
//    // 减少
//    @Override
//    public void Detach(Observer observer){
//        list.remove(observer);
//    }

    // 通知 针对抽象编程
    public void Notify(){
        list.forEach(Observer::update);
    }
}
