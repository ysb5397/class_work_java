package ch07;

// 코드를 실행시켜 보는쪽
public class FunctionMainTest1 {

    // main 함수
    public static void main(String[] args) {

        // 여기에서 함수를 호출해서 사용 가능
        int sub1Result1 = sub1(100, 50); // 모양 맞추기
        System.out.println(sub1Result1);

        int sub1Result2 = sub1(5, 1);
        System.out.println(sub1Result2);

        // 모양을 맞추지 않으면 오류가 난다
//        sub1(0.5, 1);
//        sub1(true, 1);
//        sub1("d", 1);

        // add1 함수 호출
        int sumResult1 = add1(4, 5, 10);
        System.out.println(sumResult1);

    } // end of main

    // 함수 선언 - 두 수를 받아서 뺄셈하는 함수를 설계
    static int sub1(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    static int add1(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result; // 실행의 제어권을 반납
    }


} // end of class
