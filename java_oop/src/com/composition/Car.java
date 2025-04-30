package com.composition;

public class Car {
    String name;
    int price;
    // 포함관계를 컴포지션이라고 한다.
    // Car 클래스는 engine 객체를 포함한다.
    Engine engine;

    public Car() {
        // 자동차 객체가 생성될 때 엔진 객체도 같이 생성
        // 강한 의존성
        engine = new Engine();
    }

    void startCar() {
        engine.start(); // car 객체를 통해서 엔진의 스타트 메서드를 호출
        System.out.println("자동차가 출발합니다");
    }

    void stopCar() {
        System.out.println("자동차가 멈춥니다.");
        engine.stop();
    }

    // 테스트 코드 작성
    public static void main(String[] args) {

        // ** 컴포지션 관계
        // 자동차 클래스 내부에서 엔진 객체를 생성시켜야 컴포지션 관계
        Car car = new Car();
        car.startCar();
        car.stopCar();
    }



}
