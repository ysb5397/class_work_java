package exercise;

public class TestTraining {
    public static void main(String[] args) {

        // 등차수열 구하기
        // 등차수열은 a + (n-1)d 로 구할 수 있다.
        // a는 초항, d는 공차, n은 회차 정도로 나타낸다.
        // a를 1, d를 3으로 뒀을 때, 2025번째 값은?
        final int A = 2;
        final int D = 3;
        int n = 2015;

        // 계산하기
        int result = (A + (n-1) * D);

        // 결과 도출
        System.out.println("등차수열 계산결과: " + result);

    } // end of main
} // end of class