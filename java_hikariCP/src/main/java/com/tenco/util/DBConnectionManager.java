package com.tenco.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionManager {
    // HiKariCP 설정 클래스
    private static HikariDataSource dataSource;

    // 정적 초기화 블록(Static Initialization Block
    // 클래스가 로드될 때 단 한번만 실행된다.
    static {
        // HiKariCP 설정 구성
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul");
        config.setUsername("root");
        config.setPassword("asd1234");

        // Connection 최대 연결 갯수 설정
        config.setMaximumPoolSize(10); // 기본값 10

        // HikariDataSource 객체에 HikariConfig 객체를 주입하게 만들어져 있음(API 문서 확인)
        dataSource = new HikariDataSource(config);
    }

    // 데이터 베이스 연결을 반환하는 메서드 만들기(Connection)
    public static Connection getConnection2() throws SQLException {
        return dataSource.getConnection();
    }

    // 테스트
    public static void main(String[] args) {
        try {
            System.out.println("DB 연결 요청 시작");
            DBConnectionManager.getConnection2();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
