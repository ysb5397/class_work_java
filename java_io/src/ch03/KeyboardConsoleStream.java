package ch03;

import java.io.*;

/**
 *  바이트 단위 스트림
 *  InputStream(System in), OutputStream(System out)
 *  편의성을 높이기 위해 문자 기반 스트림 사용
 *  xxxReader, xxxWriter(문자 기반 형태 네이밍 형식
 */
public class KeyboardConsoleStream {
    public static void main(String[] args) {
        /**
         * InputStreamReader의 read() 메서드는
         * 하나의 문자를 읽어서 그 문자의 유니코드(UTF-8, UTF-16) 값으로(정수) 반환
         *
         *
         */

        // 프로그램 목표: 키보드에서 문자 기반의 스트림을 사용해 코드로 데이터를 읽어보자.
        try(InputStreamReader reader = new InputStreamReader(System.in);
            PrintWriter writer = new PrintWriter(System.out)) {
            int charCode;
            System.out.println("텍스트를 입력하세요.(종료하려면 CTRL+D 입력)");
            while((charCode = reader.read()) != -1) {
//                System.out.print((char) charCode);
                writer.print((char)charCode);
                writer.flush();
            }
            /**
             * 입력된 문자를 콘솔에 출력을 하는데 버퍼를 즉시 지움
             */

        } catch (IOException e) {
            /**
             * 예: 키보드 입력 오류, 콘솔 출력 오류가 여기서 catch됨
             */
            System.out.println("입출력 중 오류 발생");
        }
    }
}
