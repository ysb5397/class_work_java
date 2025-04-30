package com.oop1;

public class Student {

    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("학생 소지금: " + money);
    }

}
