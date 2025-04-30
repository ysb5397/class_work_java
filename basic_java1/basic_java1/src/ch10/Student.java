package ch10;

public class Student {

    String name; // 이름
    int money; // 소지금

    // 매개 변수 2개를 받는 생성자를 만들어보자.
    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 학생이 버스를 탄다 --> 메서드
    public void takeBus(Bus bus) {
        // 천원
         bus.take(1000);
         // 버스에 천원을 내고 멤버 변수 money (천원 빼기)
        money -= 1000;
    }


    // 학생이 지하철을 탄다.

    // 학생의 상태창을 보여준다.
    public void showInfo() {
        System.out.println("-----상태창-----");
        System.out.println("학생 이름: " + name);
        System.out.println("학생 소지금: " + money);
    }
}
