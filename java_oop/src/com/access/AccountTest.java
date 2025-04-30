package com.access;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10000);
        account.withdraw(6000);
        account.showInfo();

        // 접근 제어지시자 문법, 왜 사용?

        // 신입 개발자가 실수로 메서드를 통해서 코드를 작성한게 아닌
        // 멤버 변수를 직접 수정하는 코드 작성
//        account.balance = 10000;
        account.showInfo();
        // 실수 할 가능성이 있다.
        // balance라는 변수를 외부에서 안보이게 접근 차단
        // private 를 선언해서 클래스 전용으로 차단

        // 외부에서는 오직 출금 기능, 입금 기능 메서드로만 사용 가능

        // >>> 현재 잔액 <<< ---> 출력하고 싶음
//        int n1 = account.balance;
        int outerBalance = account.getBalance();
        System.out.println(">>>> 현재 잔액: " + outerBalance + " <<<<");

        // 멤버 변수에서 String은 값이 없으면 null을 준다.
        System.out.println(account.getName());
//        String outerName = account.getName();

        // setter 메서드 사용
        account.setBalance(0);
        account.showInfo();
    }
}
