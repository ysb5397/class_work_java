package com.polymorphism;

public class EMart {

    public static void main(String[] args) {

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        // 배열
        // 배열을 사용할 때는 크기를 먼저 지정해야 한다.
        // 배열의 길이와 요소의 길이(크기) 는 항상 동일한 것은 아니다
        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

        Peach[] peaches = new Peach[3];
        peaches[0] = new Peach();
        peaches[1] = new Peach();

        System.out.println("--------------------------");
        // 다형성 -> 유연한 코드를 작성할 수 있다.
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();

        // TODO 도전문제
        for (int i = 0; i < fruits.length; i++) {
            // 배열 안에 들어 있는 각각의 객체 showInfo 호출
            // 만약 데이터 타입이 바나나일 경우, 원산지 정보와 세일 메서드를 출력하게 코드 작성
            if ((fruits[i] != null)) {
                fruits[i].showFruitInfo();
                /// 아래는 바나나를 타입인가를 인식하는 구문
                if (fruits[i] instanceof Banana) {

                    String origin = ((Banana)fruits[i]).origin; // 다운 캐스팅
                    System.out.println(origin);

                    ((Banana)fruits[i]).saleBanana();
                }
            } else {
                System.out.println("----------");
                System.out.println("이제 들어있는 과일이 없습니다.");
            }




        }
        // 코드 실행시 오류가 발생하면 안됨


    }

}
