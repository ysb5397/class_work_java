package _string;

public class StringTest2 {
    // 변수
    // 생성자
    // 메서드

    public static void main(String[] args) {
        // String Pool(heap)
        String str1 = "문자열";

        // 그냥 힙메모리
        String str2 = new String("abc");
        String str3 = new String("abc");

        // 참조 비교 : 각각에 객체의 주솟값을 비교한다. 주소 == 주소
        System.out.println("str2 == str3 : " + (str2 == str3));

        // 문자열을 리터럴 방식으로 만들어보자.
        // 문자열은 아주 많이 사용되는 데이터
        String str4 = "abc";
        String str5 = "abc";
        String str6 = "abc";
        System.out.println("str4 == str5 : " + (str4 == str5));

        String str7 = str6 + "안녕";
        System.out.println(str7);

    }
}
