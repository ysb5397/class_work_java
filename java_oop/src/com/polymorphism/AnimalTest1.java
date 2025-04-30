package com.polymorphism;

/**
 *  하나의 데이터 타입을 다양한 형태로 바라 보는 것(다형성)
 *  상세히 설명하면, 한 요소: 메서드, 클래스가 여러 형태를 가질 수 있는 능력
 *  상속 관계 - 다형성을 살펴보고 있다
 */
public class AnimalTest1 {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("----------------");

        /// 다형성의 장점.
        /// 부모 타입으로 자식 클래스를 인스턴스화 가능
        Animal animal2 = new Tiger();
        animal2.move();
        animal2.eating();
        System.out.println("----------------");

        /// 코드를 작성하는 시점 -> 컴파일 시점
        /// 프로그램을 실행하는 시점 -> 런타임 시점

        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();




    }

}
