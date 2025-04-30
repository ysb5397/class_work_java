package com.inheritance;

/**
 * 상속이라는 기법을 배운 개발자라면
 * A 클래스의 속성과 상태를 물려받을 수 있음
 *
 * 단일 상속만을 지원한다.
 * A가 부모 클래스, C가 자식 클래스가 됨
 */

public class C extends A {
    // 여기 코드에는 보이지 않지만 자동으로 A에 선언된
    // 필드를 물려 받겠다는 의미

    int level;
    String nickName;
}
