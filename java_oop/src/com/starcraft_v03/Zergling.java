package com.starcraft_v03;

public class Zergling extends Unit{

    private int multipleAttack;

    // 생성자 1
    public Zergling(String name, int power, int hp, int dpChance, String description) {
        super.name = name;
        super.power = power;
        super.hp = hp;
        super.dpChance = dpChance;
        super.description = description;
    }
}
