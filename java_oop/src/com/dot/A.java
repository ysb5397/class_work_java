package com.dot;

public class A {

    // 속성
    B b;

    // 생성자 (인스턴스화 될 때 수행되는 코드)
    public A() {
        System.out.println("A 생성자 호출");
        b = new B();
    }
}
