package ch02;

// 증감, 감소 연산자 ++, -- (변수에 접근해서 그 값을 오직 1을 증가, 감소)

public class Operation3 {
    public static void main(String[] args) {

        int a = 1;
        a++; // 오직 1을 증가시킨다
        System.out.println("a: " + a);

        int b = 1;
        b--; // 오직 1을 감소시킨다.
        System.out.println("b: " + b);

        int c = 100;
        // 전위 감소 연산자
        // 후위 감소 연산자
        System.out.println(--c);
        System.out.println(c); // 실제 변수의 값이 변경 되었을까?

    } // end of main
} // end of class
