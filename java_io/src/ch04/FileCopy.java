package ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        // 파일 복사 기능
        // 파일 경로 지정
        String sourceFilePath = "employees.zip";
        String destinationFilePath = "employees-copy.zip";

        // 소요 시간
        long startTime = System.nanoTime();

        // 바이트 기반 스트림으로 데이터를 다룰 수 있다.
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
            // 한 바이트씩 읽어서 한 바이트씩 조회
            int data;
            byte[] bytes = new byte[8192]; // 1바이트에서 8192바이트로 출력 -> 속도가 엄청 빨라짐
            while((data = fis.read(bytes)) != -1 ) {
                fos.write(bytes, 0, data); // 읽은 바이트를 파일에다가 출력
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // 소요 시간을 나노초와 초 단위로 출력
        double seconds = duration / 1_000_000_000.0;
        System.out.println("입력스트림 --> 출력 스트림을 통해 파일 복사완료!\n소요 시간: " + duration + "ns(나노초) / " + seconds + "s(초)");
    }
}
