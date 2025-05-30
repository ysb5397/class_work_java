package ch04.lotto;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNumberToFile {
    private String targetFile = "lotto.txt";

    public int writeToFile(int n, int m) {
        int size = GenerateLottoNumber.nums.length;

        try (FileWriter fw = new FileWriter(targetFile, true)) {
            fw.write((m + 1) + "회차 로또번호: ");
            m++;

            for (int j = 0; j < size; j++) {
                fw.write(GenerateLottoNumber.nums[j] + " ");
            }

            if (m == LottoMain.totalCount) {
                fw.write("\n한번에 생성한 로또 숫자 조합: " + n + "개\n---------------------------------------\n");
                fw.flush();
            } else {
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("오류 발생 : " + e.getMessage());
        }
        return m;
    }
}
