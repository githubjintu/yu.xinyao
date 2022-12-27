package com.design.state12;

import lombok.Data;

@Data
public class Context {
    private State state;
    public Context(State state){
        this.state = state;
    }
    // 对请求处理，并设置下一状态
    public void request(){
        state.handler(this);
    }

}
