package ch06;

public class MainTest1 {
    public static void main(String[] args) {
        // 사용자 정의 데이터 타입 -> 클래스
        // 인스턴스화 (메모리에 올리는 것)

        // 메모리 영역 2가지
        // stack, heap
        int n1;
        int n2 = 10;
        User user1 = new User();
        User user2 = new User();

        user2.age = 100;
    }
}
