package exercise;

public class Exercise5 {
    public static void main(String[] args) {

        //도전 과제
        // 당신은 전자 상거래 웹사이트를 운영하고 있으며, 특정 제품에 대해 할인 행사를 진행하려고 합니다.
        // 제품의 원래 가격은 59.99 달러이고, 30% 할인을 적용하려고 합니다. 최종 가격을 계산한 후, 소수점 이하를 버리고 점수 부분만은 가격으로 표시

        // 제품의 원래 가격과 할인율을 상수로 선언
        final double ORIGINAL_COST = 59.99;
        final int DISCOUNT_RATE = 30;

        // 할인된 가격을 계산하고, 그 결과를 정수로 형변환 하여 최종가격 구하기
        // { 원가 * ( 100 - 할인율 )} / 100
        double discountPrice = ((ORIGINAL_COST * (100 - DISCOUNT_RATE)) / 100);


        // 최종 가격 출력
        System.out.println((int) discountPrice);

    } // end of main
} // end of class