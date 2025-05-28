package ch02;

import java.io.FileInputStream;

public class MyFileInputStream2 {
    public static void main(String[] args) {
        // a.txt 파일에서 바이트 단위로 데이터를 읽어서 콘솔창에 출력
        // 주의: 한글을 3바이트 기반이라 1바이트씩 읽으면 깨진다.
        try(FileInputStream in = new FileInputStream("a.txt");) {
            // 사전 기반 지식
            // 파일에서 바이트 단위로 데이터를 읽을 때 더 이상 읽을게 없다면,
            // 정수값 -1 을 반환한다.
            int readData;
            while((readData = in.read()) != -1) {
                System.out.print((char)readData);
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
