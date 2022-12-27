package com.design.adapter13;

import lombok.Data;

@Data
public class ForeignCenter {
    private String name;
    public void 进攻(){
        System.out.println("外籍球员，进攻"+this.getName());
    }
    public void 防守(){
        System.out.println("外籍球员，防守"+this.getName());
    }
}
