package com.design.zhizelian20;

public class ConcreteHandler2 extends Handler{
    @Override
    public void handlerRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println("2处理请求");
        }else if (handler != null){
            handler.handlerRequest(request);
        }
    }
}
