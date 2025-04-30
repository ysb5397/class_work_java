package com._this;

// this 문법
// this() 뮨법

public class UserInfoMainTest {

    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("test","tester1234","tester","test_company", "010-0000-0000");
        System.out.println(user1);
        System.out.println("-----------------------");

        String outerUserId = user1.getUserId();
        String outerUserPassword = user1.getUserPassword();
        String outerUserName = user1.getUserName();
        String outerUserAddress = user1.getUserAddress();
        String outerPhoneNumber = user1.getPhoneNumber();

        user1.setUserId("water");
        user1.setUserPassword("waterH20");
        user1.setUserName("물");
        user1.setUserAddress("earth");
        user1.setPhoneNumber("010-0820-0820");

        user1.showInfo();


    }

}
