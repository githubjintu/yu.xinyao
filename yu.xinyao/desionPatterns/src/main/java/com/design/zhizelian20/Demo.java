package com.design.zhizelian20;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        // 设置下一处理者
        handler1.setSuccess(handler2);
        int request[] = {10,12,33};
        Arrays.stream(request).forEach(handler1::handlerRequest);
    }
}
