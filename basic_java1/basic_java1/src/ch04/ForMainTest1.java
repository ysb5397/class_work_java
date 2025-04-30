package ch04;

public class ForMainTest1 {
    public static void main(String[] args) {

        // 반복문 - 반복적인 패턴이 보인다면 반복문을 생각해보자.

        // 0부터 9까지 출력하시오.
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        System.out.println("---------------------------");
        // 초기화 식, 조건식, 증감식
        int i;
        for(i = 0; i < 10; i++) {
            // 수행 구문, 조건식이 true라면 실행
            // 변수 i로 대입
            // 1. i = 0
            // 2. i = 1
            // 3. i = 2
            // 4. i = 3
            // 5. i = 4
            // 6. i = 5
            // 7. i = 6
            // 8. i = 7
            // 9. i = 8
            // 10. i = 9
            // 11. i = 10
            System.out.println(i);
        } // end of for

        System.out.println("최종 i값: " + i);
    } // end of main
} // end of class
