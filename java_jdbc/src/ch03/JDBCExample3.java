package ch03;

import java.sql.*;

public class JDBCExample3 {

    public static void main(String[] args) {

        // MySQL 서버 접근하기
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        // 자바 --> MySQL 서버
        Connection conn = null;
        // 보안 성능이 더 좋은게 있다. --> PreparedStatement
//        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 작성할 필요없음
//            Class.forName("com.mysql.cj.jdbc.Driver");
            // 1. 데이터 베이스에 연결 요청
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터 베이스 접근 성공");

            // 2. statement - 쿼리를 만들어서 실행하기 위해
//            stmt = conn.createStatement();
            // PreparedStatement 생성 - 미리 쿼리 부분 만들어둠(일부분만)
            pstmt = conn.prepareStatement("select * from tb_student where no = ? and age = ? ");
//            pstmt.setInt(); // ? 순서 기준으로 해당하는 데이터 타입을 명시하는 것
            pstmt.setString(1, "20170001");
            pstmt.setInt(2, 25);

            // 3. resultset - 쿼리를 만들고 실행 요청
//            rs = stmt.executeQuery("select * from tb_student "); // 마지막에 공백 하나 추가
            rs = pstmt.executeQuery();

            // 4. 결과(응용해서 프로그래밍 처리)
            // 결과 추출하는 기법
            while(rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(no + " | " + name + " | " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else if (pstmt != null) {
                    pstmt.close();
                } else if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
