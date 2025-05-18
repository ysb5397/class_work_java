package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KoreanDateTimeFormatting {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        // 국내 시간 표기(ex - 2025년 05월 14일 12시 00분)
        // 패턴 지정 가능
        // yyyy(연도), MM(월), dd(일), HH(시), mm(분), ss(초)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("ss초");
//        now.format(formatter);
        // 정의한 포맷 형태로 현재 시간을 출력해준다.
        System.out.println("날짜: " + now.format(formatter));
        System.out.println("날짜: " + now);
        System.out.println(now.format(formatter2));
    }
}