package com.inheritance;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private Double bonusRatio = 0.01;

    public Customer() {

    }

    public int calcPrice(int price) {
        bonusPoint += (int) (price * bonusRatio);
        System.out.println(price + "원의 물건을 구매하고 " + bonusPoint + "점의 포인트를 적립했습니다!\n(적립률: " + (bonusRatio * 100) + "% 적용)");
        return bonusPoint;
    }

    public void showCustomerInfo() {
        System.out.println("------ [회원 정보] ------");
        System.out.println("회원 아이디: " + customerId);
        System.out.println("회원 이름: " + customerName);
        System.out.println("회원 등급: " + customerGrade);
        System.out.println("보너스 포인트: " + bonusPoint);
        System.out.println("보너스 포인트 적립 비율: " + (bonusRatio * 100) + "%");
    }
}
