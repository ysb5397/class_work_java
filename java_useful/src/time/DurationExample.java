package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {
        // 시간 차이 계산
        LocalTime start = LocalTime.of(9, 0); // 오전 9시
        LocalTime end = LocalTime.of(11, 30);

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMinutes() + "분");
        System.out.println(duration.toSeconds() + "초");
    }
}