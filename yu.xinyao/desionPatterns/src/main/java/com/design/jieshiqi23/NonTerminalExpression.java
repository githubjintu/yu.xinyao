package com.design.jieshiqi23;

public class NonTerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
