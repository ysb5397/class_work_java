package ch03;

import java.util.Scanner;

public class IfTest5 {
    public static void main(String[] args) {

        //키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.printf("성적을 입력하세요(0~100): ");
        // 만약 저 범위 수가 잘못 입력 된다면 -> 잘못된 입력 입니다. 출력
        int score = sc.nextInt(); // 키보드 정수값을 받을 수 있는 명령문
        char grade = 'x';


        // 100~90 : A 학점 입니다.
        // 89~80 : B 학점 입니다.
        // 79~70 : C 학점 입니다.
        // 69~60 : D 학점 입니다.
        // ~59 : F 학점 입니다.
        // 단, 100~0값이 아닌 값을 입력했다면
        // 잘못된 입력 입니다. 출력하기
        // 의도는 && -> 논리곱을 해서 만들기

        //만약 잘못된 값이 들어왔다면 아래 구문을 출력하지 않도록 코드 수정
//        System.out.println("당신의 학점은 " + grade + "입니다.");

//        if (score > 100 || score <0) {
//            System.out.println("잘못된 입력입니다.");
//        } else if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        }else if (score >= 70) {
//            grade = 'C';
//        }else if (score >= 60) {
//            grade = 'D';
//        }else {
//            grade = 'F';
//        }
//
//        // 만약 잘못된 값이 들어올 경우
//        if(grade != 'x') {
//            System.out.println("당신의 학점은: " + grade + "입니다.");
//        }

         // 점수별 학점 산출
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 점수가 0~100인지 판별
        // 참이면 학점 출력(당신의 학점은 A입니다.)
        // 거짓이면 오류 출력(잘못된 입력값입니다.)
        System.out.println(((score <= 100) && (score >= 0)) ? "당신의 학점은 " + grade + "입니다." : "잘못된 입력값입니다.");
    } // end of main
} // end of class
