package collections;

import java.util.*;

public class MySetTest {

    public static void main(String[] args) {

        // 계층 구조 확인, (업캐스팅된 상태)
        Set<Integer> mTestSet = new HashSet<>();

        // 사용 방법
        // Hash : 중복된 요소를 허용하지 않고, 순서가 없는 자료 구조
        HashSet<Integer> numberSet = new HashSet<>();

        numberSet.add(17);
        numberSet.add(100); // 중복값, 추가되지 않음
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(348); // 중복값, 추가되지 않음

        System.out.println(numberSet.size());

        // 요소 제거
        numberSet.remove(1); // 없는 요소를 선택하더라도 오류는 발생하지 않는다
        System.out.println(numberSet.size());

        // 자료구조는 반복문과 함께 많이 사용된다.
        // 향상된 for 구문으로 set 계열의 데이터를 순회
        for (Integer num : numberSet) {
            System.out.println("값 확인: " + num);
        }

        // set 계열을 Literator 타입으로 변환해서 순회시킬 수 있었다
        System.out.println("==================================");
        Iterator<Integer> iter = numberSet.iterator(); // set --> iterator 형 변환

        while (iter.hasNext()) {
            System.out.println(iter.next()); // next()는 요소를 반환
        }
        System.out.println("==================================");

        // set 계열 자료 구조 선언 (정수값만 담을 수 있고 중복 허용 불가)
        HashSet<Integer> lottoNumbers = new HashSet<>();


        while(lottoNumbers.size() < 6) {
            lottoNumbers.add(getRandomNumber());
        }
        System.out.println("로또 번호 6개: " + lottoNumbers.toString());

        // HashSet 데이터 타입을 ArrayList 객체 생성시에, 생성자에 인자값을 넣을 수 있도록 설계
        ArrayList<Integer> sortedList = new ArrayList<>(lottoNumbers);
        //LIGHT 정렬하기
        Collections.sort(sortedList);

        System.out.println(sortedList);

    }

    // 무작위 1부터 45까지 랜덤 번호 생성 함수
    public static int getRandomNumber() {
        Random random = new Random();
        return 1 + random.nextInt(45);
    }
}
