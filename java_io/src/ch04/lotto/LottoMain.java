package ch04.lotto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LottoMain {
    private int n = 0;
    private int m = 0;
    static int totalCount = 0;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        GenerateLottoNumber genLottoNumber = new GenerateLottoNumber();
        WriteNumberToFile writeNumberToFile = new WriteNumberToFile();

        while(true) {
            System.out.println("로또 번호를 몇 회 생성하시겠습니까?\n만약 종료 하고 싶다면 -1을 입력해주세요.");
            try {
                n = scanner.nextInt();

//                if (n > 10) {
//                    System.err.println("10회 이하로 입력해주세요!");
//                } else

                if (n == -1) {
                    System.out.println("프로그램을 종료함에 따라 로또 번호 출력 횟수는 초기화 됩니다.");
                    break;
                } else if (n != 0 && !(n < -1)) {
                    // n은 로또 몇 번 생성할 건지를 의미
                    // m은 로또 번호가 몇 번 생성되었는지를 의미
                    // totalCount는 로또 번호가 총 몇번 생성 되었는지 의미
                    // 이때, m은 다시 반환되어서 프로그램이 종료하기 전까지 기록된다.
                    totalCount += n;
                    while (!(m >= totalCount)) {
                        m = genLottoNumber.generateLottoNumber(n, m);
                        m = writeNumberToFile.writeToFile(n, m);
                    }
                } else {
                    System.err.println("잘못된 입력값입니다!");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                throw new InputMismatchException("숫자만 입력해주세요!");
            } finally {
                if (n == -1) {
                    scanner.close();
                }
            }
        }
    }

    public static void main(String[] args) {
        LottoMain lottoMain = new LottoMain();
        lottoMain.start();
    }
}
