package ch04;

public class BreakTest1 {
    public static void main(String[] args) {

        int i;
        for (i = 1; i < 11; i++) {
            // i값이 7의 소수라면 멈추어라
            // 만약 i값이 7이라면 반복문을 멈추어라
            System.out.println("i값: " + i);
            if ((i % 7) == 0) {
                break;
            }
        } // end of for
        //break문이 발동됐을 때의 i값은?
        System.out.println("반복문이 끝났을 때의 i값: " + i);

    } // end of main
} // end of class
