package collections;

import java.util.HashMap;
import java.util.Scanner;

public class BookMapAddSystem {

    private HashMap<String, Book> bookHashMap;

    public BookMapAddSystem() {
        bookHashMap = new HashMap<>();
    }

    // 저장하는 메서드만 만들어 보자 (자료 구조에 저장하는 기능만 설계)
    public void addBook(String title, String author) {
        bookHashMap.put(title, new Book(title, author));
    }

    // 콘솔창에 출력하는 메서드를 만들어보자(단, 책 제목과 저자를 모두 출력)
    public void showAllBook() {
        for (Book b : bookHashMap.values()) {
            System.out.println(b.toString());
        }
    }

    public static void main(String[] args) {
        BookMapAddSystem books = new BookMapAddSystem();

        Scanner scanner = new Scanner(System.in);
        String bookTitle;
        String bookAuthor;
        int selectedNumber;

        while(true) {
            System.out.println("원하는 번호를 입력해주세요. 1. 책 추가 / 2. 책 조회 / 0. 프로그램 종료");
            selectedNumber = scanner.nextInt();

            if (selectedNumber == 1) {
                System.out.println("추가하실 책 이름을 입력해주세요.");
                bookTitle = scanner.next();

                System.out.println("다음으로 [" + bookTitle + "] 의 저자를 입력해주세요." );
                bookAuthor = scanner.next();

                System.out.println("제목 : [" + bookTitle + "] / 저자 : [" + bookAuthor + "] 라는 책이 성공적으로 등록되었습니다.");
                books.addBook(bookTitle, bookAuthor);
                System.out.println("--------------------------------");
            } else if (selectedNumber == 2) {
                System.out.println("모든 책을 출력합니다.");
                books.showAllBook();
            } else if (selectedNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("유효한 값이 아닙니다.");
            }
        }
    }
}

// 사용자 정의 데이터
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
