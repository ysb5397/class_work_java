package thread;

/**
 * 스레드를 만들어보자
 *  1. 상속을 활용해서 스레드를 만들어보자(작업자 만들어보기)
 */

public class Worker extends Thread {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    // 서브 작업자가 해야할 일은 run() 메서드 안에 재정의 해주어야 한다.
    // 약속된 부분 : start() 메서드를 통해서 스레드 한테 일을 시작하라고 명령을 줄 수 있다.
    // 그러면 다른 스레드가 run() 안에 있는 부분을 수행 시킨다.
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("worker: " + name + " / " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e1) {
                System.out.println("외부에서 신호를 받아서 예외가 발생했습니다.");
                e1.printStackTrace(); // 예외가 발생한 부분을 좀 더 상세히 출력하는 구문(추적)
            }
        }
    }
}
