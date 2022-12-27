package com.design.zhizelian20;

import lombok.Data;

@Data
public class Request {
    // 申请类别
    private String requestType;
    // 申请内容
    private String  requestContext;
    // 数量
    private int number;
}
