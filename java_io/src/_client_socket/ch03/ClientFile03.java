package _client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *  클라이언트 측 코드
 *  양방향 통신 구현 (1:1 채팅)
 *  키보드에서 값을 받아 데이터를 보내기
 */
public class ClientFile03 {
    public static void main(String[] args) {
        // 준비물
        // 1. 연결해야할 IP 주소와 포트 번호 필요
        // 2. 소켓 필요
        // 3. 출력 스트림
        // 4. 입력 스트림

        // 1. 소켓 생성
        try (Socket socket = new Socket("192.168.0.132", 5000);
            Scanner scanner = new Scanner(System.in);

             // 서버로 데이터를 전송할 스트림이 필요 + 문자 기반 스트림으로 확장
             // writer -> 데이터를 전송할 수 있다.
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

             // 서버로부터 데이터를 입력받을 스트림이 필요 + 문자 기반 스트림으로 확장
             // reader -> 데이터를 읽을 수 있다.
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("서버와 연결되었습니다.");

            // 데이터 송신해보기
            while(true) {
                System.out.println("\uD83D\uDCE2 서버에 보낼 메시지를 입력해주세요.");

                String sendMessage = scanner.next();
                if (sendMessage == null) {
                    writer.write("클라이언트에서 메시지 전송을 취소하였습니다.");
                    writer.flush();
                    return;
                } else if (!sendMessage.trim().isEmpty()) {
                    writer.write(sendMessage + "\n");
                    writer.flush();
                } else {
                    return;
                }

                // 데이터 수신해보기
                String message = reader.readLine();
                System.out.println("\uD83D\uDD14 서버에서 온 메시지: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
