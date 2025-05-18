package time;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculation {

    public static void main(String[] args) {
        //  나이 계산해보기
        LocalDate birth = LocalDate.of(2000, 5, 13);

        // 현재 날짜 가져오기
        LocalDate today = LocalDate.now();

        // 기간 차이
        Period age = Period.between(birth, today);

        // 나이를 연도 단위로 추출
        System.out.println(age.getYears());

    }
}