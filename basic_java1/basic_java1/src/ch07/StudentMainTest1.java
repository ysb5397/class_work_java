package ch07;

// 학생 코드를 실행하는 코드
public class StudentMainTest1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentId = 1;
        s1.studentName = "티모";
        s1.address = "푸른 언덕";

        s2.studentId = 2;
        s2.studentName = "샤코";
        s2.address = "붉은 언덕";


        // 객체에 동작을 시켜보자
        s1.showInfo();
        s2.showInfo();
        System.out.println("---------------------------------");

        s1.study();
        s2.study();

        System.out.println("---------------------------------");
        s1.breakTime();
        s2.breakTime();
        System.out.println("---------------------------------");

        // 코드 테스트
        s1.takeTest();
        s2.takeTest();
        System.out.println("---------------------------------");

        s1.cleaning();
        s2.cleaning();
        System.out.println("---------------------------------");

    } // end of main
} // end of class
