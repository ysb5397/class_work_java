package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyHandling {
    public static void main(String[] args) {

        // try-catch-finally
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("숫자를 입력해주세요: ");
            int result = scanner.nextInt();
            System.out.println("입력한 숫자: " + result);
        } catch (InputMismatchException I) {
            System.out.println("숫자를 입력해주세요.");
        } catch(Exception e) {
            System.out.println(e.getClass());
            System.out.println("오류가 발생 되었습니다!");
        } finally {
            // 반드시 수행되어야 하는 코드를 입력하는 영역
            // 심지어 return 키워드를 만나더라도 여기는 수행이 됨
            scanner.close(); // 스트림을 또는 자원을 해제
            System.out.println("자원을 해제 했습니다.");
        }
        System.out.println("비정상 종료 안됨");
    }
}
