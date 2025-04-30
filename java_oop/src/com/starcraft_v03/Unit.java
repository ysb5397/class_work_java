package com.starcraft_v03;

public class Unit {

    protected String name;
    protected int power;
    protected int hp;
    protected int dpChance;
    protected String description;

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

    public void attack(Unit unit) {
        if (unit.getHp() > 0) {
            System.out.println(name + "이(가) " + unit.getName() + "을(를) 공격합니다");
            unit.beAttacked(this.power);
            beAttacked(unit.getPower());
        } else {
            System.out.println(unit.getName() + "이(가) 이미 사망해서 공격이 실패했습니다.");
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
        System.out.println("-----------✴ [" + name + "] 의 스테이터스 ✴--------");
        System.out.println("공격력: ⚔\uFE0F" + power);
        System.out.println("체력: ♥\uFE0F" + hp);
    }
}
