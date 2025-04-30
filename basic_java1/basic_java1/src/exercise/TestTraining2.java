package exercise;

import java.util.Scanner;

public class TestTraining2 {
    public static void main(String[] args) {

        // if 문을 이용한 계산기 만들기
        Scanner cal = new Scanner(System.in);

        System.out.printf("첫번째 숫자를 입력해주세요. : ");
        int firstNum = cal.nextInt();
        System.out.println();

        System.out.printf("사칙연산 기호를 입력해주세요. : ");
        String mark = cal.next();
        System.out.println();

        System.out.printf("두번째 숫자를 입력해주세요. : ");
        int secondNum = cal.nextInt();
        System.out.println();

        if (mark == "+") {
            System.out.println("연산 결과입니다!: " + (firstNum + secondNum));
        } else if (mark == "-") {
            System.out.println("연산 결과입니다!: " + (firstNum - secondNum));
        } else if (mark == "*") {
            System.out.println("연산 결과입니다!: " + (firstNum * secondNum));
        } else if (mark == "/") {
            System.out.println("연산 결과입니다!: " + (firstNum / secondNum));
        } else {
            System.out.println("연산 기호를 잘못 입력하셨습니다. 다시 시도해주세요.");
        }

    } // end of main
} // end of class