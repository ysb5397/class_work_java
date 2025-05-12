package wrapper;

public class WrapperTest3 {

    public static void main(String[] args) {
        // 래퍼 클래스의 활용, String -> 기본 데이터 타입(int, double. boolean)
        String strNum = "123";
        String strDouble = "45.67";
        String strBool = "true";
        String badStr = "a123";

        // 문자열을 정수로 형 변환
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        // 문자열을 실수로 형 변환
        double dNum = Double.parseDouble(strDouble);
        System.out.println(dNum);

        // 문자열을 논리값으로 형변환
        boolean boolNum = Boolean.parseBoolean(strBool);
        System.out.println(boolNum);

        // 예외 처리
        try {
            int num2 = Integer.parseInt(badStr);
            System.out.println(num2);
        } catch (NumberFormatException e) {
            System.out.println(badStr + "을 정수값으로 변경할 수 없습니다.");
        }

        // 가능한 String에서 기본 데이터 타입으로 변환을 할 때 예외처리 코드를
        // 작성해주는 것이 좋다.
    }
}
