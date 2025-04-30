package com.starcraft_v01;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 실행의 흐름 만들어 보기
        Zealot zealot1 = new Zealot("질럿1");
        Marine marine1 = new Marine("마린1");

        while (true) {
            System.out.printf("1. 질럿 / 2. 마린 / 3. 저글링 중 해당되는 번호를 입력해주세요.\n입력: ");
            int selected = input.nextInt();

            if (selected == 1) {
                System.out.println("누구를 공격하시겠습니까?");
                System.out.printf("1. 마린 / 2. 저글링\n입력: ");

                int target = input.nextInt();
                if(target == 1) {
                    zealot1.attackMarine(marine1);
                } else {

                }
            } else if (selected == 2) {

            } else if (selected == 3) {

            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("입력값이 잘못됐습니다!");
            }
        }

        // zealot1.attackZergling(marine);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        zealot1.attackMarine(marine1);
        marine1.showInfo();




    }
}
