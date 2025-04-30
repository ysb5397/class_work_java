package exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // 2단계
        // 괄호 - 조건식
        // 4 < 10 --> true
        // boolean = flag
        // true
//        while (true) {
//            System.out.println(".........");
//            if (5 < 10) {
//                break;
//            }
//        }

        // 프로그래밍에서는 (C R U D라는 개념이 있다)
        // C - Create 생성
        // R - Read 조회
        // U - Update 수정
        // D - Delete 삭제

        // 실행의 흐름을 만들어 보는 연습
        // 1. 스캐너
        // 2. while문
        // 3. if문

        //준비물
        Scanner input = new Scanner(System.in);

        // 1단계
        while (true) {
            // 도구 준비, 값을 활용하기 위해 변수가 필요
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1. 등록 / 2. 조회 / 3. 수정 / 4. 삭제 / 0. 종료");
            int choice = input.nextInt(); // 정수 받는 명령어

            // 1, 2, 3, 4, 0번에 따라서 실행의 흐름을 만들어야 함
            if (choice == 1) {
                System.out.println("1. 등록 선택");
            } else if (choice == 2) {
                System.out.println("2. 조회 선택");
            } else if (choice == 3) {
                System.out.println("3. 수정 선택");
            } else if (choice == 4) {
                System.out.println("4. 삭제 선택");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }


//        int num = 1;
//        Scanner input = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("--------------------------------------");
//            System.out.printf("메뉴 선택\n1. 등록 / 2. 조회 / 3. 수정 / 4. 삭제 / 0. 종료\n선택: ");
//            num = input.nextInt();
//            if (num == 0) {
//                System.out.print("프로그램을 종료합니다.");
//                break;
//            } else if (num == 1) {
//                System.out.println("등록을 선택했습니다.");
//            } else if (num == 2) {
//                System.out.println("조회를 선택했습니다.");
//            } else if (num == 3) {
//                System.out.println("수정을 선택했습니다.");
//            } else if (num == 4) {
//                System.out.println("삭제를 선택했습니다.");
//            } else {
//                System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
//            }
//        }


    } // end of main
} // end of class
