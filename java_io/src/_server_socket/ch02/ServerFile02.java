package _server_socket.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 서버측 코드
 * 양방향 통신 구현 (1:1 채팅)
 */
public class ServerFile02 {
    public static void main(String[] args) {
        // 준비물
        // 1. 서버 소켓이 필요. 포트 번호는 5000
        // 2. 입력 스트림이 필요(클라이언트에 메시지 수신)
        // 3. 출력 스트림이 필요(클라이언트에 메시지 전송)

        // 1. 서버 소켓 생성
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("서버를 시작합니다.(포트 번호: 5000)");

            // 2. 클라이언트 연결을 기다림
            Socket socket = serverSocket.accept();
            System.out.println(">>> 클라이언트와 연결이 되었습니다. <<<");

            // 클라이언트로부터 데이터를 입력받을 스트림이 필요
            // reader -> 데이터를 읽을 수 있다.
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 클라이언트에게 데이터를 전송할 스트림이 필요 + 문자 기반 스트림으로 확장
            // writer -> 데이터를 전송할 수 있다.
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 데이터 수신해보기
            String message = reader.readLine();
            System.out.println("클라이언트에서 온 메시지: " + message);

            // 데이터 송신해보기
            writer.println("\uD83D\uDC68\u200D\uD83D\uDE80 \uD83D\uDEA9");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("서버 소켓 닫기 실패");
                    e.printStackTrace();
                }
            }
        }
    }
}
