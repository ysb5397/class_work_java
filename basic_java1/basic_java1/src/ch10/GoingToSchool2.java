package ch10;

public class GoingToSchool2 {
    public static void main(String[] args) {

        // 버스 객체를 3개 생성해 보시오
        Bus b1 = new Bus(1003);
        Bus b2 = new Bus(1004);
        Bus b3 = new Bus(1005);

        // 학생 객체를 2명 생성해 보시오
        Student s1 = new Student("스티브",20000);
        Student s2 = new Student("알렉스",25000);

        //학생이 버스를 타는 행위를 만들어 보시오
        s1.takeBus(b1);
        s2.takeBus(b3);

        // 버스의 상태창을 출력해서 결과 확인
        b1.showInfo();
        b3.showInfo();

    } // end of main
} // end of class
