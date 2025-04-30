package com.polymorphism;

public class Banana extends Fruit {

    String origin; // 원산지

    public Banana() {
        name = "델몬트 바나나";
        price = 3000;
        origin = "필리핀";
    }

    public void saleBanana() {
        System.out.println("지금은 할인 행사 기간입니다!");
        price -= 1000;
        System.out.println("이 메서드가 호출된 이후 바나나 가격을 " + price + "원으로 할인합니다");

    }


}
