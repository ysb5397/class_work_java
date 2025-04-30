package com.inheritance;

public class MainTest1 {
    public static void main(String[] args) {

        // Cal 클래스와 ChildCal 관계는 부모 자식 관계
        ChildCal childCal1 = new ChildCal();

        int result1 = childCal1.sum(1, 10);
        System.out.println("더하기 결과: " + result1);
        
        int result2 = childCal1.differ(100, 10);
        System.out.println("빼기 결과: " + result2);

        // 부모 클래스의 메서드를 자식 클래스에서 재정의 한다면
        // 메서드 오버라이드 라고 한다
        int result3 = childCal1.multiply(10, 0);
        System.out.println("곱하기 결과: " + result3);
        
        // 상속 관계에 있어서 부모 클래스가 먼저 생겨야
        // 자식 클래스가 존재할 수 있음
        
        
        
        
        
    }
}
