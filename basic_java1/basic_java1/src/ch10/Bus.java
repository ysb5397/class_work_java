package ch10;

public class Bus {

    int busNumber;
    int count;
    int money;

    // 생성자
    public Bus(int number) {
        busNumber = number;
        // 객체 생성 시에 실행되는 부분
    }


    //승객을 태우다
    // 메서드
    public void take(int pay) {
        money += pay;
        count++;
    }

    public void showInfo() {
        System.out.println("----------상태창---------");
        System.out.println("버스 호선: " + busNumber);
        System.out.println("버스 승객 수: " + count);
        System.out.println("버스 수익금: " + money);
    }

}
