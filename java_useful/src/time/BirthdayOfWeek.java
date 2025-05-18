package time;

import java.time.LocalDate;

public class BirthdayOfWeek {

    public static void main(String[] args) {
        // 2000년 5월 13일 무슨 요일일까?
        LocalDate birthday = LocalDate.of(2000, 5, 13); // 이건 또 달이 1부터 시작

        // 해당 날짜의 요일을 반환
        System.out.println("날짜 반환: " + birthday.getDayOfWeek());
    }
}