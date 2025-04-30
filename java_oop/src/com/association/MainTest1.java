package com.association;

public class MainTest1 {
    public static void main(String[] args) {

        Course course1 = new Course("자바");
        Course db = new Course("데이터 베이스");

        Student student1 = new Student("철수");

        student1.listenCourse(course1);
        student1.showCourseInfo();

        student1.exitCourse(course1);
        student1.exitCourse(course1);

    }
}
