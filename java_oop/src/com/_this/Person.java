package com._this;

// 클래스를 설계하는 쪽

public class Person {

    // this에 3가지 사용법이 존재한다.
    // 1. 자기 자신의 주소를 가리킨다
    // 2. 생성자에서 다른 생성자를 호출 할 때 사용할 수 있다.
    // 3. 자신의 주소를 반환시킬 수 있다

    private String name;
    private int age;
    private String phone;
    private String gender;

    // 사용 방법
    // 첫번째
    public Person(String name , int age) {
        // 매개 변수 = 매개 변수
        // 멤버 변수 = 매개 변수
        this.name = name;
        this.age = age;
        System.out.println("1번 생성자 호출됨");
    }

    // this();
    // this는 생성자에서 다른 생성자를 호출 할 수 있다
    public Person(String name, int age, String phone) {
//        System.out.println("111111111111111");
//        this.name = name;
//        this.age = age;
        this(name, age); // 두번째 사용방법
        this.phone = phone;
        System.out.println("2번 생성자 호출됨");
    }

    public Person(String name, int age, String phone, String gender) {
        this(name, age, phone);
        this.gender = gender;
        System.out.println("3번 생성자 호출됨");
    }

    // 1. 현재 생성돤 객체, 즉 나의 주소를 외부로 반환 시킬 수 있다.
    // 디자인 패턴 ( 프로그램을 작성할 때 일관된 문제가 발생할 수 있음 )
    // 특정 코드릐 패턴을 만들어서 해결하는 방법적인 코드 패턴
    public Person getPerson() {
        return this;
    }



}
