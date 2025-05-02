package collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {

        List mList; // 리스트 인터페이스

        int[] array = new int[10];
        ArrayList<Integer> list = new ArrayList();
        // <> 제네릭 - 추후 배워야 할 내용
        // Integer(참조), int(기본)
        // Integer - wrap 클래스 int 기본 데이터 타입을 클래스로 설계해둔 데이터 타입

        // ArrayList<Integer> list -> 정수값을 하나의 변수에 저장하는 리스트 계열의 자료 구조 생성

        // 1. 값을 추가하는 방법
        array[0] = 100;
        list.add(100);
        list.add(null); // -> null 값도 가능
        list.add(200);

        // 2. 값 출력
        System.out.println(array[0]);
        System.out.println(list.get(0));

        // 3. 값 삭제
        list.remove(1);
        // 3.1 삭제 후에 전체 출력
        System.out.println(list);

        // 4. 인덱스 번호로 값 추가하기
        list.add(1, 1000);
        System.out.println(list);

        // 삭제 처리 해야함
        list.remove(2);
        System.out.println(list);

        // 5. 전체 삭제
        list.clear();
        System.out.println(list);

        // 6. 리스트의 사이즈를 확인
//        array.length;
        System.out.println(list.size());


        // nums 참조 변수에 list 참조 변수의 주솟값 대입
        // 주소값을 복사 했다 --> 얕은 복사 개념
        ArrayList nums = list;
        System.out.println("--------------------------");
        System.out.println("리스트 : " + list);
        nums.add(10);
        nums.add(500);
        // nums 라는 변수로 접근해서 추가했는데 어째서 list에도 추가가 되었을까
        System.out.println("리스트 : " + list);
        System.out.println("nums : " + nums);

        System.out.println("리스트의 값 존재여부 확인: " + nums.contains(10));
        System.out.println("리스트 요소의 위치(index) 확인: " + nums.indexOf(500));

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

    }
}
