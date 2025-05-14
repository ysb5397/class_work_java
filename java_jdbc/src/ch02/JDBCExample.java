package ch02;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {

        // 데이터 베이스 접근 주소
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        // JDBC를 사용하기 위해서 필요한 클래스
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 데이터 베이스 연결 요청
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("MySQL 데이터베이스에 접속이 완료되었습니다.");

            // 2. statement 생성
            stmt = conn.createStatement();

            // 2.1 쿼리 실행해보기
            // select 쿼리 시 executeQuery
            rs = stmt.executeQuery("select * from tb_student");

            // 3. 결과 실행하기
            while(rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                System.out.println(no + " | " + name + " | " + gender + " | " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("MySQL 데이터베이스에 접속하지 못했습니다...");
        } finally {
            // JDBC 기술을 사용하면 데이터 베이스에서 자원을 얻기 위해
            // 객체가 계속 대기 하고 있음.
            // 4. 자원 해제
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("자원 해제 중 오류 발생" + e.getMessage());
            }
        }

    }
}
