package exercise;

public class Exercise8 {
    public static void main(String[] args) {

        // 1. for 구문으로 1부터 100까지 반복
        // 만약 i값이 33이라면 반복문을 멈추는 코드
        int i = 1;
        for (i = 1; i < 101; i++) {
            if (i == 33) {
                break;
            }
        } // end of for

        System.out.println("최종 i값: " + i);
        System.out.println("----------------");

        // 2. 1부터 10까지 숫자 중에서 홀수면 건너뛰고 짝수만 출력
        // 1은/는 홀수니 패스!
        // 짝수: 2

        for (i=1; i < 11; i++) {
            if ((i % 2) != 0) {
                System.out.println(i + "은/는 홀수니 패스!");
                continue;
            }
            System.out.println("짝수: " + i);
        } // end of for


    } // end of main
} // end of class
