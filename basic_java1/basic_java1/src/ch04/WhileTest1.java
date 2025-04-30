package ch04;

public class WhileTest1 {
    public static void main(String[] args) {

        int i = 1;
        // 괄호 안에 조건식 필요(값은 true 또는 false)
        while (i <= 3) {
            System.out.println("i값: " + i);
            // while 구문을 작성할 때 무한 루프를 조심하자
            // 조건식에 처리가 없다면 무한히 반복한다
            i++;
        }

        // 1회차 - 출력, i에 +1, while(조건식 확인) - 2
        // 2회차 - 출력, i에 +1, while(조건식 확인) - 3
        // 3회차 - 출력, i에 +1, while(조건식 확인) - 4
        System.out.println("while이 끝나고 난 i값: " + i);

    } // end of main
} // end of class
