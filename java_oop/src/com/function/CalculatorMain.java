package com.function;

// 함수란? 데이터를 받아서 처리하고 결과를 돌려주는 코드블록
// static을 사용하면 객체 없이 바로 호출 가능
public class CalculatorMain {
    public static void main(String[] args) {
        // 테스트용 숫자
        int num1 = 12;
        int num2 = 0;
        int testNumber = 0;

        // 더하기 함수 호출
        int sum = add(num1, num2);
        System.out.println(num1 + "와/과 " + num2 + "을/를 더한 값: " + sum);
        System.out.println("---------------");

        // 빼기 함수 호출
        int sub = subtract(num1, num2);
        System.out.println(num1 + "에서 " + num2 + "을/를 뺀 값: " + sub);
        System.out.println("---------------");

        // 곱하기 함수 호출
        int mul = multiply(num1, num2);
        System.out.println(num1 + "와/과 " + num2 + "을/를 곱한 값: " + mul);
        System.out.println("---------------");

        // 나누기 함수 호출
        String div = divide(num1, num2);
        System.out.println(num1 + "에서 " + num2 + "을/를 나눈 값: " + div);
        System.out.println("---------------");

        // 짝수 판별 함수 호출
        boolean even = isEven(testNumber);
        System.out.println(testNumber + "을/를 짝수로 판별한 값: " + even);
        System.out.println("---------------");

        // 홀수 판별 함수 호출
        boolean odd = isOdd(testNumber);
        System.out.println(testNumber + "을/를 홀수로 판별한 값: " + odd);
        System.out.println("---------------");



    } // end of main

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a+b; // 입력받은 a와 b를 더하고 반환
    }

    // 두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a-b; // 입력받은 a에서 b를 빼고 반환
    }

    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a*b; // 입력받은 a와 b를 곱하고 반환
    }

    // 두 숫자를 나누는 함수
    static String divide(int a, int b) {
        // 방어적 코드를 잘 작성해야함
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다!");
        }
        return "infinity";
    }

    // 짝수인지 판별하는 함수
    static boolean isEven(int number) {
        return  number % 2 == 0; //  짝수면 true 홀수면 false
    }

    // 홀수인지 판별하는 함수
    static boolean isOdd(int number) {
        return  number % 2 != 0; //  홀수면 true 짝수면 false
    }
} // end of class
