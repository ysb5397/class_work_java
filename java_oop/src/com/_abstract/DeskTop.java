package com._abstract;

public class DeskTop extends Computer {

    @Override
    void display() {

    }

    @Override
    void typing() {

    }

    @Override
    void turnOn() {
        System.out.println("화면을 켭니다.");
    }

    @Override
    void turnOff() {
        System.out.println("화면을 끕니다.");
    }
}
