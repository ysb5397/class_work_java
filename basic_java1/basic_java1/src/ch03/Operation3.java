package ch03;

// 비교 연산자
// 연산의 결과 값은 true, false로 반환 된다.

public class Operation3 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 5;

        // 비교 연산자를 생각할 때, 비교 연산자 자체를 주어로 바라보자.
        // n1이 10, n2가 5인데 오른쪽이 크다고 명시하고 있으므로 false값이 나온다.
        boolean result = n1 < n2;
        System.out.println(result);

        System.out.println(n1 > n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);
        System.out.println(100 <= 100);
        System.out.println(100 == 100);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(5 != 1);
        System.out.println(20 != 20);

        // 연산자 자체를 주어로 바라보자.

    } // end of main
} // end of class
