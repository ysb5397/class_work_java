package _server_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 서버측 코드
 * 양방향 통신 구현 (1:1 채팅)
 * 키보드에서 값을 받아 데이터를 보내기
 */
public class ServerFile03 {
    public static void main(String[] args) {
        // 준비물
        // 1. 서버 소켓이 필요. 포트 번호는 5000
        // 2. 입력 스트림이 필요(클라이언트에 메시지 수신)
        // 3. 출력 스트림이 필요(클라이언트에 메시지 전송)

        // 1. 서버 소켓 생성
        try (ServerSocket serverSocket = new ServerSocket(5000);
            Scanner scanner = new Scanner(System.in)){
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

            while(true) {
                // 데이터 수신해보기
                String sendMessage = reader.readLine();
                System.out.println("\uD83D\uDD14 클라이언트에서 온 메시지: " + sendMessage);

                // 데이터 송신해보기
                System.out.println("\uD83D\uDCE2 클라이언트에 보낼 메시지를 입력해주세요.");

                String input = scanner.next();
                if (input == null) {
                    writer.write("서버에서 메시지 전송을 취소하였습니다.");
                    writer.flush();
                    return;
                } else if (!input.trim().isEmpty()) {
                    writer.write(input + "\n");
                    writer.flush();
                } else {
                    return;
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
