package thread;

public class BankAccountMainTest {

    // 메인 스레드
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Father father = new Father(bankAccount);
        Mother mother = new Mother(bankAccount);

        // 아버지가 입금 요청
        father.start(); // 3초

        // 어머니가 출금 요청
        mother.start(); // 0.5초

        // 입금, 출금, 동일한 계좌에서 처리
        // 10만원 + 1만원 - 5천원 = 10만 5천원
        // 주의! 멀티 스레딩 프로그램을 구성할 때 race condition 상태를 만들어 낼 수 있음

        // 의도치 않은 결과를 발생 시킬 수 있다.

    }

}
