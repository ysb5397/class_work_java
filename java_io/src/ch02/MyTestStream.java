package ch02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyTestStream {
    public static void main(String[] args) {
        // 우선 my1.txt 파일을 가져오는 작업
        try (FileInputStream in = new FileInputStream("my1.txt");
             FileOutputStream out = new FileOutputStream("my2.txt", true)) {
            int readData;
            byte[] bytes;
            String writeData = "";
            while ((readData = in.read()) != -1) {
                writeData = writeData.concat(String.valueOf((char)readData));
            }

            writeData = writeData.concat("\n\n이 파일은 가공이 되었으며,\nmy1.txt 파일을 불러 올 때는 1바이트 문자만 가능합니다.\n\n");
            bytes = writeData.getBytes();
            out.write(bytes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
