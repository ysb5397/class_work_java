package com.array;

// 배열이란 연관된 데이터 타입의 요소들을 통으로 관리하기 위해 사용한다.

public class IntArrayCRUD {

    public static void main(String[] args) {


        // 1. 생성(Create) = C
        // 배열의 길이를 지정해줘야 한다
        // 인덱스 번호를 통해서 각 요소를 찾아갈 수 있음
        // 모든 인덱스의 번호는 0부터 시작
        int[] intArray = new int[5];
        // 배열은 보통 반복문과 함께 사용이 된다
        // 변수명.length 는 길이를 리턴해줌
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (i + 1) * 10;
        }

        // 2. 조회(Read) = R
        for (int i = 0; i < intArray.length; i++)
        System.out.println(intArray[i]);
//        System.out.println(intArray[5]);

        // 3. 수정/업데이트 (Update) = U
        System.out.println("--------------------");
        intArray[2] = 3;
        System.out.println("수정 후 확인: " + intArray[2]);

        // 4. 삭제 (Delete) = D (요쇼에 대한 삭제 개념)
        // 배열은 고정 길이 이므로 특정 인덱스를(int) 0으로 초기화 하여
        // 논리적으로 삭제했다고 할 수 있음
        System.out.println("--------------------");
        intArray[2] = 0;
        System.out.println("삭제 후 확인: " + intArray[2]);


        System.out.println("프로그램 종료");
    }
}
