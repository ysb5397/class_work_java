package com.starcraft_v02;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {

        Zealot zealot1 = new Zealot("질럿1");
        Marine marine1 = new Marine("마린1");
        Zergling zergling1 = new Zergling("저글링1");

        zealot1.attack(marine1);
        System.out.println("-------------------");

        marine1.attack(zergling1);
        System.out.println("-------------------");

        zergling1.attack(zealot1);
        System.out.println("-------------------");


    }
}
