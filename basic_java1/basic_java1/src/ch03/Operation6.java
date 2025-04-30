package ch03;

public class Operation6 {
    public static void main(String[] args) {
        // 쇼핑몰 회원 정보를 설정

        int userAge = 20; // 사용자의 나이
        int cartTotal = 50_000; // 장바구니 총액(원) , 대신 _(언더바)로 단위 표현 가능
        System.out.println(cartTotal);
        boolean isMember = true; // 회원 여부
        int couponCount = 2; // 보유 쿠폰

        // 1. 무료 배송 조건 : 장바구니 총액이 3만원 이상이고 회원 이어야 한다.
        boolean freeShipping = (cartTotal >= 30000) && isMember;
        System.out.println("무료 배송 가능 여부: " + freeShipping);

        // 2. 할인 조건 : 나이가 19세 이상 이거나 쿠폰이 한 개 이상 있어야 함.
        boolean canDiscount = (userAge >= 19) || (couponCount >= 1);
        System.out.println("할인 가능 여부: " + canDiscount);

        // 3. 구매 제한 조건 : 나이가 19세 미만이고 회원이 아닌 경우
        boolean purchaseRestricted = (userAge < 19) && !isMember;

        // 4. 이벤트 참여 조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개 미만
        boolean canJoinEvent = (cartTotal < 50000) || (couponCount < 3);
        System.out.println("이벤트 가능 여부: " + canJoinEvent);

        // 연습 문제
        // 1. 직접 문제를 만들고 식을 세워서 출력 하시오.
        // 구매를 위해 검색을 할 때, 별점 5점과 가격이 2만원 이하를 동시에 만족하는 상품을 찾을 때
        int ratingTag = 0;
        int costTag = 10000;

        boolean canFind = (ratingTag == 5) && (costTag <= 20000);
        System.out.println("상품 검색 여부: " + canFind);

    } // end of main
} // end of class
