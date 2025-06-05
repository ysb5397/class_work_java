package _client_socket.ch06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
    private static final int PORT = 5000;
    private final String name;
    private Socket socket;
    private OutputStream out;
    private InputStream in;
    private final Scanner scanner = new Scanner(System.in);

    public FileClient(String name) {
        this.name = name;
    }

    private void connectToServer() throws IOException {
        socket = new Socket("localhost", PORT);
        System.out.println("서버와 연결됨");
    }

    private void setUpStreams() throws IOException {
        out = socket.getOutputStream();
        in = socket.getInputStream();
        System.out.println("소켓과 연결된 바이트 기반 스트림 준비 완료");
    }

    // 키보드에서 파일 경로를 입력 받아 서버로 전송
    private void uploadFile() throws IOException {
        // C:\class_work_java\java_io\src\Uploads
        System.out.println("보내고 싶은 파일 경로를 입력하세요 (예: C:/test.txt)");
        String filePath = scanner.nextLine();

        // 파일 유효성 검사
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            System.err.println("그 파일은 없거나 잘못된 경로입니다.");
            return;
        }

        // 서버 측과의 약속
        String fileName = file.getName();
        byte[] nameBytes = fileName.getBytes();
        byte[] nameBuffer = new byte[100];

        // 파일 이름이 100칸보다 길면 안됨
        if (nameBytes.length > 100) {
            System.err.println("파일 이름은 100글자 미만으로 해주세요");
            return;
        }

        // 영어는 1바이트씩 가능
        for (int i = 0; i < nameBytes.length; i++) {
            nameBuffer[i] = nameBytes[i];
        }

        out.write(nameBuffer);
        out.flush();

        // 파일 내용을 바이트로 변환해서 보내주어야 함
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            out.flush();

            // 서버측에 바이트를 다 받으면 메시지를 보냄
            byte[] responseBuffer = new byte[1024];
            int responseLength = in.read(responseBuffer);
            String response = new String(responseBuffer, 0, responseLength);
            System.out.println("서버 응답: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cleanUp() {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 실행의 흐름 지정하는 메서드 만들기
    public void fileSendRun() {
        try {
            connectToServer();
            setUpStreams();
            uploadFile();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            cleanUp();
        }
    }

    public static void main(String[] args) {
        FileClient fc = new FileClient("양성빈");
        fc.fileSendRun();
    }
}
