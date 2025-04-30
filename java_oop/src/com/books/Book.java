package com.books;

/**
 * TODO 도서를 저장하고 관리할 수 있는 간단한 프로그램 만들어보기
 * TODO C R U D 라는 개념을 포함해야 한다.
 */
public class Book {

    private String title;
    private String author;
    private int totalPage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    // setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // 메서드
    public void showInfo() {
        System.out.println("------- \uD83D\uDCD7 책 정보 ------");
        System.out.println("책 제목: " + title);
        System.out.println("글쓴이: " + author);
        System.out.println("책 페이지 수: " + totalPage);
    }







}
