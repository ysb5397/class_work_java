package com.overloading;

/**
 *  메서드 오버로딩이란?
 *  같은 이름의 메서드를 여러 개 정의 하는 것을 의미
 */

public class Calculator {

    // 덧셈 메서드
    public int add (int a, int b) {
        return a + b;
    }

    // 매개변수의 데이터 타입이 다르다면 컴파일러는 구분 가능
    public double add (double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    // main 함수
    public static void main(String[] args) {
        // println()도 메서드 오버로딩이다



    }
}
