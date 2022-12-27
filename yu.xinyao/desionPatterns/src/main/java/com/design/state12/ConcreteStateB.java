package com.design.state12;

public class ConcreteStateB extends State {
    @Override
    void handler(Context context) {
        System.out.println("ConcreteB被执行");
        context.setState(new ConcreteStateA());
    }
}
