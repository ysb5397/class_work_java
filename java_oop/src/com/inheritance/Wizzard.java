package com.inheritance;

public class Wizzard extends Hero{

    public Wizzard (String name, int hp) {
        super(name, hp);
    }

    public void freezing() {
        System.out.println(name + "이(가) 얼리기 공격을 성공했습니다.");
    }
}
