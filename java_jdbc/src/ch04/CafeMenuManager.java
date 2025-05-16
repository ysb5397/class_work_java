package ch04;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  JDBC 연습, 메서드 분리하는 방법 활용
 */

public class CafeMenuManager {

    private static final String URL = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PW = "asd1234";

    // 메뉴 추가 static 메서드
    public static void insertMenu(String name, int price, String category) {
        // insert into menu(name, price, category) values ('아메리카노', 2000, '커피');
        try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            String sql = "insert into menu(name, price, category) values (?, ?, ?) ";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setInt(2, price);
            pstmt.setString(3, category);

            int rowsInsertedCount = pstmt.executeUpdate(); // 쿼리 실행 (insert, update, delete)
            System.out.println(rowsInsertedCount + "개의 메뉴가 추가 되었습니다.");

            ResultSet rs = pstmt.executeQuery("select * from menu ");
        } catch (Exception e) {
            System.err.println("메뉴 추가 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 메뉴 수정
    // update menu set price = 3000 where name = "아메리카노"
    public static void updateMenuPrice(int price, String name) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            String sql = "update menu set price = ? where name = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, price);
            pstmt.setString(2, name);

            int rowsUpdatedCount = pstmt.executeUpdate();
            System.out.println(rowsUpdatedCount + "개의 메뉴 가격이 수정 되었습니다.");
        } catch (Exception e) {
            System.err.println("메뉴 수정 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 메뉴 삭제 기능
    public static void deleteMenu(String name) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            String sql = "delete from menu where name = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            int rowsDeletedCount = pstmt.executeUpdate();
            System.out.println(rowsDeletedCount + "개의 메뉴를 삭제 했습니다.");

        } catch (Exception e) {
            System.err.println("메뉴 삭제 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 메뉴 조회 기능
    public static void selectAllMenu() {
        // 1. 반드시 쿼리를 확인하고 복사 붙여 넣기
        try (Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            String sql = "select * from menu";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String name = rs.getString("name");
                int price = rs.getInt("price");
                String category = rs.getString("category");
                System.out.println(name + " | " + price + " | " + category);
            }
        } catch (Exception e) {
            System.err.println("조회 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 테스트 해보기
        Scanner scanner = new Scanner(System.in);
        int selected;

        while(true) {
            System.out.printf("1. 메뉴 추가 / 2. 전체 메뉴 조회 / 3. 메뉴 수정 / 4. 메뉴 삭제 / 0. 프로그램 종료 중 하나만 선택해주세요.\n입력: ");

            try {
                selected = scanner.nextInt();

                switch(selected) {
                    case 1:
                        System.out.println("메뉴 추가를 선택하셨습니다.");
                        System.out.print("추가할 메뉴 이름: ");
                        String name = scanner.next();

                        System.out.print("추가할 메뉴 가격: ");
                        int price = scanner.nextInt();
//                        scanner.nextLine();

                        System.out.print("추가할 카테고리: ");
                        String category = scanner.next();
                        insertMenu(name, price, category);
                        break;
                    case 2:
                        System.out.println("전체 메뉴 조회를 선택하셨습니다.");
                        selectAllMenu();
                        break;
                    case 3:
                        System.out.println("메뉴 수정을 선택하셨습니다.");
                        System.out.print("수정할 메뉴 이름: ");
                        String updateName = scanner.next();

                        System.out.print("수정할 메뉴 가격: ");
                        int newPrice = scanner.nextInt();
                        // scanner.nextLine();

                        updateMenuPrice(newPrice, updateName);
                        break;
                    case 4:
                        System.out.println("메뉴 삭제를 선택하셨습니다.");
                        System.out.println("삭제할 메뉴 이름: ");
                        String deleteName = scanner.next();

                        deleteMenu(deleteName);
                        break;
                    case 0:
                        System.out.println("종료합니다.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.err.println("입력값이 숫자가 아닙니다.");
                break;
            }
        }
    }
}
