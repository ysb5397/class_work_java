package ch02;

public class ConstantTest {
    public static void main(String[] args) {

        // int num = 10;
        // 상수를 선언해보자

        // final이라는 키워드를 사용하고, 변수명에 이름을 작성할 때, 대문자 _(언더바)를 쓴다.
        final int MAX_NUM = 100;
        // MAX_NUM = 1; 상수는 한 번 값을 초기화 하면 변경할 수 없다.

        final int MIN_NUM; // 선언 까지는 가능하다.
        MIN_NUM = 10; // 한 번 초기화 된 상태
        // MIN_NUM = 20; 은 불가능

        System.out.println("-------------------------");

        // 원주율 상수 선언
        final double PI = 3.14159;
        // 원의 반지름을 상수로 선언
        final int RADIUS = 5;

        // 원의 둘레 계산
        // 2 * PI * RADIUS
        // 2 * 3.14159 * 10
        double num1 = 2 * PI * RADIUS;
        System.out.println(num1);

        // 원의 면적 계산 공식 (반지름^2 * PI)
        double area = RADIUS * RADIUS * PI;
        System.out.println(area);
    } // end of main
} // end of class
