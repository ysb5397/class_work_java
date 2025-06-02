package _client_socket.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *  클라이언트 측 코드
 *  양방향 통신 구현 (1:1 채팅)
 */
public class ClientFile02 {
    public static void main(String[] args) {
        // 준비물
        // 1. 연결해야할 IP 주소와 포트 번호 필요
        // 2. 소켓 필요
        // 3. 출력 스트림
        // 4. 입력 스트림

        // 1. 소켓 생성
        Socket socket = null;

        try {
            socket = new Socket("localhost", 5000);
            System.out.println("서버와 연결되었습니다.");

            // 서버로 데이터를 전송할 스트림이 필요 + 문자 기반 스트림으로 확장
            // writer -> 데이터를 전송할 수 있다.
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 서버로부터 데이터를 입력받을 스트림이 필요 + 문자 기반 스트림으로 확장
            // reader -> 데이터를 읽을 수 있다.
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 데이터 송신해보기
            writer.write("\uD83D\uDC68\u200D\uD83D\uDE80 \uD83D\uDE80\n");
            writer.flush();

            // 데이터 수신해보기
            String message = reader.readLine();
            System.out.println("서버에서 온 메시지: " + message);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.err.println("소켓 닫기 실패");
                    e.printStackTrace();
                }
            }
        }
    }

}
