package com.array;

public class ArrayTest1 {

    public static void main(String[] args) {

        // 배열은 연관된 데이터 타입을 한번에 모아서 통으로 관리 및 사용

        // 배열을 선언하는 문법
        // 규칙 1
        // 배열은 반드시 먼저 몇개의 들어갈지 길이를 지정해야 쓸 수 있음

//        int[] numbers; // 배열의 선언
//        numbers = new int[3]; // 4 * 3 바이트 만큼 초기화
        int[] numbers = new int[3]; // 데이터 타입에 대괄호 가능
//        int intBox[] = new int[5]; // 변수 뒤에 대괄호 가능

        // [][][] -> 아직 값 없음
        // 배열 선언과 동시에 값을 초기화 해보자
        int[] grades = new int[] {1,2,3};
        // [1][2][3]

        int[] grades2 = {1,2,3,4,5,6};
        // 6개의 데이터 박스

        // 문제 1
        // 5개의 길이를 가지는 double 타입 배열을 선언
        // 배열의 이름은 마음대로
        double[] doubles = new double[5];
         doubles[0] = 1.0;
         doubles[1] = 1.1;
         doubles[2] = 1.2;
         doubles[3] = 1.3;
         doubles[4] = 1.4;
         // 모든 프로그래밍 언어의 인덱스 번호는 0부터 시작

        // doubles 배열의 길이는 5
        // doubles 인덱스의 길이는 4
        // 모든 인덱스의 길이는 배열 - 1이다
//        doubles[5] = 1.5;

        int[] array1 = new int[57];
        // 배열 길이 57
        // 인덱스 길이 56

        int[] array2 = new int[157];
        // 배열 길이 157
        // 인덱스 길이 156

        // String 배열
        String[] stringBox = new String[3];

        stringBox[0] = "가";
        stringBox[1] = "나";
        stringBox[2] = "다";

        System.out.println("----------------");
        System.out.println(stringBox.length);
        System.out.println(stringBox[0]);
        System.out.println(stringBox[1]);
        System.out.println(stringBox[2]);

        for (int i = 0; i < stringBox.length; i++) {
            // i는 0부터 2까지 돌아감
            System.out.println(stringBox[i]);
        }



        double[] visions = {0.4, 1.0, 0.7, 1.5, 0.2};
    }

}
