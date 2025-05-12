package wrapper;

public class WrapperTest1 {

    public static void main(String[] args) {

        // 박싱(Boxing)
        // 기본 데이터를 래퍼 클래스 객체로 변환하는 과정
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num); // Boxing 과정
        System.out.println(wrappedNum); // toString 재정의 되어있어서 주솟값이 아니라 값 자체가 들어옴

        // 언박싱(UnBoxing)
        // 래퍼 클래스 객체를 기본 타입 데이터로 변환하는 과정
        Integer wrappedNum2 = Integer.valueOf(30);
        int num2 = wrappedNum2.intValue();
        System.out.println(num2);

        // java 5 버전 부터 제공된 기능
        // 자동 박싱과 자동 언박싱
        Integer autoBoxed = 20; // 자동 박싱(int값이 Integer 값으로 들어감)
        int autoUnBoxed = autoBoxed; // 자동 언박싱(Integer 값이 int 값으로 들어감.)
    }
}
