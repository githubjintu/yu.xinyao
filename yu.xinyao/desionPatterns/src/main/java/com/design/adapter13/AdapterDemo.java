package com.design.adapter13;

public class AdapterDemo {
    public static void main(String[] args) {
        Player player = new Center("zhanMu");
        player.attack();
        player.defense();
        Player player1 = new Translator("yaoMing");
        player1.attack();
        player1.defense();
    }
}
