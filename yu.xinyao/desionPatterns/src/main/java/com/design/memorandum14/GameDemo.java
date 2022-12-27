package com.design.memorandum14;

public class GameDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 打boss前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        // 保存进度 不使用设计模式
        GameRole gameRole1 = (GameRole) gameRole.clone();

        // 大战boss 损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        // 读档
        gameRole.setAttack(gameRole1.getAttack());
        gameRole.setVitality(gameRole1.getVitality());
        gameRole.setDefense(gameRole1.getDefense());
        gameRole.stateDisplay();
    }
}
