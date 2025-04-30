package com.polymorphism;

public class AnimalTest2 {

    public static void main(String[] args) {

        /// 하나의 메서드가 여러 형태를 가질 수 있는 능력 의미
        /// move(); ----> 다 다름
        /// 하나의 변수에 통으로 데이터를 관리하고 싶다면 ... 배열
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Tiger();
        animals[2] = new Human();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }

}
