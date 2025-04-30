package my_test;

public class MyTest2 {
    public static void main(String[] args) {

//        int n1;
//        int n2;
//        for (n2 = 2; n2 < 10; n2++) {
//            for (n1 = 1; n1 < 11; n1++) {
//                if (n1 < 10) {
//                    System.out.println(n2 + " * " + n1 + " = " + (n1 * n2));
//                } else {
//                    System.out.println("----------------------");
//                }
//            } // end of for
//        } // end of for

        int n1 = 1;
        int n2;
        for (n2 = 2; n2 < 10; ) {
            if (n1 < 10) {
                System.out.println(n2 + " * " + n1 + " = " + (n1 * n2));
                n1++;
            } else {
                System.out.println("----------------------");
                n2++;
                n1 = 1;
            }
        } // end of for

    } // end of main
} // end of class