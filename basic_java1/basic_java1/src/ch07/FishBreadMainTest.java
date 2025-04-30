package ch07;

// 규칙, 모든 자바 코드는 클래스라는 영역
public class FishBreadMainTest {

    public static void main(String[] args) {

        // 지역 변수
        int a = 10;
        System.out.println(a);

        // 클래스 이름 + 변수명 = new 클래스 이름();
        FishBread fb1 = new FishBread();
        FishBread fb2 = new FishBread();
        // 인스턴스화(메모리에 올림) -> 인스턴스(객체)
        System.out.println(fb1);
        System.out.println(fb2);

        fb1.price = 500;
        fb2.price = 1000;

        System.out.println(fb1.price);
        System.out.println(fb2.price);


    } // end of main
} // end of class
