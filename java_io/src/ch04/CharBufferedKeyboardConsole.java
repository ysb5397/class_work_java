package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharBufferedKeyboardConsole {
    public static void main(String[] args) {
        /**
         * InputStreamReader는 System.in을 기반으로 사용
         * BufferedReader는 InputStreamReader를 wrap해서 사용
         */

        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter pw = new PrintWriter(System.out);
            BufferedWriter bw = new BufferedWriter(pw)) {

            System.out.println("텍스트를 입력하세요(종료는 빈 줄 입력)");
            String line;

//            readLine 메서드는 한 문자열의 한 줄을 그대로 읽는다.
//            null은 입력의 끝을 의미 한다.(혹시 인텔리제이에서 종료가 안될 때, Ctrl + D나 Ctrl + Z 입력)
            while((line = br.readLine()) != null && !line.isEmpty()) {
                bw.write(line.replace("자바", "JAVA"));
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("스트림 사용 중 오류 발생: " + e.getMessage());
        }
    }
}
