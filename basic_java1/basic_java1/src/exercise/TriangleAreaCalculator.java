package exercise;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        // 삼각형의 면적을 구하는 코드 작성
        // 삼각형 밑면을 상수로 선언
        final double BASE = 10.0;

        // 삼각형 높이를 상수로 선언
        final double HEIGHT = 5.0;

        // 결과 도출
        double area = (BASE * HEIGHT) / 2;
        System.out.println("삼각형의 면적: " + area);

    } // end of main
} // end of class
