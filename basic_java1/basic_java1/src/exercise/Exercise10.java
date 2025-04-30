package exercise;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        greet("길동");

        int sum1 = square(20);
        System.out.println(sum1);

        String sign1 = signOfNumber(10);
        System.out.println(sign1);

        boolean isAdult = checkAdult(10);
        System.out.println("성인인가요?: " + isAdult);

        int maxNum = findMax(1, 10);
        System.out.println(maxNum);

    } // end of main

    static void greet(String greet) {
        System.out.println("안녕하세요 [" + greet + "] 님!");
    }

    static int square(int n1) {
        int result = n1 * n1;
        return result;
    }

    static String signOfNumber(int n1) {
        if (n1 > 0) {
            return "positive";
        } else if (n1 == 0) {
            return "zero";
        } else {
            return "negative";
        }
    }

    static boolean checkAdult(int n1) {
        if (n1 > 19) {
            return true;
        } else {
            return false;
        }
    }

    static int findMax(int n1, int n2) {
        // 삼항 (조건식) ? A : B;
        int result = (n1 > n2) ? n1 : n2;
        return result;
    }

} // end of class
