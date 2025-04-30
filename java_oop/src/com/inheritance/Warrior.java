package com.inheritance;

public class Warrior extends Hero{

    public Warrior(String name, int hp) {
        super(name, hp);
    }

    // 부모의 메서드를 재정의 할 때 -> 메서드 오버라이드

    // 어노테이션 -> 주석 + 힌트
    @Override
    public void attack() {
        super.attack();
    }

    public void comboAttack() {
        System.out.println("이(가) 콤보 공격을 성공 했습니다");

    }

}
