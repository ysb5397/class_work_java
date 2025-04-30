package _object;

//import java.lang.Object;
//import java.lang.*;

// java.lang.* 패키지도 자동으로 넣어줌

/**
 *  Object 최상위 클래스에 대한 이해
 *  기본적으로 Object 클래스 상속을 받는다
 *  자바는 Object 클래스 (모든 클래스의 최상위 클래스)를 제외하고
 *  단일 상속만을 제공한다.
 */
// public class Book extends Object
public class Book {
    private int bookTypeId;
    private String title;
    private String author;

    public Book(int BookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            // book 타입이 맞다면 추가적으로, 제목이 같다면 같은 책으로 판단
            // 제목 동일, 저자 동일
            if ((this.title.equals(((Book) obj).title)) && (this.author.equals(((Book) obj).author))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // equals()를 재정의 할 때는 hashcode() 도 재정의
    // 이렇게 해야 의도하지 않은 동작을 막을 수 있다.

    @Override
    public int hashCode() {
        // hashcode --> 이 개체의 고유한 정수값을 만들어서 독립적인 존재라는 것을 보장하는 정수값
        return bookTypeId;
    }


    // showInfo();
//    @Override
//    public String toString() {
//        return "타이틀: " + title + ", 저자: " + author;
//    }

    // 테스트 코드
    public static void main(String[] args) {

        // 물리적인 객체 주소값은 다르지만 equals(); 메서드를 재정의 해서
        // 논리적으로 책 이름과 이름이 같으면 같은 녀석으로 바라보게
        // 프로그램 요청

        // 책 제목과 그리고 저자 이름이 같다면 논리적으로 같은 책으로 판단
        Book book1 = new Book(1,"이름","저자");
        Book book2 = new Book(1,"이름","저자2");
        Book book3 = new Book(2,"이름3","저자3");
        Book book4 = new Book(1,"이름","저자");
        String str1 = new String("스트링");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        boolean result1 = book1.equals(book2);
        boolean result2 = book1.equals(str1);
        boolean result3 = book1.equals(book3);
        boolean result4 = book1.equals(book4);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
