package _client_socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 클라이언트 측 코드
 * 1. 서버측 컴퓨터의 IP 주소와 포트 번호를 알고 있어야 함
 * 2. 소켓 필요(네트워크 통신 표준 규약을 지켜야 한다.)
 * 3. 서버측으로 데이터를 전달하려면
 */
public class ClientFile {
    public static void main(String[] args) {
        // 생성자 - 연결하고자 하는 컴퓨터 IP 주소 필요, 포트 번호
        // 만약 내 컴퓨터에 접근하고 싶다면 localhost도 사용 가능
        Socket socket = null;
        try {
            socket = new Socket("localhost", 5001);

            // 서버로 데이터를 보내기 위한 준비물
            // 출력 스트림이 필요하다(문자)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("\uD83D\uDEA9");
            pw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
