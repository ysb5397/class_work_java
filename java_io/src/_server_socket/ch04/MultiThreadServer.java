package _server_socket.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * 서버측 코드
 * 1:1 양방향 통신
 */
public class MultiThreadServer {
    private static String[] nums = new String[6];
    private static List<String> messages = new ArrayList<>();

    // 메인 스레드
    public static void main(String[] args) {
        System.out.println("서버를 시작합니다.(포트 번호: 5000)");
        // 준비물
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(5000);
            // 클라이언트 연결 대기
            socket = serverSocket.accept();
            System.out.println("\uD83D\uDCE2 클라이언트와 연결이 되었습니다.");

            // 준비물 :
            // 1. 키보드에서 값을 받을 스트림 필요
            // 2. 클라이언트 측과 연결된 출력 스트림이 필요(데이터를 보낼 예정)
            // 3. 클라이언트 측과 연결된 입력 스트림이 필요(데이터를 받을 예정)

            // 1. 바이트, 문자기반 + 보조 스트림
            // System.in + InputStreamReader + BufferedReader
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 2. socket 에서 출력 스트림을 뽑아보자.
            // 바이트 기반 스트림 + 문자 기반 스트림으로 확장 + 보조 스트림(일단은 X)
            PrintWriter writerStream = new PrintWriter(socket.getOutputStream(), true);

            // 3. socket 에서 입력 스트림을 뽑아보자.
            // 바이트 기반 스트림 + 문자 기반 스트림으로 확장 + 보조 스트림
            BufferedReader readerStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 동작 고민하기
            // 클라이언트 측으로부터 데이터를 while 돌면서 계속 받는 작업 대기
            // 람다 표현식
            Thread readThread = new Thread(() -> {
                try {
                    String clientMessage;
                    System.out.println("readThread 시작");
                    while ((clientMessage = readerStream.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트가 채팅을 종료했습니다.");
                            break;
                        } else if (clientMessage.contains("로또") && clientMessage.contains("로또")) {
                            nums = generateLottoNumber();
                            messages.add(clientMessage);
                        }
                        System.out.println("\uD83D\uDD14 클라이언트에서 온 메시지: " + clientMessage);
                        System.out.println("\uD83D\uDD18 클라이언트에 보낼 메시지를 입력해주세요: ");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("메시지를 받는 도중 오류");
                }
            });

            // 메인 작업자가 계속 키보드 입력을 받아서 코드로 가져오는 것은 바쁨
            // 람다 표현식
            Thread keyboardThread = new Thread(() -> {
                try {
                    String serverKeyboardMessage;
                    System.out.println("keyboardThread 시작");

                    while (true) {
                        if (messages != null && !messages.isEmpty() && messages.get(0).contains("로또") && messages.get(0).contains("생성")) {
                            for (int i = 0; i < nums.length; i++) {
                                writerStream.print(nums[i] + " ");
                            }
                            writerStream.println("");
                            messages.remove(0);
                        } else if ((serverKeyboardMessage = keyboardReader.readLine()) != null) {
                            if ("exit".equalsIgnoreCase(serverKeyboardMessage)) {
                                writerStream.println(serverKeyboardMessage);
                            } else {
                                writerStream.println("\uD83D\uDCE9 " + serverKeyboardMessage); // write + \n
                            }
                        }
                        writerStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("메시지 전송 중 오류 발생");
                }
            });

            // 스레드 작업 시작
            readThread.start();
            keyboardThread.start();
            System.out.println("스레드 시작됨");

            // 스레드 사용시 join() 메서드
            readThread.join();
            keyboardThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.err.println("서버 오류 발생");
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("자원 닫는 도중 오류 발생");
            }
        }
    }

    public static String[] generateLottoNumber() {
        int[] temp = new int[6];
        String[] nums = new String[6];
        Random random = new Random();

        for (int i = 0; i < temp.length; i++) {
            temp[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (temp[j] == temp[i]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(temp);

        for (int k = 0; k < temp.length; k++) {
            nums[k] = temp[k] + "";
        }

        return nums;
    }
}
