package wrapper;

public class WrapperTest2 {

    public static void main(String[] args) {
        // 응용
        // double 데이터 타입을 래퍼 클래스로 변환
        // 박싱, 언박싱 예제 코드 작성
        double aDouble = 10.4;
        Double wrapper1 = Double.valueOf(aDouble);
        System.out.println(wrapper1);

        Double wrapper2 = Double.valueOf(30.4);
        double aDouble2 = wrapper2.doubleValue();
        System.out.println(aDouble2);

        // 자동 박싱과 언박싱 코드 작성
        Double autoWrapper = 30.4;
        double autoUnWrapper = autoWrapper;

        //LIGHT --------------------------------------
        byte byte1 = 24;
        Byte wrapperByte = Byte.valueOf(byte1);

        Byte wrapperByte2 = 9;
        byte byte2 = wrapperByte2.byteValue();

        boolean isWrapped = false;
        Boolean wrapBoolean = Boolean.valueOf(isWrapped);

        Boolean unWrapBoolean = Boolean.valueOf(true);
        boolean isUnWrapped = unWrapBoolean.booleanValue();
    }
}
