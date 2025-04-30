package ch03;


public class Operation10 {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 500;

        int max;

        // n1 > n2에서 n2가 더 크다.(거짓) 따라서 삼항 연산자 규칙에 따라
        // 두 번째인 n2가 max라는 변수에 저장된다.
        max = (n1 > n2) ? n1 : n2;
        System.out.println("결과: " + max);

    } // end of main
} // end of class
