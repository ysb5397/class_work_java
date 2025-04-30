package com.inheritance;

// 부모 클래스
class Animal {
    protected String name;

    void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }

    void bark() {
        System.out.println(name + "이(가) 짖습니다.");
    }
}

// 자식 클래스
class Dog extends Animal {

    // 어노테이션 / 주석 + 힌트
    @Override
    void eat() {
        // 강아지가 먹는 모습 구현
//        super.eat(); // 필요하다면 사용
        System.out.println("강아지가 밥을 먹습니다.");
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        // 고양이
//        super.eat();
        System.out.println("고양이가 밥을 먹습니다.");
    }
}

// xxx.java 파일에는 public 클래스는 오직 하나
public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑이";

        dog.eat(); // 부모의 클래스 메서드를 호출
        dog.bark(); // 자식 클래스 메서드 호출
    }
}
