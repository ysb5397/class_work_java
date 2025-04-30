package com._this;

// 클래스를 설계하는 쪽

public class PersonMainTest {

    public static void main(String[] args) {
//        Person p1 = new Person("홍길동", 10, "010-0000-0000");
        Person p1 = new Person("홍길동", 10, "010-0000-0000","F");

        // 결과 값
        System.out.println(p1.getPerson());

    }
}