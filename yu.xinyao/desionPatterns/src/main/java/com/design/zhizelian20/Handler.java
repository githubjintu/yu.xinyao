package com.design.zhizelian20;

abstract class Handler {
    protected Handler handler;
    public void setSuccess(Handler handler){
        this.handler = handler;
    }
    // 请求处理
    public abstract void handlerRequest(int request);
}
