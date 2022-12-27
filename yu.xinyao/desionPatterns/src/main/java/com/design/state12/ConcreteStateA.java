package com.design.state12;

public class ConcreteStateA extends State{

    @Override
    void handler(Context context) {
        System.out.println("ConcreteA被执行");
        context.setState(new ConcreteStateB());
    }
}
