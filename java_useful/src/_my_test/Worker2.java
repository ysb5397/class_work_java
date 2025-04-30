package _my_test;

// 인터페이스 Runnable 를 이용
public class Worker2 implements Runnable {

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();
    }

    @Override
    public void run() {
        for (int i = 59; i > 0; i--) {
            try {
                System.out.println("남은 시간: " + i + "초");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
