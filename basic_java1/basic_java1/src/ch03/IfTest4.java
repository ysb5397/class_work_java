package ch03;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {

        //키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.printf("성적을 입력하세요: ");
        int score = sc.nextInt(); // 키보드 정수값을 받을 수 있는 명령문
        System.out.println("점수: " + score);

        if (score <= 59) {
            System.out.println("F 학점 입니다.");
        } else if (score <= 69) {
            System.out.println("D 학점 입니다.");
        } else if (score <= 79) {
            System.out.println("C 학점 입니다.");
        } else if (score <= 89) {
            System.out.println("B 학점 입니다.");
        } else {
            System.out.println("A 학점 입니다.");
        }

    } // end of main
} // end of class
