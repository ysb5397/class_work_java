package ch03;

// 논리 연산자, &&, ||, !
// 비교 연산자 (<, <=, ...) 와 함께 많이 사용된다.
// 연산의 결과가 true, false로 반환 된다.

public class Operation5 {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        // 1. 논리 곱 (&&)
        // 참 && 참
        boolean result1 = (n1 > 0) && (n2 > 0);
        System.out.println("1참인가?: " + result1);

        // 참 && 거짓
        boolean result2 = (n1 > 0) && (n2 < 0);
        System.out.println("2참인가?: " + result2);

        // 2. 논리 합 (||)
        // 참 || 거짓
        boolean result3 = (n1 > 0) || (n2 < 0);
        System.out.println("3참인가?: " + result3);

        // 참 || 거짓
        boolean result4 = (n1 < 0) || (n2 < 0);
        System.out.println("4참인가?: " + result4);

        // 2. 부정 (!)
        System.out.println("부정 연산 확인: " + !result4);
        System.out.println("4참인가?: " + result4);



    } // end of main
} // end of class
