package com.starcraft_v03;

import java.util.Random;
import java.util.Scanner;

public class GameTest1 {

    public static void main(String[] args) {

        // 실행의 흐름
        // 배열, 객체, for... 다형성

        Unit[] units = new Unit[9];
        units[0] = new Zealot("질럿_기본", 7, 80, 5, "질럿의 기본 유닛입니다.");
        units[1] = new Zealot("질럿_스킬+", 6, 75, 5, "30% 확률로 3턴간 적 자해를 유발하는 스킬을 지닌 질럿의 강화 유닛입니다.");
        units[2] = new Zealot("질럿_극한", 7, 75, 5, "10% 확률로 6턴간 적 자해 유발하는 스킬을 지닌 질럿의 극한 유닛입니다.");
        units[3] = new Marine("마린_기본", 7, 55, 10, "마린의 기본 유닛입니다.");
        units[4] = new Marine("마린_스킬+", 5, 55, 10, "1% 확률로 적을 즉사 시키는 스킬을 가진 마린의 강화 유닛입니다.");
        units[5] = new Marine("마린_극한", 4, 45, 15, "2% 확률로 적을 즉사 시키는 스킬을 가진 마린의 극한 유닛입니다.");
        units[6] = new Zergling("저글링_기본", 4, 50, 10, "저글링의 기본 유닛입니다.");
        units[7] = new Zergling("저글링_스킬+", 3, 50, 10, "공격 시 1~3회 랜덤 타격을 하는 스킬을 가진 저글링의 강화 유닛입니다.");
        units[8] = new Zergling("저글링_극한", 2, 50, 10, "공격 시 1~6회 랜덤 타격을 하는 스킬을 가진 저글링의 극한 유닛입니다.");

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Random random = new Random();
        int characterChoice;
        int characterTypeChoice = 0;
        int win = 0;
        int lose = 0;

        // 캐릭터 하나를 선정해 자동으로 선택된 적과 끝까지 싸우기.
        // 위 게임 플레이를 목표로 해보자.
        while(flag) {
            System.out.printf("1. 질럿 / 2. 마린 / 3. 저글링 중 선택할 유닛 하나를 선택해주세요.(프로그램 종료는 0번입니다.)\n입력: ");
            characterChoice = scanner.nextInt();

            if (characterChoice == 1) {
                System.out.println("질럿을 선택했습니다.");
                zealotAttack(scanner, characterTypeChoice, win, lose);
            } else if (characterChoice == 2) {
                System.out.println("마린을 선택했습니다.");
                marineAttack(scanner, characterTypeChoice, win, lose);
            } else if (characterChoice == 3){
                System.out.println("저글링을 선택했습니다.");
                zerglingAttack(scanner, characterTypeChoice, win, lose);
            } else if (characterChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;
            } else {
                System.out.println("올바른 숫자를 입력해주세요.");
            }
        }
    }

    public static void zealotAttack(Scanner scanner, int characterTypeChoice, int win, int lose) {
        System.out.printf(" 중 선택할 유닛 하나를 선택해주세요.(프로그램 종료는 0번입니다.)\n입력: ");
        characterTypeChoice = scanner.nextInt();
    }

    public static void marineAttack(Scanner scanner, int characterTypeChoice, int win, int lose) {

    }

    public static void zerglingAttack(Scanner scanner, int characterTypeChoice, int win, int lose) {

    }
}
