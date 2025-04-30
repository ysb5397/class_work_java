package ch04;

public class ForMainTest4 {
    public static void main(String[] args) {

        // 1부터 100까지 중에서 홀수의 총합을 구하시오
        // 1 + 3 + 5 + ... + 99 = ?

        int sum = 0;
        int totalSum = 0;
        for (int i = 1; i < 101; i++) {
            if ((i % 2) == 1) {
                System.out.println("홀수 확인: " + i);
                sum += i;
            }
            totalSum += i;
        } // end of for

        // 검산 할 때, 홀수끼리의 합은 끝과 끝이 항상 100으로 동일하다
        // 예시 -> 1 + 99, 3 + 97
        // 또한 이런 쌍들은 모두 25개이므로 25 * 100 해서 2500이 나오면 정확하다.
        System.out.println("홀수 총합: " + sum);
        System.out.println("전체 총합: " + totalSum);

        System.out.println("---------------");
        // 반복을 사용할 때, 증감식에 꼭 1만 증가 시키는건 아니다(활용)
        // 2, 4, 6...100 출력
//       for (int i = 2; i <= 100; i = i + 2) {
//
//        } // end of for

        // 2씩 증가 반복
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("결과값: " + i);
        } // end of for
        System.out.println("--------------------------");

        // 10, 9 , 8 , 7...1까지 출력
        // for 구문 10번 반복( 내용을 수정 )
        for (int i = 10; i > 0; i--) {
            System.out.println("출력값: " + i);
        } // end of for

    } // end of main
} // end of class
