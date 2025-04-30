package exercise;

public class Exercise4 {
    public static void main(String[] args) {
        // 사각형 면적 구하기
        // 사각형의 한 변 정의하기(ex - 10)
        final int LENGTH = 10;

        // 사각형의 면적(길이^2)
        int area = LENGTH * LENGTH;

        System.out.println("사각형의 면적: " + area);


        //추가
        // 사각형의 가로 길이 상수
        final int WIDTH = 10;
        // 사각형의 세로 길이 상수
        final int HEIGHT = 5;

        //사각형의 면적 계산 식을 만들고 그 연산 결과 값을 area2에 담아보자
        int area2 = WIDTH * HEIGHT;
        System.out.println("사각형의 면적: " + area2);

    } // end of main
} // end of class
