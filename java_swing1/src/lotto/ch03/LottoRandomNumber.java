package lotto.ch03;

import java.util.Arrays;
import java.util.Random;

/**
 * SRP - 클래스를 설계할 때의 원칙 중 하나
 *  단일 책임의 원칙(클래스는 가능한 단 하나의 책임을 가지는 것이 좋다.)
 */

public class LottoRandomNumber {

    static final int LOTTO_NUMBER_COUNT = 6;

    // 메서드 : 6개의 랜덤번호가 필요(중복 제거, 정렬)
    public int[] createNumber() {

        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];
        Random random = new Random();

        for (int i = 0; i < lottoWinNum.length; i++) {
            lottoWinNum[i] = 1 + random.nextInt(45);

            // outer for문
            // 처음에는 조건식이 false라 실행 안함
            for (int j = 0; j < i; j++) {
               if (lottoWinNum[j] == lottoWinNum[i]) {
                   i--;
               }
            }

        } // outer for
        // 정렬 방법(오름차순)
        Arrays.sort(lottoWinNum);
        return lottoWinNum;
    }

    public static void main(String[] args) {
        LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
        int[] result = lottoRandomNumber.createNumber();

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
