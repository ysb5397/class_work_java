package ch03;


public class Operation9 {
    public static void main(String[] args) {

        int number = 7; // 테스트 할 숫자

        // 1. 삼항 연산자로 홀/짝 판단
        // 문자열 String --> "예시입니다"
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println("1결과: " + result);

        boolean isOk = (5 > 3) ? true : false;
        System.out.println("2결과: " + isOk);

        // 두 수 중에 큰 수를 max 라는 변수에 담고 출력
        int max = (10 > 1) ? 10 : 1;
        System.out.println("큰 수: " + max);

    } // end of main
} // end of class
