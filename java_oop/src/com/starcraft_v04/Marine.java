package com.starcraft_v04;

public class Marine extends Unit {

    private boolean bubbleSkillOk;
    private double bubbleChance = 1;

    // 생성자 1
    public Marine(String name, int power, int hp, int dpChance, String description) {
        super.name = name;
        super.power = power;
        super.hp = hp;
        super.dpChance = dpChance;
        super.description = description;
    }
}
