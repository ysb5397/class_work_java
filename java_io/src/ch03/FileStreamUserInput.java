package ch03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileStreamUserInput {
    public static void main(String[] args) {
        writeUserInputToFile("result.txt");
        readFromFile("result.txt");
    } // end of main

    // 키보드에서 입력을 받아 파일에 쓰는 함수를 만들어 보세요
    public static void writeUserInputToFile(String fileName) {
        try(OutputStreamWriter writer = new FileWriter(fileName);
            Scanner scanner = new Scanner(System.in)) {
            String text;

            text = scanner.nextLine();
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.err.println("코드 실행 중 오류 발생: " + e.getMessage());
        }
    }

    // 파일에서 텍스트를 읽는 함수 만들어 보기
    public static void readFromFile(String fileName) {
        try(FileReader reader = new FileReader(fileName)) {
            int charCode;
            System.out.println("파일의 내용은 다음과 같습니다.");
            while ((charCode = reader.read()) != -1) {
                System.out.print((char)charCode);
            }
        } catch (IOException e) {
            System.err.println("코드 실행 중 오류 발생: " + e.getMessage());
        }
    }
}
