package com.design.appearance8;

public class Fund {
    Stock1 stock1;
    Stock2 stock2;

    public Fund(){
        stock1 = new Stock1();
        stock2 = new Stock2();
    }
    public void buyFund(){
        stock1.buy1();
        stock2.buy2();
    }
    public void sellFund(){
        stock1.sell1();
        stock2.sell2();
    }
}
