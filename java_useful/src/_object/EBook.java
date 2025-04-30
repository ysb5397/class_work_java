package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 재정의
    @Override
    public String toString() {
        return bookTypeId + "번에 제목: " + title + " / 저자: " + author + "의 책이 있습니다.";
    }

    // equals() 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EBook) {
            if ((this.title.equals(((EBook) obj).title)) && (this.author.equals(((EBook)obj).author))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // hashcode() 재정의
    @Override
    public int hashCode() {
        return bookTypeId;
    }

    public static void main(String[] args) {
        EBook book1 = new EBook(1, "자바1", "개발자1");
        EBook book2 = new EBook(2, "자바1", "개발자1");
        EBook book3 = new EBook(5, "자바3", "개발자3");

        boolean result1 = book1.equals(book2);
        boolean result2 = book3.equals(book1);
        boolean result3 = book2.equals(book3);

        System.out.println("책을 찾았는지 여부: " + result1);
        System.out.println("책을 찾았는지 여부: " + result2);
        System.out.println("책을 찾았는지 여부: " + result3);
    }
}
