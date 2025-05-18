package time;

import java.util.Calendar;
import java.util.Date;

public class OldDateExample {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("현재시간: " + now);

        // 직접 new 못하게 개발자가 막아둠.
//        Calendar cal = new Calendar() {};
        Calendar cal = Calendar.getInstance();
        cal.set(2025, 3, 14); // 이것도 인덱스처럼 생각하면 된다. 따라서 5월은 4라고 적어야 한다.
        System.out.println("설정된 날짜: " + cal.getTime());
    }
}