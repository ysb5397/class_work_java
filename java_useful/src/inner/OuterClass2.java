package inner;


/**
 * 지역 내부 클래스 (Local Inner Class)
 * 메서드 안에 클래스가 있는 형태
 */

public class OuterClass2 {

    public void display() {

        // 지역 내부 클래스
        class localInnerClass {
            void printMessage() {
                System.out.println("지역 내부 클래스 메서드야");
            }
        }

        localInnerClass localInnerClass = new localInnerClass();
        localInnerClass.printMessage();

    }

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display();
    }

}
