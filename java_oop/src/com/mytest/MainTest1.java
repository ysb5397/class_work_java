package com.mytest;

import com.access.Bank;

public class MainTest1 {
    public static void main(String[] args) {
        Bank bank2 = new Bank();
        // 이 Bank는 access 패키지에 존재한다
        // 현재 패키지는 mytest이다

//        bank2.balance; // -> default 이므로 접근X
        bank2.name = "hi"; // public은 어디에서나 가능
    }
}
