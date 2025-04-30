package com.composition;

public class Computer {

    private String name;
    Cpu cpu;

    public Computer(String name) {
        this.name = name;
        cpu = new Cpu();
    }

    public void showComInfo() {
        System.out.println("컴퓨터 이름: " + name);
        System.out.println("cpu 코어 수: " + cpu.getCore());
    }

    public static void main(String[] args) {
        Computer computer = new Computer("인텔");
        computer.showComInfo();

    }
}
