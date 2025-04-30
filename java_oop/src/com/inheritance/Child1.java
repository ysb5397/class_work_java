package com.inheritance;

public class Child1 extends Power1 {

    int age;

    // 상속 관계에서
    // 부모가 먼저 존재해야 자식도 존재가능
    public Child1(String name, int age) {
        super(name);
        this.age = age;
    }

}
