package com.design.simpleFactory1;

public class OperationFactory {
    public static Operation OperationFactory(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Reduce();
                break;
            case "*":
                operation = new Multiply();
                break;
            case "/":
                operation = new Divide();
        }
        return operation;
    }
}
