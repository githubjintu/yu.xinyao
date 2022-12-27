package com.design.memorandum14;

public class GameDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 打boss前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        // 保存进度 不使用设计模式
        //GameRole gameRole1 = (GameRole) gameRole.clone();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        // 大战boss 损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        // 读档
        /**
         * gameRole.setAttack(gameRole1.getAttack());
         * gameRole.setVitality(gameRole1.getVitality());
         * gameRole.setDefense(gameRole1.getDefense()); */
        RoleStateMemento roleStateMemento = roleStateCaretaker.getRoleStateMemento();
        gameRole.recoveryState(roleStateMemento);
        gameRole.stateDisplay();
    }
}
