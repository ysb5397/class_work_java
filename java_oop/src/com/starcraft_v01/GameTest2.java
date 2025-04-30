package com.starcraft_v01;

import java.util.Scanner;

public class GameTest2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 실행의 흐름 만들어 보기
        Zealot zealot1 = new Zealot("질럿1");
        Marine marine1 = new Marine("마린1");
        Zergling zergling1 = new Zergling("저글링1");

        while (true) {
            System.out.printf("1. 질럿 / 2. 마린 / 3. 저글링 중 선택하실 캐릭터의 번호를 입력해주세요.\n입력: ");
            int selected = input.nextInt();

            if ((selected == 1) && (zealot1.getHp() > 0)) {
                System.out.println("누구를 공격하시겠습니까?");
                System.out.printf("1. 마린 / 2. 저글링\n입력: ");

                int target = input.nextInt();

                if (target == 1) {
                    zealot1.attackMarine(marine1);
                } else if (target == 2) {
                    zealot1.attackZergling(zergling1);
                } else if (zealot1.getHp() > 0) {
                    System.out.println("잘못된 입력값입니다!");
                } else {
                    System.out.println("현재 " + zealot1.getName() + "의 \uD83D\uDC94체력이 없어 선택이 불가능합니다.");
                }
            } else if ((selected == 2) && (marine1.getHp() > 0)) {
                System.out.println("누구를 공격하시겠습니까?");
                System.out.printf("1. 질럿 / 2. 저글링\n입력: ");

                int target = input.nextInt();

                if (target == 1) {
                    marine1.attackZealot(zealot1);
                } else if (target == 2) {
                    marine1.attackZergling(zergling1);
                } else if (marine1.getHp() > 0) {
                    System.out.println("잘못된 입력값입니다!");
                } else {
                    System.out.println("현재 " + zealot1.getName() + "의 \uD83D\uDC94체력이 없어 선택이 불가능합니다.");
                }
            } else if ((selected == 3) && (zergling1.getHp() > 0)) {
                System.out.println("누구를 공격하시겠습니까?");
                System.out.printf("1. 질럿 / 2. 마린\n입력: ");

                int target = input.nextInt();

                if (target == 1) {
                    zergling1.attackZealot(zealot1);
                } else if (target == 2) {
                    zergling1.attackMarine(marine1);
                } else {
                    System.out.println("잘못된 입력값입니다!");
                }
            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if ((zealot1.getHp() <= 0) || (marine1.getHp() <= 0) || (zergling1.getHp() <= 0)) {
                if (selected == 1) {
                    System.out.println("현재 " + zealot1.getName() + "의 \uD83D\uDC94체력이 없어 선택이 불가능합니다.");
                } else if (selected == 2) {
                    System.out.println("현재 " + marine1.getName() + "의 \uD83D\uDC94체력이 없어 선택이 불가능합니다.");
                } else {
                    System.out.println("현재 " + zergling1.getName() + "의 \uD83D\uDC94체력이 없어 선택이 불가능합니다.");
                }
            } else {
                System.out.println("입력값이 잘못됐습니다!");
            }
        }
    }
}
