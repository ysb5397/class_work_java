package ch04.lotto;

import java.util.Arrays;
import java.util.Random;

public class GenerateLottoNumber {
    private Random random = new Random();
    private int[] temps = new int[6];
    private int count = 0;

    static String[] nums = new String[6];

    public int generateLottoNumber(int n, int m) {
        for (int i = 0; i < temps.length; i++) {
            temps[i] = (random.nextInt(45) + 1);
            count++;
            for (int j = 0; j < i; j++) {
                if (temps[j] == temps[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println((m + 1) + "회차 로또번호는 " + count + "번 뽑았습니다.");
        count = 0;
        Arrays.sort(temps);

        for (int k = 0; k < GenerateLottoNumber.nums.length; k++) {
            nums[k] = temps[k] + "";
        }

        return m;
    }
}
