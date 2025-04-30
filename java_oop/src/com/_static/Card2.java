package com._static;

public class Card2 {

    // static 변수: 모든 card 객체가 공유하며, 고유 번호 생성을 위함
    private static int cardCounter = 0;

    // 인스턴스 변수
    private final int CARD_ID;
    private final String CARD_NAME;

    public Card2(String CARD_NAME) {
        this.CARD_NAME = CARD_NAME;
        this.CARD_ID = ++cardCounter;
    }

    // static 메서드
    public static int getTotalCards() {
        // static 메서드 안에서 인스턴스 변수를 사용할 수 없다
        // 인스턴스 변수는 객체가 생성된 이후에 사용할 수 있기 때문
//        System.out.println(CARD_NAME);
        return cardCounter;
    }

    // 인스턴스 메서드
    public void showInfo() {
        System.out.println(cardCounter);
        System.out.println(CARD_NAME + "의 고유 번호는 [" + CARD_ID + "] 입니다.");
    }

    public static void main(String[] args) {
        // 코드 테스트
        // static 변수는 객체 생성 전에 사용 가능
        // static 메서드는 객체 생성 전에 사용 가능
        // 사용 방법 ( 클래스의 이름으로 접근 가능 )
        System.out.println(Card2.cardCounter);
        // static 메서드
        // 따라서 객체 생성 전에 호출 가능
        System.out.println(Card2.getTotalCards());


//        Card2 c1 = new Card2("우리카드1");
//        System.out.println(c1.CARD_ID);


    }

}
