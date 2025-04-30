package exercise;

public class Exercise1 {
    public static void main(String[] args) {

        // 1. 은행 계좌에 잔액 변수 선언 및 초기화, 출력
        // 출력 결과
        // 현재 계좌 잔액: 7000원
        int balance = 7000;
        System.out.println("현재 계좌 잔액: " + balance + "원");

        // 2. 고객 나이를 변수에 담기 (22)
        // 변수의 이름은 customerAge;
        // 출력 결과
        // 고객 나이: 22세
        int customerAge = 22;
        System.out.println("고객 나이: " + customerAge + "세");

        // 2.1 고객 나이를 28로 변경하고 원래 나이를 다른 변수에 저장해 주세요.
        // 주의. 원래 있던 변수안의 값을 먼저 다른 변수에 저장을 해야 사라지지 않습니다.
        // 새로운 변수에 원래 있던 변수를 대입 연산하자.

        int originalAge = customerAge;
        customerAge = 28;

        // 코드는 위에서 아래로 실행 한다.
        // int originalAge = customerAge;

        System.out.println("수정된 고객 나이: " + customerAge);
        System.out.println("원래 나이(기록용): " + originalAge);

        // 3. 두 변수를 선언을 하고 값을 교환해보자.
        int accountA = 2000;
        int accountB = 4500;

        // 두 변수의 값을 교환을 하려면 어떠한 코드를 작성해야 할까
        // 단 값으로 덮어쓰기 안됨.

        // 임시 값을 담을 수 있는 변수 선언이 필요하다.
        // 2000 = 2000
        int temp = accountA;
        // 4500 = 4500
        accountA = accountB;
        // 2000 = 2000
        accountB = temp;
        System.out.println("accountA: " + accountA);
        System.out.println("accountB: " + accountB);

    } // end of main
} // end of class
