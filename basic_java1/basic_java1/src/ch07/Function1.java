package ch07;

public class Function1 {

    // 함수를 만들어보자 (함수를 설계하는 코드)
    // 함수를 만들기 위해서는 당연히 머리속에 어떻게 코드를 만들지 들어가 있어야함
    // 두 개의 정수값을 받아서 덧셈 연산을 하고 그 결과를 반환 하는 함수 만들기

    // static --> 아직 생략,
    // int --> 반환 되는 데이터 타입
    // add --> 함수의 이름
    // 괄호안 --> n1과 n2는 매개 변수(parameter)
    // {} --> 함수의 몸통 부분
    static int add(int n1, int n2) {
//        int result = n1 + n2;
        // 클래스 바로 아래 쓰는 변수 - 멤버 변수
        // 함수 안에 선언하는 지역 변수
        int result; // 지역 변수 선언
        result = n1 + n2;
        return result;
    }

    // 기능 묶음 (세 개의 정수값을 받아 덧셈 연산)
    static int add2(int n1, int n2, int n3) {
        int result; // 지역 변수 선언
        result = n1 + n2 + n3;
        return result;
    }

    static double add3(double d1, double d2) {
        double result = d1 + d2; // 지역 변수 선언 및 초기화
        return result;
    }

    // 함수 -> 콘솔창에 안녕 내 나이는 XX이야. 출력
    // void -> 텅 빈
    static void sayHello(int myAge) {
        System.out.println("안녕 내 나이는 " + myAge + "이야.");
        // 리턴 타입 void -> 반환 값이 없다. 따라서 return이 필요없다
    }

} // end of class
