package com.polymorphism;

public class FruitTest1 {
    public static void main(String[] args) {

        /// 다양한 형태로 바라볼 수 있다. - > 다형성
        Fruit fruit1 = new Banana(); /// 업캐스팅
        Fruit fruit2 = new Peach(); /// 업캐스팅

        fruit1.showFruitInfo();
        System.out.println("------------");
        fruit2.showFruitInfo();
        System.out.println("--------------");

        /// 사전기반지식 - 컴파일, 런타임
        /// 위 상황에서 바나나의 원산지 정보를 출력
        /// 업 캐스팅된 상태: 컴파일 시점에 부모에 있는 변수나 메서드만 확인 가능
        String result = ((Banana)fruit1).origin; /// 다운 캐스팅
        System.out.println("바나나 원산지: " + result);
//        System.out.println(((Banana)fruit1).origin);
        System.out.println("-------------------------");

        /// 키워드 - 인스턴스 오브 연산자
        // instanceof --> 예약어
        if (fruit1 instanceof Peach) {
            System.out.println("여기 들어올까? 1");
        }

        if (fruit1 instanceof Banana) {
            System.out.println("여기 들어올까? 2");
        }

        System.out.println("---------------------");

        // TODO 도전 문제
        // TODO 과일1 에서 메서드 호출
        ((Banana)fruit1).saleBanana();
        fruit1.showFruitInfo();
        System.out.println("---------------------");

        ((Banana)fruit1).saleBanana();
        fruit1.showFruitInfo();


    }
}
