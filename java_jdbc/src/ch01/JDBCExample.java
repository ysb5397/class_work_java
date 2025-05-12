package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  자바로 DB에 접근하는 기술 습득
 *  DB 접근 기술
 */
public class JDBCExample {

    public static void main(String[] args) {
        // MySQL 8 버전에 접근
        // DB 접근 기술은 정형화 되어 있음.

        // IP 주소를 일일이 적지 않고 localhost를 써서 가능하다.
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        // 규칙1 - Connection 객체를 힙 메모리에 올리기 위해서는 DriverManager 클래스 필요
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터 베이스에 성공적으로 연결되었습니다!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터 베이스에 연결하지 못했습니다...");
        }
    }
}
