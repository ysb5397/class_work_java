package com.access;

public class Hero {

    private String name;
    private int hp;
    private int power;
    private double defense;
    private boolean isDie;

    // 생성자
    public Hero(String nameV, int hpV, int powerV, double defenseV, boolean isDieV) {
        name = nameV;
        hp = hpV;
        power = powerV;
        defense = defenseV;
        isDie = isDieV;
    }

    // getter 5개 만들기
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public double getDefense() {
        return defense;
    }

    public boolean getIsDie() {
        return isDie;
    }

    // setter 5개 만들기
    public void setName(String n) {
        name = n;
    }

    public void setHp(int h) {
        hp = h;
    }

    public void setPower(int p) {
        power = p;
    }

    public void setDefense(double d) {
        defense = d;
    }

    public void setIsDie(boolean die) {
        isDie = die;
    }

    public void showInfo() {
        System.out.println("-----------Status----------");
        System.out.println("히어로 이름: " + name);
        System.out.println("히어로 체력: " + hp);
        System.out.println("히어로 공격력: " + power);
        System.out.println("히어로 방어력: " + defense);
        System.out.println("히어로 사망여부: " + isDie);
    }
}
