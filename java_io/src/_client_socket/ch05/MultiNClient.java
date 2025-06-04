package _client_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 서버와 양방향 통신을 하는 클라이언트 측 코드
 */
public class MultiNClient {
    private final String name;
    private Socket socket;
    private PrintWriter writerStream; // 서버로 메시지를 전송하는 스트림
    private BufferedReader readerStream;
    private BufferedReader keyboardReader;

    public MultiNClient(String name) {
        this.name = name;
    }

    // 행위
    // 메인 컴퓨터 ip 주소(192.168.0.132)
    // 서버에 5000번 포트로 연결 처리
    private void connectToServer() throws IOException {
        socket = new Socket("192.168.0.132", 5000);
        System.out.println("\uD83D\uDCE2 서버와 연결되었습니다.");
    }

    // 입출력 스트림을 설정
    private void setUpStreams() throws IOException {
        writerStream = new PrintWriter(socket.getOutputStream(), true);
        readerStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReader = new BufferedReader(new InputStreamReader(System.in));
    }

    // 서버로부터 온 메시지를 실제로 읽는 행위
    private Thread createdReadThread() {
        return new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = readerStream.readLine()) != null) {
                    System.out.println("\uD83D\uDD14 서버에서 온 메시지: " + serverMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    // 키보드에서 입력을 받아 서버로 메시지를 전송하는 행위
    private Thread createdWriteThread() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String keyboardMessage;
                    while ((keyboardMessage = keyboardReader.readLine()) != null) {
                        writerStream.println("[\uD83D\uDCE9 " + name + "] " + keyboardMessage);
//                        writerStream.flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // 자원을 정리하고 소켓을 닫는 행위
    private void cleanUp() {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 읽기, 쓰기 스레드를 생성 및 start 처리
    private void startCommunication() throws InterruptedException {
        Thread readThread = createdWriteThread();
        Thread writeThread = createdReadThread();

        readThread.start();
        writeThread.start();

        // 종료 될 때까지 메인 스레드 종료 하지말고 대기
        readThread.join();
        writeThread.join();
    }

    // 채팅 시작
    public void chatRun() {
        try {
            connectToServer();
            setUpStreams();
            startCommunication();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            cleanUp();
        }
    }

    public static void main(String[] args) {
        System.out.println("클라이언트 프로그램 시작");
        MultiNClient multiNClient = new MultiNClient("양성빈");
        multiNClient.chatRun();
    }
}

