package com.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest4 {

    public static void main(String[] args) {

        // 배열을 사용해서 랜덤한 숫자 6개를 저장하고 출력해보자
        // 배열은 보통 for(반복문과 함께 사용)

        // 랜덤한 숫자를 뽑아주는 도구 준비
        Random random = new Random();

        // 배열은 연관된 데이터 타입을 통으로 관리하기 위해 사용할 수 있다.
        // 정수값 6개를 받을 수 있는 배열을 만들어보자
        int[] intBox = new int[6];

        for (int i = 0; i < intBox.length; i++) {
            intBox[i] = 1 + random.nextInt(45);
            System.out.println(intBox[i]);
        }
        System.out.println("------------------");
        // 자바 개발자들이 미리 만들어둔 정렬 기능
        Arrays.sort(intBox);

        // 오름차순
        for (int i = 0; i > 6; i++) {
            System.out.printf(intBox[i] + "\t");
        }

        // 내림차순
        for (int i = 5; i > -1; i--) {
            System.out.printf(intBox[i] + "\t");
        }
    }
}
