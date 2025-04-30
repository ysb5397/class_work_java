package com.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();

        customer1.showCustomerInfo();
        System.out.println("--------------");

        customer1.calcPrice(1000);
        customer1.showCustomerInfo();

    }
}
