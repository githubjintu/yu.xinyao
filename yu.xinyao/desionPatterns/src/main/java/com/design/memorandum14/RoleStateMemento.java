package com.design.memorandum14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleStateMemento {
    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;
}
