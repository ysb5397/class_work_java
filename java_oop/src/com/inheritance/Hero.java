package com.inheritance;

public class Hero {

    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack() {
        System.out.println(name + "이(가) 기본 공격을 합니다.");
    }

}
