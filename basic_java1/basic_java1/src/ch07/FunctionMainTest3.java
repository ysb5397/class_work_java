package ch07;


public class FunctionMainTest3 {

    public static void main(String[] args) {


        // 덧셈 연산
        int sum1 = sum(10,2);
        System.out.println(sum1);

        // 뺄셈 연산
        int differ1 = differ(6,7);
        System.out.println(differ1);

        // 곱셈 연산
        int mul1 = mul(15,-2);
        System.out.println(mul1);

        // 나눗셈 연산
        int div1 = div(8,4);
        System.out.println(div1);

    } // end of main

    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static int differ(int n1, int n2) {
        return n1 - n2;
    }

    static int mul(int n1, int n2) {
        return n1 * n2;
    }

    static int div(int n1, int n2) {
        return n1 / n2;
    }
} // end of class
