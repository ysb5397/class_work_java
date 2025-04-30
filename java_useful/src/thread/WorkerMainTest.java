package thread;

public class WorkerMainTest {
    // 메인 스레드
    public static void main(String[] args) {

        // 사용하는 방법
        System.out.println("----------- 메인 스레드 시작 -----------");
        // 현재 스레드가 누구인지 알아보는 명령어
        System.out.println(Thread.currentThread()); // [#1],main,.....

        // 작업자 하나 만들어 보기
        Worker worker1 = new Worker("작업자 1");
        worker1.start(); // 너가 위임받은 일을 시작해

        System.out.println("----------- 메인 스레드 종료 -----------");

    }
}
