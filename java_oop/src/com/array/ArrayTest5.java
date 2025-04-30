package com.array;

import java.util.Random;

public class ArrayTest5 {

    public static void main(String[] args) {

        // 1. 문자열 배열 선언 및 초기화
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println(fruits.length);

        // 랜덤한 숫자를 하나 뽑아서 해당하는 번호의 과일을 출력
        Random random = new Random();
        int choice = random.nextInt(4); // 0~3 랜덤 숫자 출력
        System.out.println("랜덤으로 과일 설정하기: " + fruits[choice]);



    }
}
