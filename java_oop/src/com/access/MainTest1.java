package com.access;

public class MainTest1 {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
//        bank1.number;은 private 이므로 같은 패키지더라도
//        보이지 않는다
        bank1.balance = 1000; // 이 변수는 default 이므로 보인다
    }

}
