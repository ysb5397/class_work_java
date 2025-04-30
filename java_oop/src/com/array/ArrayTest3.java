package com.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {

    public static void main(String[] args) {

        // 난수 발생 기능 - 랜덤한 숫자를 하나 만들어주는 도구
        // 자바 개발자들이 미리 만들어 준 기능
        Random random = new Random();
        // 문서 --> 구글링 --> AI
        // 0~44 까지 랜덤한 숫자를 하나 발생해준다.
        // +1 함으로써 1~45 가능

        // 배열과 for문을 이용하여 코드 수정
        int ranInt1 = 1 + random.nextInt(45);
        int ranInt2 = 1 + random.nextInt(45);
        int ranInt3 = 1 + random.nextInt(45);
        int ranInt4 = 1 + random.nextInt(45);
        int ranInt5 = 1 + random.nextInt(45);
        int ranInt6 = 1 + random.nextInt(45);
        System.out.println();

        // 배열 선언
        int[] ranInt = new int[6];

        // for문으로 ranInt라는 배열에 i돌리면서 랜덤값 넣기(1~45)
        for (int i = 0; i < ranInt.length; i++) {
            ranInt[i] = 1 + random.nextInt(45);
            System.out.println(ranInt[i]);
        }

        System.out.println("------------------");

        // 확률적 공격 구문(난수와 while로 반복)
        Scanner input = new Scanner(System.in);
        int isAttacked;

        while(true) {
            System.out.println("적을 공격하시겠습니까?");
            System.out.printf("1. 예 / 2. 아니오\n입력: ");
            int choice = input.nextInt();
            isAttacked = random.nextInt(2);

            if ((choice == 1) && (isAttacked == 1)) {
                System.out.println("당신은 적에게 공격을 가했습니다.");
                System.out.println("그리고 적도 당신에게 공격을 가했습니다.");
            } else if ((choice == 1) && (isAttacked == 0)) {
                System.out.println("당신은 적에게 공격을 가했습니다.");
                System.out.println("하지만 적은 당신에게 공격을 하지 못했습니다.");
            } else if ((choice == 2) && (isAttacked == 1)) {
                System.out.println("당신은 보복이 두려워 적을 공격하지 않았습니다.");
                System.out.println("하지만 적은 당신에게 공격을 가했네요.");
            } else if ((choice == 2) && (isAttacked == 0)) {
                System.out.println("당신은 보복이 두려워 적을 공격하지 않았습니다.");
                System.out.println("그리고 적도 당신에게 공격을 하지 못했습니다. 그야말로 평화롭군요.");
            } else if ((choice <= 0) || (choice >= 3)) {
                System.out.println("당신은 뭘 하고 싶은 거죠? 다시 입력해주세요.");
            }
        }





    }

}
