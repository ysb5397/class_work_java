package thread;

public class Worker2MainTest {

    public static void main(String[] args) {

        // 상속을 활용한 스레드 생성
//        Worker worker1 = new Worker("워커");
//        worker1.start();

        // 인터페이스를 활용해서 스레드 start()
        Worker2 worker2 = new Worker2();
        // 인터페이스를 사용했을 때 start() 메서드가 없어서 실제 동작을 못 시킴
        // worker2.start();
        Thread subT1 = new Thread(worker2);
        subT1.start();



    }



}
