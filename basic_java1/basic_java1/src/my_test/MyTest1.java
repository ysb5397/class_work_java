package my_test;

public class MyTest1 {
    public static void main(String[] args) {

        // 이전 배웠던 내용 + 복합 대입연산자 활용해서 직접 문제 제작
        // 결과 확인

        // 1. 원기둥 넓이(각 계산마다 소수점 이하 숫자 버림.)
        // 원기둥은 원의 넓이과 높이를 곱한 것과 같고,
        // 원은 파이 * 반지름^2 과 같다.
        // 반지름 r, 높이 h로 가정
        final double PI = 3.14;
        int r = 4;
        int h = 5;

        // 원의 넓이 구하기
        int circleArea = (int)(PI * r * r);

        // 원기둥 넓이 구하기
        int totalArea = circleArea * h;

        // 넓이 출력
        System.out.println("넓이: " + totalArea);

        // 2. 원에 완벽하게 내접한 정사각형의 넓이
        // 원의 넓이는 이미 주어져 있다고 가정한다.
        // 사각형의 넓이는 피타고라스 정리를 이용해보자.

        // 사각형의 한 변을 l이라고 두자.
        // 그렇다면 l을 구하는 공식은 l^2 + l^2 = r^2에서
        // 2l^2 = r^2, 즉, l^2 = r^2/2가 된다.
        // l을 구할 필요 없이, l^2이 이미 사각형 크기이므로 아래와 같다.
        double squareArea = (double)(r * r) / 2;

        System.out.println(squareArea);





    } // end of main
} // end of class
