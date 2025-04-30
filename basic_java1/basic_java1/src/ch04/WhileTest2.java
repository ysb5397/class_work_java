package ch04;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("종료하고 싶은 정수값을 입력하시오: ");

        // for 문을 사용 했을 때 1~10까지의 총합 : 55
        // 위 내용을 while 구문으로 만들어서 출력
        // 1부터 77까지 총합
        int i = 1;
        int sum = 0;
        final int END = sc.nextInt();
        while (i <= END) {
            sum += i;
            // 조건식에 대한 처리를 잘 확인하자.
            i++;
        }

        System.out.println("총합: " + sum);

    } // end of main
} // end of class
