package ch04;

public class ForMainTest3 {
    public static void main(String[] args) {

        // 1 ~ 50 정수값 출력, 만약 짝수이면 출력하라.
        // 반복문에 if 구문을 활용해서 제어 구문을 제어할 수 있다.
        for(int i = 1; i < 51; i++) {
            if ((i % 2) == 1) {
                // 특정 수를 2로 나누었을 때 몫이 0이면 짝수이다
                System.out.println(i);
            }
        } // end of for

        // 1부터 10까지 전부 합하기
//        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("총 합: " + sum);

    } // end of main
} // end of class
