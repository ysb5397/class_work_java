package com.access;

// bank 클래스를 설계하는 코드
// 계좌
public class Bank {

    // 접근 제어 지시자 (public, default, private)

    //public
    // name 변수는 누구나 어디에서든 접근해서 사용가능
    public String name;

    // default -> 같은 패키지
    int balance;

    // private -> 같은 클래스
    private String number;


    public void showInfo() {
        System.out.println("현재 계좌 번호는: " + number + "입니다.");
    }

}
