package generic.ch04;

public class GenericBoxDemo {

    public static void main(String[] args) {
        // String 타입의 Box 선언 및 사용
        Box<String> stringBox = new Box<>("123");

        // Integer 타입의 Box 선언 및 사용
        Box<Integer> integerBox = new Box<>(100);

        // double --> 래퍼 클래스 -> Double 타입의 Box 선언 및 사용
        Box<Double> doubleBox = new Box<>(1.54);
    }
}
