package com.starcraft_v02;

public class Marine {


    private String name;
    private int power;
    private int hp;

    // 생성자 1
    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
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

    // setter는 안만듦

    // 메서드 오버로딩(이름을 같게 해도 매개변수가 달라서 인식 가능)
    // 마린이 질럿을 공격
    public void attack(Zealot zealot) {
        if (zealot.getHp() > 0) {
            System.out.println(name + "이(가) " + zealot.getName() + "을(를) 공격합니다");
            zealot.beAttacked(this.power);
            beAttacked(zealot.getPower());
        } else {
            System.out.println(zealot.getName() + "이(가) 이미 사망해서 공격이 실패했습니다.");
        }
    }

    // 마린이 저글링을 공격
    public void attack(Zergling zergling) {
        if (zergling.getHp() > 0) {
            System.out.println(name + "이(가) " + zergling.getName() + "을(를) 공격합니다");
            zergling.beAttacked(this.power);
            beAttacked(zergling.getPower());
        } else {
            System.out.println(zergling.getName() + "이(가) 이미 사망해서 공격이 실패했습니다.");
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
