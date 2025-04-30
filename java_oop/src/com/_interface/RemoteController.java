package com._interface;

public interface RemoteController {

    // 인터페이스란
    // 구현된 것이 마우것도 없는 밑 그림만 있는 기본 설계도

    // 모든 변수는 -> 상수
    // 모든 메서드는 -> 추상 메서드

    // 추상 클래스보다 추상화가 더 높다.
    // !! 인터페이스를 사용할 때에는 뭔가 동작 중심에 클래스를 선언해야 할 때 사용한다.

    // 인터페이스는 표준 또는 강제성이 있는 규약이다.

    // 오직 static 상수만을 가질 수 있다.
    public static final int SERIAL_NUMBER = 100;

    public abstract void turnOn();
    public abstract void turnOff();



}
