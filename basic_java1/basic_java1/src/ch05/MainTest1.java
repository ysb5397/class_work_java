package ch05;

public class MainTest1 {
    public static void main(String[] args) {

        // JVM 가상 메모리 공간 존재
        // 1. JVM Stack 메모리 공간이 있다
        // 2. Heap 이라는 동적 메모리 공간이 있다

        // Heap이라는 동적 메모리 공간에 있다
        Book bookBox1 = new Book();

        // 스택 메모리 공간에 존재한다.
        int n1 = 10;


    } // end of main
} // end of class

