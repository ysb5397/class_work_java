package com.access;

import java.util.Scanner;

public class HeroTest {

    public static void main(String[] args) {

        // 생성자를 통한 히어로 생성
        Hero h1 = new Hero("슈퍼맨",20,50,30,false);
        h1.showInfo();

        // setter를 통해 이름 변경 후 스테이터스 출력
        h1.setName("배트맨");
        h1.showInfo();

        // getter를 통해 사망 여부의 값을 가져오고 출력
        boolean outerIsDie = h1.getIsDie();
        System.out.println("--------------");
        System.out.println("사망 여부: " + outerIsDie);

        // 스캐너 생성
        Scanner text = new Scanner(System.in);

        // 이름 입력해서 바꾸기
        System.out.print("이름을 입력해서 바꿔보세요: ");
        h1.setName(text.next());

        // 스테이터스 출력
        h1.showInfo();




    }
}
