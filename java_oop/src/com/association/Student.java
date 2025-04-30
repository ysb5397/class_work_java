package com.association;

public class Student {

    private String name;
    private Course course; // 연관 관계

    public Student(String name) {
        this.name = name;
        course = null; // 초기에는 수강을 하지 않음.
    }

    // 수강을 듣다. ( 과목에 대한 정보는 course에 있음 )
    public void listenCourse(Course course) {
        this.course = course;
        System.out.println(name + "이(가) " + course.getName() + " 강의를 수강합니다!");
    }

    public void exitCourse(Course course) {
        if (this.course != null) {
            System.out.println(name + "이(가) 수강하던 " + this.course.getName() + "강의를 취소했습니다.");
            this.course = null;
        } else {
            System.out.println("원래부터 수강하지 않던 강의 입니다.");
        }
    }

    // 학생의 현재 수강 상태를 보여주는 기능
    public void showCourseInfo() {
        if (this.course != null) {
            System.out.println(name + "이(가) 현재 " + this.course.getName() + " 강의를 수강 중입니다.");
        } else {
            System.out.println("현재 수강하는 과목이 없습니다!");
        }
    }
}
