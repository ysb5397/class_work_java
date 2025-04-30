package ch08;

public class Student {

    // 생성자 (constructor)
    // 객체를 생성할 때, 다음과 같은 모양으로 만들라고 지시하는 것
    // 강제성을 부여하는 것과 같다.
    // !!! 생성자는 객체를 생성할 때, 반드시 존재해야함.

    String name;
    int number;
    int grade;

    // 생성자 문법 - 대소문자가 클래스 이름과 같아야함.
    // 기본 생성자 - 개발자가 생성자를 하나라도 만들지 않으면
    // 컴파일러가 .java --> .class 변환할 때 자동으로 코드를 넣어준다
//    public Student() {
//
//    }

    // 기본 생성자
    public Student() {}

    // 사용자
    public Student(String s, int n, int g) {
        name = s;
        number = n;
        grade = g;
    }
}
