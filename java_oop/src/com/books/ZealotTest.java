package com.books;

// import로 가져올 수 있음
import com.starcraft_v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5];

        // 반복문 사용하지 말고 질럿 3마리 만들기 0, 1, 3 인덱스
        zealots[0] = new Zealot("질럿1");
        zealots[1] = new Zealot("질럿2");
        zealots[3] = new Zealot("질럿4");

        // 0번째 인덱스에 주솟값을 넣어둔 질럿의 기능 showInfo 호출
        zealots[0].showInfo();
        // print에서 showInfo를 출력하려고 하면 void값이라 출력이 안된다

        System.out.println("---------------------");

        // 반복문을 활용하여 배열안에 있는 질럿들의 showInfo를 호출
        for (int i = 0; i < zealots.length; i++) {
            if (zealots[i] != null) {
                zealots[i].showInfo();
            }
        }


    }


}
