package com.design.state12;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request(); //ConcreteA被执行
        context.request(); //ConcreteB被执行
        context.request(); //ConcreteA被执行
    }
}
