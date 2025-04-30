package ch02;

import java.sql.SQLOutput;

public class DataType4 {
    public static void main(String[] args) {
        // 1. 기본 자료형 - 논리형 ( 어떠한 사실을 관찰하고 결과값이 참, 거짓인지 판별 )
        // 상자 크기는 1바이트 = 8 비트
        System.out.println(true); // 논리형 타입 값 true
        System.out.println(false); // 논리형 타입 값 false

        boolean isMarried = true; // 변수 선언과 동시에 초기화(값 대입)
        System.out.println(isMarried);

        isMarried = false;

        boolean isOk; // 변수만 선언
        isOk = false;

        System.out.println(isMarried);

    } // end of main
} // end of class
