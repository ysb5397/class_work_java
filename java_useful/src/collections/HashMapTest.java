package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        // 계층 구조 확인
        Map<String, String> map;

        // Map 계열 자료 구조 객체 선언
        Map<String, String> books = new HashMap<>();

        // CRUD
        books.put("A", "A1");
        books.put("B", "B1");
        books.put("C", "C1");

        // 특정 Key 값으로 value 값 읽기
        String value = books.get("A");
        System.out.println("값: " + value);
        String value2 = books.get("A22");
        System.out.println("값: " + value2); // 없는 키 값을 요청하면 null값 반환

        // 데이터 수정
        books.put("B", "업데이트 됨");
        System.out.println(books.get("B"));

        // 데이터 삭제하기
        books.remove("C");
        // size() 확인
        System.out.println("Map size() 확인: " + books.size());
        // key값만 확인하는 메서드
        System.out.println("keySet 메서드: " + books.keySet());
        // value값만 확인하는 메서드
        System.out.println("values 메서드: " + books.values());
        System.out.println("=========================");

        // for
        for(String key : books.keySet()) {
            System.out.println("key: " + key);
            System.out.println("value: " + books.get(key));
        }

        // Iterator 를 사용해서 순회 시켜보자
        Iterator<Map.Entry<String, String>> iter = books.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println("key : " + entry.getKey() + ", " + "value : " + entry.getValue());
        }

        System.out.println("Map(books)의 크기를 반환: " + books.size());

        // 전체 요소 삭제
        books.clear();
        System.out.println(books.keySet());
    }
}
