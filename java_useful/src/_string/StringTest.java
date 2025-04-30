package _string;

public class StringTest {
//    자바의 String 클래스에는 replace, substring 메서드가 있습니다.
//
//    문제 1
//    replace 메서드에 대한 개념을 정리 하고 간단한 테스트 코드를 작성해보세요.

    public static void main(String[] args) {

        String char1 = "안녕하세요. 반갑습니다.";
        System.out.println(char1);

        String result1 = char1.replace("안녕","감사");
        String result2 = char1.replace("반","한");
        System.out.println(result1);
        System.out.println(result2);

        // -> String 데이터를 가진 변수명을 만든 후
        // 변수명.replace(바꾸고 싶은 문자, 새로운 문자)을 입력해 어딘가에 값을 넣고
        // 출력하면, 변수명의 값이 뒤의 새로운 문자열로 변경된다.

        String result3 = char1.substring(0);
        System.out.println(result3);

        System.out.println("----------------");
        for (int i = (char1.length() - 1); i > -2; i--) {
            System.out.println(char1.substring(0, i+1));
        }
        System.out.println("----------------");

        // 변수명.substring(숫자)을 입력해 어딘가에 값을 넣고
        // 출력하면, 해당하는 숫자의 자리부터 출력된다.(최소값은 0이다. 당연하게도 최댓값은 문자열의 최대길이.)
        // 따라서 변수명.length() 를 넣으면 가장 끝자리로 설정되므로 아무것도 보이지 않는다.

        // --------------------------------------
        String str1 = "ABCD";
        int countStr1 = str1.length();
        System.out.println(countStr1);

        String str2 = "Hello World";
        String strResult = str2.replace("World","Java");

        System.out.println(str2);
        System.out.println(strResult);

        // subString 문자열 일부를 추출하여 새로운 문자열을 반환
        // 두 가지 오버로딩된 메서드를 제공
        // start index는 포함
        // end index는 불포함
        String subResult = str2.substring(0, 5);
        System.out.println(subResult);
    }
}
