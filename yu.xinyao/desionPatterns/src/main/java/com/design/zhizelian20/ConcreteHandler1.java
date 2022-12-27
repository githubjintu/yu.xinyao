package com.design.zhizelian20;

public class ConcreteHandler1 extends Handler{
    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request < 10){
            System.out.println("1处理请求");
        }else if (handler != null){
            handler.handlerRequest(request);
        }
    }
}
