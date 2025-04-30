package com._static;

public class Card {

    private String name;
    private static int cardId;

    // 생성자
    public Card(String name) {
        this.name = name;
        cardId = 1;
    }

    public void newCard() {
        System.out.println("카드 발급이 완료되었습니다.");
        System.out.println(name + "카드의 고유 번호는 [" + cardId + "] 입니다.");
        cardId++;
    }


    public static void main(String[] args) {
        // 코드 테스트
        Card card1 = new Card("국민");
        Card card2 = new Card("신한");
        Card card3 = new Card("우리");

        card1.newCard();
        card1.newCard();
        card1.newCard();
        card1.newCard();
        card1.newCard();


    }

}
