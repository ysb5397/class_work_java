package ch04;

public class ForMainTest2 {
    public static void main(String[] args) {

        // 2 * 1 = 2
        // 2 * 2 = 4
        // 2 * 3 = 6
        // ...
        // 2 * 9 = 18
        // 화면에 구구단 2단을 출력하시오
        // 1. 변수의 활용(효용)
        int num = 2;
        System.out.println(num + " * 1 = " + (num * 1));
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println("----------------------------");

        // 화면에 3단
        num = 3;
        System.out.println(num + " * 1 = " + (num * 1));
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println("----------------------------");

        // 화면에 4단
        num = 4;
        System.out.println(num + " * 1 = " + (num * 1));
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println("----------------------------");

        // 5단 출력
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        num = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        } // end of for
        System.out.println("----------------------------");

        // 6단
        num = 6;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        } // end of for
        System.out.println("----------------------------");

        // 7단
        num = 7;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        } // end of for
        System.out.println("----------------------------");

        // 8단
        num = 8;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        } // end of for
        System.out.println("----------------------------");

        // 9단
        num = 9;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        } // end of for

    } // end of main
} // end of class
