package ch03;

public class IfTest3 {
    public static void main(String[] args) {

        int studentAge = 30;

        // if else 반복 조건식 순서가 중요하다
        // 만약 학생이 7살 이하라면 -> 미취학 아동 으로 출력
        // 만약 학생이 13살 이하라면 -> 초등학생 으로 출력
        // 만약 학생이 16살 이하라면 -> 중학생 으로 출력
        // 만약 학생이 19살 이하라면 -> 고등학생 으로 출력

        // 1. 수행이 될 수도 있고 안될 수도 있다
//        if (studentAge <= 7) {
//            System.out.println("미취학 아동");
//        } else if (studentAge <= 13) {
//            System.out.println("초등학생");
//        } else if (studentAge <= 16) {
//            System.out.println("중학생");
//        } else if (studentAge <= 19) {
//            System.out.println("고등학생");
//        }

        if (studentAge <= 7) {
            System.out.println("미취학 아동");
        } else if (studentAge <= 13) {
            System.out.println("초등학생");
        } else if (studentAge <= 16) {
            System.out.println("중학생");
        } else if (studentAge <= 19) {
            System.out.println("고등학생");
        } else {
            // 위 조건들이 하나도 포함이 안된다면 else 구문이 실행된다.
            System.out.println("성인");
        }

    } // end of main
} // end of class
