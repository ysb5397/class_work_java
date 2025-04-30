package variable;

public class Var4 {
    public static void main(String[] args) {

        // 변수
        // 변수를 선언했다... 변수에 값을 넣다... 변수를 사용할 수 있다.
        // 변수를 선언할 때 -> 이름짓기

        // 변수 생성 시 규칙
        // 1. 대소문자 명확히 구분하며, 길이의 제한이 없다.
        int age = 10;
        int AGE = 20;
        int aGe = 30;
        // 참고 -> 같은 파일에 같은 이름의 변수를 선언할 수 없다.
        //int age = 20;

        // 2. 자바에서 사용하는 예약어는 사용할 수 없다.
        // int if = 10; -> if는 예약어라 사용 불가능하다.
        // int, double, char, for, while, if 등등

        // 3. 변수 이름은 숫자로 시작할 수 없다.
        // int 30age;
        // int 5age;
        int tel30box; // 숫자가 앞에 오지 않았으므로 가능하다.

        // 4. 특수 문자는 _(언더바), $(달러 기호) 표기만 가능하다.
        int _count;
        int $tel;
        // !abc; -> 사용 불가
        int count_10;
        int $_tel;

        //권장 사항
        //표기법
        // xxx.java 파일을 만들 때
        // 대문자로 시작하고 다음 단어는 소문자로 진행, 그리고 연결 단어 시작은 대문자로 작성
        // HelloJava.java (파일을 만들 때 표기법 ) - 파스칼 케이스

        // int telBox 변수를 선언할 때 표기법
        // 단어 시작은 소문자로 시작하고 연결 단어 시작은 대문자로 시작
        // 카멜 케이스로 작성한다.

    } // end of main
} // end of class
