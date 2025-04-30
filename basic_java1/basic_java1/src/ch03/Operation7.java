package ch03;

// 빠른 평가란?
// 논리 연산에서 첫 번째 조건이 결과를 결정할 경우
// 두번째 조건을 평가하지 않는 것

public class Operation7 {
    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리 곱(&&) 에서 빠른 평가 동작 확인
        // (number = number + 10)
        // (15 < 10) && (2 < 10)
        // 거짓 && 참
        boolean result = ((number += 10) < 10) && ((index += 2) < 10);
        System.out.println(result);

        // 우리는 대입 연산자를 사용했을 경우 --> 변수 접근 후 값 변경
        System.out.println(number);
        System.out.println(index);


    } // end of main
} // end of class
