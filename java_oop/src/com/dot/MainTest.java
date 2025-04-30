package com.dot;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("연산자의 여행");

        A a1 = new A();

        // a1.b.c 에서 c가 생성되지 않으면 실행이 안됨
        a1.b.c.callFinal();
    }
}
