package com.design.jieshiqi23;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        expressions.add(new TerminalExpression());

        expressions.forEach(a -> a.interpret(context));
    }
}
