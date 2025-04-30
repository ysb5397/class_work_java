package ch02;

public class Operator2 {
    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b: " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b: " + diff);


        // 곱셉
        int multi = a * b;
        System.out.println("a * b: " + multi);

        // 나눗셈
        // (int) / (int) --> 실수
        // double div = a / b;
        // 실수 / 실수
        // 나눗셈을 할 때는 실수 형변환을 해서 처리해야 정확하다
//        double div = 5.0 / 2.0;
        // 두 개 중에 하나라도 실수면 연산 결과는 실수로 처리 된다.
        double div = a / (double)b;
        System.out.println("a / b: " + div);

        // 나머지
        double extra = (double)a % b;
        System.out.println("a % b: " + extra);
        System.out.println("---------------");

        // 연습문제
        // 1. (12+3) / 3 화면에 출력
        System.out.println((12+3) / (double)3);

        // 2. (25 % 2) 값을 화면에 출력
        // 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수, 1이면 홀수
        System.out.println((double) 25 % 2); // 1 --> 홀수
        System.out.println((double) 26 % 2); // 0 --> 짝수

    } // end of main
} // end of class
