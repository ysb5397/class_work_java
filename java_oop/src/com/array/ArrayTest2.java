package com.array;

public class ArrayTest2 {

    public static void main(String[] args) {

        char[] alphabets = new char[26];

        // char 타입은 원래 정수값이다
        // 컴퓨터는 0, 1로만 표현
        // 문자, 문자열을 아주 많이 다룸
        // 컴퓨터에서 문자를 표현하기 위해 문자표를 사용
        // 그 중 아스키 코드가 있다.(한국어 -> EUC-KR)
        // 유니코드라는 공통 문자표가 있음.
        // 아스키코드는 1바이드로 다 표현 가능
        // [][][][][][][][] ----> 0~127

        alphabets[0] = 'A'; // 65
        System.out.println((int)alphabets[0]);

        alphabets[1] = 'B';
        System.out.println((int)alphabets[1]);

        // 인코딩(Encoding)
        // 문자를 컴퓨터를 이해할 수 있는 숫자(코드값)으로 바꿈
        int code1 = (int)'A'; // 인코딩

        // 디코딩(Decoding)
        // 반대로 사람이 이해할 수 있게 바꾸는 것
        char code2 = (char)66; // 디코딩

        System.out.println("---------------------");

        // 반복문을 통해 알파벳을 A부터 Z까지 출력하시오
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char)('A' + i);
            System.out.println((i+1) + ". " + alphabets[i]);
        }

    }

}
