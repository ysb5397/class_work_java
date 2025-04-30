package com._static;

public class PrinterTest1 {

    public static void main(String[] args) {

        int a = 10;
//        static int b = 20;
        // static 변수는 태양이다.
        // 단, 순서가 있다. 프로그램을 실행했을 때, class가 우선이다.

        NumberPrinter n1 = new NumberPrinter(1);
        NumberPrinter n2 = new NumberPrinter(2);

        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();



    }
}
