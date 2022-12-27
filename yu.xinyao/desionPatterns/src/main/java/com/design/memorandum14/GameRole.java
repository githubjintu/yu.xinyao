package com.design.memorandum14;

import lombok.Data;

@Data
public class GameRole implements Cloneable{
    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;
    // 状态显示
    public void stateDisplay(){
        System.out.println("角色当前状态：");
        System.out.println("体力："+this.vitality);
        System.out.println("攻击力："+this.attack);
        System.out.println("防御力："+this.defense);
    }
    // 获得初始状态。
    public void getInitState(){
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }
    // 战斗
    public void fight(){
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // 保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vitality,attack,defense);
    }
    // 新增恢复角色状态方法
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.vitality = roleStateMemento.getVitality();
        this.attack = roleStateMemento.getAttack();
        this.defense = roleStateMemento.getDefense();
    }
}
