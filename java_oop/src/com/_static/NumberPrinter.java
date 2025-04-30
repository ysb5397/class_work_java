package com._static;

public class NumberPrinter {

    // static 변수 및 메서드는 객체 생성 없이 클래스 이름으로 바로 접근 가능하다.
    // heap 메모리 안에 들어가기 위해서는 new 키워드와 생성자 호출 후
    // 동작할 수 있지만, method area는 프로그램을 실행시키면
    // 바로 메모리를 할당 받아 실행되는 영역


    private int id;
    // 멤버 변수
    public static int waitNumber; // static 변수 선언(클래스 변수)
    //waitNumber -> 멤버 변수가 아니라 class area에 포함된다.

    public NumberPrinter(int id) {
        this.id = id;
        waitNumber = 1;
    }

    // 번호표를 출력합니다
    public void printWaitNumber() {
        System.out.println(id + "번 기기의 대기 순번은 : [" + waitNumber + "] 입니다.");
        waitNumber++;
    }


}
