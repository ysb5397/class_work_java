package com.starcraft_v04;

/**
 * @author ysb
 */
public class Zealot extends Unit {

    private boolean mindControl;
    private int controlChance = 30;

    // 생성자 1
    public Zealot(String name, int power, int hp, int dpChance, String description) {
        super.name = name;
        super.power = power;
        super.hp = hp;
        super.dpChance = dpChance;
        super.description = description;
    }
}
