package generic.ch04;

/**
 *  제네릭 클래스 Box 설계 / <T> 대체 문자열 사용
 */

public class Box<E> {

    // 변수 선언
    E item;

    // 생성자 선언
    public Box(E item) {
        this.item = item;
    }

    // 내용물 설정(set)
    public void setBox(E item) {
        this.item = item;
    }

    // 내용물 반환(get)
    public E getBox() {
        return item;
    }

    // 내용물 출력(sout)
    @Override
    public String toString() {
        return "박스입니다.";
    }
}
