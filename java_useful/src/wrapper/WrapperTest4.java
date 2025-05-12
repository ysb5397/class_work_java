package wrapper;

public class WrapperTest4 {

    public static void main(String[] args) {
        // 기본 타입을 문자열로 바꾸는 방법
        // 1. 가장 쉬운 방법
        System.out.println(10 + "");
        String str1 = 15.5 + "";

        // 2. String 클래스의 valueOf() 메서드 활용
        int value = 5000;
        String strValue = String.valueOf(value);
        System.out.println(strValue);

        float value2 = 500.123f;
        String strValue2 = String.valueOf(value2);
        System.out.println(strValue2);
    }
}
