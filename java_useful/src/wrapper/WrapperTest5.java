package wrapper;

import java.util.ArrayList;

public class WrapperTest5 {

    public static void main(String[] args) {
        // 컬렉션 프레임 워크에서의 사용
        // 컬렉션은 객체만 저장 가능하다.(즉 기본 타입X)
        // 정수값(Wrapper Class)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20); // 자동 박싱

        int sum = numbers.get(0) + numbers.get(1); // 자동 언박싱
        System.out.println(sum);
    }
}
