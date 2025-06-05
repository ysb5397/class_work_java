package _server_socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1:1 소켓 통신을 활용한 파일 서버를 만들어보자
 */
public class SimpleFileServer {
    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "Uploads/";

    // 함수 만들어보기
    private static void handleClient(Socket socket) {
        try (InputStream in = socket.getInputStream();
             OutputStream out = socket.getOutputStream()) {

            // 동작 흐름 생각해보기(클라이언트에서 파일이름 + 바이트 덩어리)
            byte[] nameBuffer = new byte[100];
            in.read(nameBuffer);
            String fileName = new String(nameBuffer).trim();
            System.out.println("파일 이름 수신 완료: " + fileName);

            // 파일을 만드는 방법 --> 메모리 상에서 new file(파일 경로+파일 이름);
            // 파일 객체를 메모리에 띄움
            // 파일 내용을 읽고 쓰기 위한 버퍼 (4KB 크기)
            File file = new File(UPLOAD_DIR + fileName);
            try (FileOutputStream fos = new FileOutputStream(file)) {

                // 바이트 단위가 1000이 아닌 1024인 이유는
                // 메모리 용량을 계산할 때 2의 거듭제곱으로 표현
                // 1024 = 2의 10승
                byte[] buffer = new byte[4096];
                int bytesRead;
                int available;

                while (in.available() > 0 && (bytesRead = in.read(buffer)) != -1) {
                    available = in.available();
                    fos.write(buffer, 0, bytesRead);
                }

                System.out.println("서버 컴퓨터에 [" + fileName + "] 파일 저장 완료");
                out.write("파일 업로드 완료".getBytes());
                out.write(fileName.getBytes());
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 업로드 디렉토리 생성
        new File(UPLOAD_DIR).mkdirs();

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("클라이언트의 연결 요청을 기다립니다.");
            try (Socket connectedClientSocket = serverSocket.accept()) {
                System.out.println("클라이언트와 연결됨!");
                handleClient(connectedClientSocket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
