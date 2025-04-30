package inner;

public class OuterClass {
    private int num = 10;

    // inner Class란? 클래스 내부에 클래스가 있는 것
    // 멤버 내부 클래스
    class InnerClass {
        public void display() {
            System.out.println("inner class display() 호출" + num);
        }
    }

    public static void main(String[] args) {
//        InnerClass innerClass = new InnerClass();
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }

}
