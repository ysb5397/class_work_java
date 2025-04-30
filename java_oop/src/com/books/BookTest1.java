package com.books;

public class BookTest1 {

    public static void main(String[] args) {

        // int[]
        // double[]
        // String[]

        // 배열 안의 요소는 기본데이터 타입 / 참조자료형 타입
        Book[] books = new Book[10];
        books[0] = new Book("타이틀1", "저자1");
        books[1] = new Book("타이틀2", "저자2");
        books[2] = new Book("타이틀3", "저자3");
        books[3] = new Book("타이틀4", "저자4");
        books[4] = new Book("타이틀5", "저자5");
        books[9] = new Book("타이틀10", "저자10");

        // 조회
        String title9 = books[9].getTitle();
        String author9 = books[9].getAuthor();

        System.out.println(title9 + " / " + author9);

        // 배열은 반복문과 함께 많이 쓰인다
        // 주의 -> 배열의 길이와 안의 요소(element)는 꼭 가득차 있는 것은 아니다
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            }
        }


    }

}
