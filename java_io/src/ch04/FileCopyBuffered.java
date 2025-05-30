package ch04;

import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        // 파일 경로 지정
        String sourceFilePath = "employees.zip";
        String destinationFilePath = "employees_copy.zip";

        // 소요 시간 측정
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath);
             BufferedInputStream bfis = new BufferedInputStream(fis);
             BufferedOutputStream bfos = new BufferedOutputStream(fos)) {

            byte[] bytes = new byte[1024];
            int data;
            while((data = bfis.read(bytes)) != -1) {
                bfos.write(bytes, 0, data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }

        // 소요 시간 계산
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("소요시간: \n" + duration + "나노초\n");
        System.out.println(duration / 1_000_000_000 + "초");
    }
}
