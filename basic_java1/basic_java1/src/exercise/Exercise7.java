package exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        // 스캐너 도구를 사용해서 사칙연산 계산기를 만들어보자.
        // 사용자에게 값 2개를 받아서 연산 하시오.

        Scanner cal = new Scanner(System.in);

        //첫번째 값 받기
        System.out.printf("첫번째 숫자를 입력해주세요. : ");
        int a = cal.nextInt();
        System.out.println();

        // 기호 결정하기
        System.out.printf("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n해당되는 번호만 하나를 골라주세요.( ex --> 1 ): ");
        int form = cal.nextInt();
        System.out.println();

        // 두번째 값 받기
        System.out.printf("두번째 숫자를 입력해주세요. : ");
        int b = cal.nextInt();
        System.out.println();

        // 결과
        // result를 선언해서 연산 방법을 분류했던 form의 값을 이용
        // form 1~4일 때, 각각 덧셈, 뺄셈, 곱셈, 나눗셈이 결정.
        // 만약 각각의 값이 대응되지 않으면 result값은 그대로 유지되며 다음으로 넘어간다.
        Boolean isError = false;
        int result = 0;

        // 1번
        result = (form == 1) ? (a + b) : result;
        result = (form == 2) ? (a - b) : result;
        result = (form == 3) ? (a * b) : result;
        result = (form == 4) ? (a / b) : result;

        // 오류 메시지(만약 form값이 1~4가 아니라면 계산 불가 판정으로 이해하고 오류를 출력한다.)
        isError = !(1 <= form && form <= 4) ? false : true;

        //계산 결과 출력
        System.out.println((isError == true) ? "계산 결과입니다! : " + result : "오류가 발생했습니다! 기호를 제대로 선택해주세요.");


    } // end of main
} // end of class
