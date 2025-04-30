package com._abstract;

public abstract class Computer {

    abstract void display();

    abstract void typing();

    void turnOn() {
        System.out.println("컴퓨터를 켭니다.");
    }

    void turnOff() {
        System.out.println("컴퓨터를 끕니다.");
    }
}
