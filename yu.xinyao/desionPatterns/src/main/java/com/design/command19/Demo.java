package com.design.command19;

public class Demo {
    public static void main(String[] args) {
        // 烧烤的人
        Barbecue barbecue = new Barbecue();
        // 烤肉命令
        Command bakeButtonCommand = new BakeButtonCommand(barbecue);
        // 烤鸡命令
        Command bakeChickenCommand = new BakeChickenCommand(barbecue);
        Waiter waiter = new Waiter();

        // 记录菜单
        waiter.setOrder(bakeButtonCommand);
        waiter.setOrder(bakeChickenCommand);
        waiter.notifyOrder();
    }
}
