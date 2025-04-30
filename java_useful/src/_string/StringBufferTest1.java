package _string;

public class StringBufferTest1 {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");

        // 새로 배우는
        StringBuffer buffer1 = new StringBuffer(str1);
        System.out.println("수정 전 : " + System.identityHashCode(buffer1));
        // buffer1 의 값을 수정해보자
        buffer1.append(str2);
        buffer1.append("!111");
        buffer1.append("22222");
        System.out.println("수정 후 : " + System.identityHashCode(buffer1));

        // hashcode 해당 객체의 유일성을 보장하는 정수 값
        // API 8 버전에서는 buffer1.toString(); 해야 값을 확인 가능
        System.out.println(buffer1);

        // StringBuffer 데이터 타입을 String 으로 형변환 하려면 .toString()을 호출 하면 됨
        String result = buffer1.toString();


    }
}
