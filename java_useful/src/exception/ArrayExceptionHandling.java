package exception;

public class ArrayExceptionHandling {

    public static void main(String[] args) {
        // 배열 - 5
        // 인덱스의 길이 - 4
        int[] arr = {1,2,3,4,5};

        // 예외처리 try-catch 구문의 이해
        // 예외처리 try-catch-finally 구문 이해

        try {
            // 예외가 발생할 가능성이 있는 코드를 넣어준다.
            for (int i = 0; i < 10; i++) {
                System.out.println("[" + i + "] " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("배열의 범위를 넘었습니다.");
        } catch (Exception e2) {
            // 에외가 발생했다면 예외 처리를 만들어 줄 수 있음
            System.out.println(e2.getClass());
        }
        System.out.println("비정상 종료되지 않았습니다");
    }
}
