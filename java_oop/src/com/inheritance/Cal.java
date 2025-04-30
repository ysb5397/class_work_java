package com.inheritance;

public class Cal {

    // 메서드를 만들어보자
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }


} // end of class

// xxx.java 자바 파일 하나에 여러 개의 클래스를 선언할 수 있다
// 단 스코프는 분명히 구분 됨
// 중요, 단 하나의 자바 파일에 public 클래스는 오직 하나만 가능

class ChildCal extends Cal {

    // 마이너스 기능
    public int differ(int n1, int n2) {
        return n1 - n2;
    }

    // 곱하기 기능에서 n1과 n2에 0이 들어온다면 0을 입력하지 마시오
    // 라는 문구가 나오도록 요청

    // 상속을 사용했을 때 메서드 오버 라이드 기능이 있음
    // 문법 - 부모 클래스의 메서드 이름과 매개변수 개수 및 타입이 동일해야 함
    public int multiply(int n1, int n2) {
        if ((n1 == 0) || (n2 == 0)) {
            System.out.println("0을 입력하지 마시오.");
        }
        return n1 * n2;
    }

} // end of class