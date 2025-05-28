package ch02;

import java.io.FileOutputStream;

/**
 *  파일 출력 스트림 사용
 */
public class MyFileOutputSystem {
    public static void main(String[] args) {
        String data = "Hello, Java FileOutputSystem2 테스트 중입니다.\n";

        // 대상 파일이 없다면 설정된 이름의 파일을 생성하고 데이터를 넣는다.
        // 그리고, 파일이름과 두번째 boolean은 append 할건지를 설정하는 것이므로
        // true일 경우, 덮어 씌워지는게 아니라 밑줄에 추가로 생성된다.
        try (FileOutputStream out = new FileOutputStream("output.txt", true)) {
            // 문자열 data에 있는 값을 byte 배열로 변환
            byte[] dataBytes = data.getBytes();

            // 바이트 단위로 파일에 데이터를 넣는다.
            out.write(dataBytes);
            System.out.println("파일 출력이 완료되었습니다.");

            // 참고: output.txt 파일을 열었을 때 텍스트로 보이는 이유는 에디터가 바이트 데이터를
            // 문자로 해석해서 보여줬기 때문이다.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
