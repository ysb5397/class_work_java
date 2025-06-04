package _server_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 * 1:N 양방향 통신을 구현하는 서버측 코드
 * 여러 클라이언트와 연결하여 메시지를 수신하고, 모든 클라이언트에게
 * 브로그 캐스트 처리를 함.
 */
public class MultiNServer {
    private static final int PORT = 5000;
    // List 계열 자료구조 - 사용방법 거의 동일(멀티 스레드 환경에서 안정적)
    private static Vector<PrintWriter> clientWriters = new Vector<>();
    private static int connectedCount = 0;

    public static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        /**
         * 클라이언트와 통신 처리
         * 메시지를 수신하여 모든 클라이언트에게 브로드캐스트하고,
         * 연결 종료 시 자원을 정리한다.
         */
        @Override
        public void run() {
            // 입력 스트림, 출력 스트림
            try {
                // 스트림 준비
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // 자료구조에 서버--클라이언트가 연결된 출력 스트림 저장
                clientWriters.add(out);

                // 클라이언트로부터 메시지를 수신하고 방송
                String message;
                while((message = in.readLine()) != null) {
                    System.out.println("\uD83D\uDD14 클라이언트로부터 받은 문자: " + message);
                    for (PrintWriter writer : clientWriters) {
                        writer.println("방송: " + message);
                    }
                }

                // 예시 1
                // 1. 사람이 한명이라면 out.println(message)
                // 2. 사람이 두 사람이라면, 동시에 보내는 방법은?
            } catch (IOException e) {
                System.err.println("클라이언트에서 연결 종료");
                connectedCount--;
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                    clientWriters.remove(out);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("소켓 닫는 중 오류 발생");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("서버를 시작합니다.(포트 번호: " + PORT + ")");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            // 메인 스레드는 무한 루프를 돌면서 클라이언트 연결 요청을 기다림
            while (true) {
                // Socket socket = serverSocket.accept();
                // ClientHandler --> 자신의 동작 실행
                new ClientHandler(serverSocket.accept()).start();
                connectedCount++;
                System.out.println("\uD83D\uDCE2 현재 연결된 클라이언트 수: " + connectedCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("서버 오류 발생");
        }
    }
}
