package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ysb5397
 * 데이터 베이스 연결을 관리하는 유틸리티 클래스
 */

public class DatabaseUtil {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
    private static final String DB_USER = "root";
    private static final String DB_PW = "asd1234";

    // 데이터 베이스 연결 객체를 반환
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
    }
}
