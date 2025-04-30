package com.starcraft_v02;

public class Zergling {


    private String name;
    private int power;
    private int hp;

    // 생성자 1
    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    // read only --> getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    // 메서드 오버로딩(이름을 같게 해도 매개변수가 달라서 인식 가능)
    // 저글링이 질럿을 공격
    public void attack(Zealot zealot) {
        if (zealot.getHp() > 0) {
            System.out.println(name + "이(가) " + zealot.getName() + "을(를) 공격합니다");
            zealot.beAttacked(this.power);
            beAttacked(zealot.getPower());
        } else {
            System.out.println(zealot.getName() + "이(가) 이미 사망해서 공격이 실패했습니다.");
        }
    }

    // 저글링이 마린을 공격
    public void attack(Marine marine) {
        if (marine.getHp() > 0) {
            System.out.println(name + "이(가) " + marine.getName() + "을(를) 공격합니다");
            marine.beAttacked(this.power);
            beAttacked(marine.getPower());
        } else {
            System.out.println(marine.getName() + "이(가) 이미 사망해서 공격이 실패했습니다.");
        }
    }

    // 공격을 받음
    public void beAttacked(int power) {
        // 방어적 코드
        if (this.hp <= 0) {
            System.out.println(name + "이(가) 이미 사망했습니다. (남은 체력: \uD83D\uDC94" + hp + ")");
            return;
        }
        this.hp -= power;
        System.out.println(name + "이(가) ⚔\uFE0F" + power + " 만큼의 피해를 받았습니다. (남은 체력: ♥\uFE0F" + hp + ")");
    }

    // 상태를 보여주는 행위
    public void showInfo() {
        System.out.println("-----------✴\uFE0F [" + name + "] 의 스테이터스 ✴\uFE0F--------");
        System.out.println("공격력: ⚔\uFE0F" + power);
        System.out.println("체력: ♥\uFE0F" + hp);
    }
}
