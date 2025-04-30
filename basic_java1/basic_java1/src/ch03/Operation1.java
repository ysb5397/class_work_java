package ch03;

public class Operation1 {
    public static void main(String[] args) {

        // 은행 계좌의 초기 잔액 설정
        double balance = 1000.0;
        // 문자열형 + 실수형 = 문자열형(리턴값)
        System.out.println("초기 잔액: " + balance + "원");

        // 1. 입금 : 5000원을 계좌에 추가(원래 있던 금액에서)

        // 복합 대입 연산자를 사용해 보자.
        //balance = balance + 5000.0;
        balance += 5000;

        //실수 + 정수 = 실수(리턴값)
        System.out.println("계좌 잔액: " + balance + "원");

        // 2. 출금(2000원 사용)
        // balance = balance - 2000;
        balance -= 2000;
        System.out.println("계좌 잔액: " + balance + "원");

        // 잔액을 1000원 단위로 나누어 몫 계산 (예: 1천원 쿠폰으로 교환 가능한 횟수)
        int coupons = (int)(balance / 1000);
        System.out.println("쿠폰 " + coupons + "장");
        System.out.println("계좌 잔액: " + balance + "원");

//        balance = balance % 1000.0;
        balance %= 1000.0;
        System.out.println("쿠폰 교환 후 잔액: " + balance + "원");

        // 곱하기
//        System.out.println(balance *= 2);
//        System.out.println(balance);

        // 정리
        // 복합 대입 연산자는 코드를 간결하게 만들고 변수에 값을 바로 업데이트 한다.
        // 또한 실수 가능성을 줄일 수 있다.

    } // end of main
} // end of class
