package ch04;

import java.io.*;

public class BufferedKeyboardToFile {
    public static void main(String[] args) {
        String targetFile = "test.txt";
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter(System.out);
             FileWriter fw = new FileWriter(targetFile, true)) {

            String text;
            System.out.println("문자를 입력해주세요.");
            while ((text = br.readLine()) != null && !text.trim().isEmpty()) {
                pw.write(text.concat(" 입력!\n"));
                pw.flush();
                fw.write(text.concat("\n"));
                fw.flush();
            }

            // 아래에 주석으로
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("스트림 작업 중 오류 : " + e.getMessage());
        }
    }
}
