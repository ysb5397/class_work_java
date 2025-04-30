package com.access;

public class Account {

    private String name;
//    int balance; // 수정 전
    private int balance;

    // getter, setter 메서드 만들기
    // 외부에서 balance 값을 리턴 받을 수 있는 메서드
    // 변수 앞에 get 이라는 단어를 붙인다(선언 X)
    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    // 입금
    public void deposit(int money) {
        balance += money;
    }

    // 출금
    public void withdraw(int money) {
        // TODO 방어적 코드
        balance -= money;
    }

    // 잔액 출력
    public void showInfo() {
        System.out.println("현재 계좌 잔액은 " + balance + "원 입니다.");
    }

    // setter 메서드
    public void setBalance(int b) {
        // 메서드를 통하면 방어적 코드가 가능
        if (b > 0) {
            balance = b;
        }
        System.out.println("음수를 넣을 수 없습니다.");
    }

    public void setName (String n) {
        name = n;
    }

}
