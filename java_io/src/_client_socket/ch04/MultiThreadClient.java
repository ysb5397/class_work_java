package _client_socket.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadClient {
    public static void main(String[] args) {
        System.out.println("클라이언트를 시작합니다.(포트 번호: 5000)");

        Socket socket = null;

        try {
            socket = new Socket("localhost", 5000);
            System.out.println("\uD83D\uDCE2 서버와 연결되었습니다. 메시지를 보내보세요.");

            // 서버와 통신을 하기 위한 스트림 준비하기
            // 서버 측에 문자열 기반으로 데이터를 보내기 위한 스트림
            PrintWriter writerStream = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader readerStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 키보드에 값을 입력 받기 위한 스트림 준비
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 서버로부터 데이터를 읽는 스레드 생성
            Thread readThread = new Thread(() -> {
               try {
                   String serverMessage;
                   while((serverMessage = readerStream.readLine()) != null) {
                       if ("exit".equalsIgnoreCase(serverMessage)) {
                           System.out.println("서버가 채팅을 종료했습니다.");
                           break;
                       }
                       System.out.println("\uD83D\uDD14 서버에서 온 메시지 : " + serverMessage);
                       System.out.println("\uD83D\uDD18 서버에 보낼 메시지를 입력해주세요: ");
                   }
               } catch (IOException e) {
                   e.printStackTrace();
                   System.err.println("메시지를 받는 도중 오류 발생");
               }
            });

            // 서버에게 데이터를 보내는 스레드 생성
            Thread writeThread = new Thread(() -> {
               try {
                   String serverMessage;
                   while((serverMessage = keyboardReader.readLine()) != null) {
                       if ("exit".equalsIgnoreCase(serverMessage)) {
                           writerStream.println(serverMessage);
                       } else {
                           writerStream.println("\uD83D\uDCE9" + serverMessage);
                       }
                       writerStream.flush();
                   }
               } catch (IOException e) {
                   e.printStackTrace();
                   System.err.println("메시지 전송 중 오류 발생");
               }
            });

            // 스레드 시작
            readThread.start();
            writeThread.start();

            // 스레드 사용시 join() 메서드
            readThread.join();
            writeThread.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류 발생");
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("자원 닫는 중 오류");
            }
        }
    }
}
