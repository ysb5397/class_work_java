package _server_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  서버측 코드
 *  간단한 네트워크를 통한 서버측 프로그래밍에 필요한 준비물
 *  1. 서버 소켓 필요
 *  2. IP, 포트 번호 (0~65535 -> 컴퓨터 마다) 필요
 *  3. 사전 기반 지식 - 잘 알려진 포트 번호 - 주로 시스템 레벨에서 선점한 포트 번호 (0~1023)
 */
public class ServerFile {
    public static void main(String[] args) {
        // 소켓 통신을 하기 위해서(서버측)
        // 1. 서버 소켓 필요 (서버측에서만 가지면 됨)

        // 서버 소켓 선언
        ServerSocket serverSocket = null;

        try {
            // 내가 만든 서버 소켓 프로그래밍에 포트 번호 5000을 할당
            // 단, 다른 프로그램이 5000번 포트를 선점하고 있으면 에러 발생
            serverSocket = new ServerSocket(5001);
            System.out.println("서버를 시작합니다.(포트 번호: 5001)");

            // 클라이언트 연결을 기다림
            // 내부적으로 while로 대기 중(클라이언트 연결 요청 할 때 까지)
            Socket clientSocket = serverSocket.accept();
            // 클라이언트와 연결이 되면 서로 서버측 Socket이 생성이 되고 클라이언트 Socket 연결이 됨
            System.out.println(">>> 클라이언트와 연결이 되었습니다. <<<");

            // 클라이언트에서 보낸 데이터를 읽기 위한 입력 스트림이 필요하다
//            InputStream input = clientSocket.getInputStream(); // 바이트 단위로 데이터를 읽을 수 있음
            // 문자 기반에 스트림으로 확장 + 보조 스트림
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // 클라이언트가 보낸 데이터 한줄 기반으로 읽어보기
            String message = br.readLine();
            System.out.println("클라이언트가 보낸 메시지 : " + message);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제(서버 소켓 닫기)
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
