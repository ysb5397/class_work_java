package ch02;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class JDBCExample2 extends JFrame {

    private static final String FONT_NAME = "고딕";
    private static final int FONT_SIZE = 20;
    private int x = 300;
    private int y = 10;
    private int num = 0;

    private String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul";
    private String user = "root";
    private String password = "asd1234";

    private Connection conn = null;
    private Statement stat = null;
    private ResultSet result = null;

    public JDBCExample2() {
        initData();
        setInitLayout();
    }

    public void initData() {
        setTitle("데이터베이스 연결");
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setInitLayout() {
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        try {
            super.paint(g);
            g.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));

            conn = DriverManager.getConnection(url, user, password);
            stat = conn.createStatement();
            result = stat.executeQuery("select d.dept_no, e.first_name, d.from_date, d.to_date from dept_manager as d left join employees as e on d.emp_no = e.emp_no where d.to_date = '9999-01-01'");
            System.out.println("연결 성공!");

//            System.out.println("부서.No | 사원 이름(first) | 임명일 | 종료일")
            while(result.next()) {
                String deptNo = result.getString("dept_no");
                String empName = result.getString("first_name");
                String fromDate = result.getString("from_date");
                String toDate = result.getString("to_date");

                g.drawString(deptNo + " | " + empName + " | " + fromDate + " | " + toDate, x, y);

                num++;
                y += 30;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("연결 실패.....");
        } finally {
            try {
                result.close();
                stat.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("정상적으로 종료되지 않았습니다.");
            }
        }
    }

    public static void main(String[] args) {
        new JDBCExample2();
    }
}
