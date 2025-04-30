package com.RealMyTest;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {

        // 유저 생성
        RegisterInfo user1 = new RegisterInfo("null", 0, 0, 0, "null", "null");

        // getter 구문
        String outerName = user1.getName();
        int outerBirthYear = user1.getBirthYear();
        int outerBirthMonth = user1.getBirthMonth();
        int outerBirthDay = user1.getBirthDay();
        String outerid = user1.getId();
        String outerPassword = user1.getPassword();


        // 정보를 직접 수정받기 위한 도구 준비
        Scanner input = new Scanner(System.in);

        // process 변수 초기화
        int addChoice = 0;

        // while 문 돌리기
        int i = 0;

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("아래에 해당되는 번호를 눌러 기능을 수행해주세요. 단, 프로그램 종료시 모든것이 초기화됩니다.");
            System.out.printf("1. 정보 등록 / 2. 정보 초기화 / 3. 정보 조회 / 4. 프로그램 종료\n입력: ");
            i = input.nextInt();

            if (i == 1) {
                System.out.println("정보 등록을 선택하셨습니다.");
                System.out.println("혹시 어떤 정보를 등록하시겠습니까? 아래 기능에 해당하는 번호를 입력해주세요.");
                System.out.printf("1. 이름 등록 / 2. 생년월일 등록 / 3. 아이디 등록 / 4. 비밀번호 등록 \n입력: ");
                addChoice = input.nextInt();
            } else if (i == 2) {
                System.out.println("정보 초기화를 선택하셨습니다.");
                System.out.println("혹시 어떤 정보를 초기화하시겠습니까? 아래 기능에 해당하는 번호를 입력해주세요.");
                System.out.printf("1. 이름 초기화 / 2. 생년월일 초기화 / 3. 아이디 초기화 / 4. 비밀번호 초기화 \n입력: ");
                addChoice = input.nextInt();
                ;
            } else if (i == 3) {
                System.out.println("정보 조회를 선택하셨습니다.");
                user1.showInfo();
            } else if (i == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if ((i < 1) || (i > 4)) {
                System.out.println("번호가 잘못 입력됐습니다! 제대로 입력해주세요.");
                System.out.println("홈페이지로 돌아갑니다.");
            }


            if ((i == 1) && (addChoice == 1)) {
                System.out.println("이름을 입력해주세요.");
                String value1 = input.next();
                user1.setName(value1);
            } else if ((i == 1) && (addChoice == 2)) {
                System.out.println("먼저 태어난 연도를 입력해주세요.");
                int value1 = input.nextInt();
                user1.setBirthYear(value1);

                System.out.println("이제 태어난 달을 입력해주세요.");
                int value2 = input.nextInt();
                user1.setBirthMonth(value2);

                System.out.println("마지막으로 태어난 일을 입력해주세요.");
                int value3 = input.nextInt();
                user1.setBirthDay(value3);
            } else if ((i == 1) && (addChoice == 3)) {
                System.out.println("아이디를 입력해주세요.");
                String value1 = input.next();
                user1.setId(value1);
            } else if ((i == 1) && (addChoice == 4)) {
                System.out.println("비밀번호를 입력해주세요.");
                String value1 = input.next();
                user1.setPassword(value1);
            } else if ((i == 2) && (addChoice == 1)) {
                user1.setName(null);
            } else if ((i == 2) && (addChoice == 2)) {
                user1.setBirthYear(0);
                user1.setBirthMonth(0);
                user1.setBirthDay(0);
                System.out.println("생년월일이 초기화 되었습니다!");
            } else if ((i == 2) && (addChoice == 3)) {
                user1.setId(null);
                System.out.println("아이디가 초기화 되었습니다!");
            } else if ((i == 2) && (addChoice == 4)) {
                user1.setPassword(null);
                System.out.println("비밀번호가 초기화 되었습니다!");
            } else if (((i > 0) && (i < 5)) && ((addChoice < 1) || (addChoice > 4))) {
                System.out.println("번호가 잘못 입력됐습니다! 제대로 입력해주세요.");
                System.out.println("홈페이지로 돌아갑니다.");
            }
        }
    }
}
