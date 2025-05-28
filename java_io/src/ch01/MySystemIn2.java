package ch01;

import java.io.IOException;

/**
 *  입력 스트림, 키보드에서 프로그램으로 데이터가 들어온다.(스트림을 통해)
 *  기능을 확장해보자.
 */
public class MySystemIn2 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 enter를 누르세요");

        int i = 0;

        try {
            // 키보드에서 엔터는 \n 로 표현
            while((i = System.in.read()) != '\n') {
                // 읽은 바이트의 정수값을 출력
                System.out.println("i : " + (char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
