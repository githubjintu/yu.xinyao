package com.design.command19;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    // 存放烧烤菜单，顾客需要菜品的集合
    private List<Command> list = new ArrayList<>();

    // 设置订单
    public void setOrder(Command command){
        list.add(command);
    }
    // 取消订单
    public void removeOrder(Command command){
        list.remove(command);
    }
    // 执行
    public void notifyOrder(){
        list.forEach(Command::Execute);
    }
}
