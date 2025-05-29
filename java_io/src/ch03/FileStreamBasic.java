package ch03;

import java.io.*;

public class FileStreamBasic {
    public static void main(String[] args) {
        // 함수 호출
//        writeToFile("basic_output.txt");
        // 함수 호출
        readFromFile("basic_output.txt");
    }

    // 파일로 텍스트를 쓰는 함수(문자 기반 스트림 사용)
    public static void writeToFile(String fileName) {
        /**
         * FileWriter는 문자 기반 출력 스트림으로, 텍스트를 파일에 기록할 수 있다.
         */
        try (FileWriter writer = new FileWriter(fileName)) {
            // 파일에 기록할 텍스트를 선언
            String text = "자바 문자 기반 스트림 예제\n";
            writer.write(text); // 파일이 없다면 새로운 파일 생성, 텍스트를 파일에 쓴다.
            writer.write("추가 문자열을 기록합니다.");

            // 스트림을 비워야 한다.
            writer.flush();

            System.out.println("파일에 텍스트를 잘 기록하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류 : " + e.getMessage());
        }
    } // end

    public static void readFromFile(String fileName) {
        try(FileReader reader = new FileReader(fileName)) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                System.out.print((char)charCode);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류: " + e.getMessage());
        }
    }
}
