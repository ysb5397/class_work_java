package com.inheritance;

public class CMainTest1 {
    public static void main(String[] args) {

        // A, B, C
        // A와 C 관계는 상속 관계
        C c = new C();
        c.name = "C 클래스입니다";
        c.height = 100;
        c.weight = 20;
        c.age = 10;

        c.level = 1;
        c.nickName = "자식 C 클래스";




    }
}
