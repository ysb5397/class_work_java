package com._interface;

import com.dot.B;

// 인터페이스는 구현받다, 구현하다.
// Animal이라는 인터페이스를 구현받다.
public class Dog implements Animal {
    // 문법
    // 추상 메서드를 구현 메서드로 재정의


    @Override
    public void eat() {
        System.out.println("개가 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("개가 움직입니다");
    }

    public static void main(String[] args) {
        // 다형성
        Animal dog = new Dog(); // 업캐스팅
        Animal bird = new Bird();

        dog.eat();
        dog.move();

        bird.eat();
        bird.move();


    }
}

class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다.");
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 날아다닙니다");
    }
}
