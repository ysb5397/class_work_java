package thread;

/**
 *  각 스레드가 공유하는 자원 만들어보기 (shared Resource) - 공유자원
 */

public class BankAccount {

    private int money = 100_000;

    private int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void deposit(int money) {
        int currentMoney = getMoney();
        // 동기화 블록

        synchronized (this) {

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//        this.money += money;
            setMoney(currentMoney + money);
            System.out.println("ATM 현재 잔액(입금): " + getMoney());
        }
    }

    // 동기화 메서드
    public synchronized int widthDraw(int money) {
        int currentMoney = getMoney();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if ((currentMoney < money)) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        } else {
//            this.money -= money;
            setMoney(currentMoney - money);
            System.out.println("ATM 현재 잔액(출금): " + getMoney());
            return 0;
        }
    }
}
