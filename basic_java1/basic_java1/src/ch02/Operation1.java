package ch02;

// 부호 연산자 ( +, - )
// 단항 연산자

public class Operation1 {
    public static void main(String[] args) {

        // 부호 연산자는 사용하는 당시 부호를 변경할 뿐
        // 실제 값이 변경되지는 않는다.
        int intData = 1000;
        System.out.println(+intData);
        System.out.println(-intData);
        System.out.println("-----------");
        System.out.println(intData);

        // 실제 값을 변경하려면 코드를 어떻게 작성해야 할까?
        // intData 상자 안에 값을 -1000으로 변경하려면 어떤 연산자를 사용?
        // 답) 메모리 공간안에 실제 값을 변경하려면 대입 연산자를 사용
        intData = -intData;
        System.out.println("intData: " + intData);

        // 절대값?
        // 절대값은 어떤 수의 크기를 나타내는 것으로 그 수가 0에서 얼마나 떨어져 있는지를 표시
        // 즉, 어떤 수의 절댓값은 그 수가 양수이든 음수이든 부호를 버려 항상 양수이다.

        // 연습
        int oneStepDistance = 1;
        final int ZERO_POINT = 0;
        int currentPosition = 0;

        // 제로 포인트에서 왼쪽으로 3칸 이동한 값을 출력하시오
        currentPosition = ZERO_POINT - (oneStepDistance) * 3;
        System.out.println(currentPosition);

        // 절댓값으로 구하시오 --> 양수

        // 자바는 풍부는 기능을 제공하는 언어
        // 자바 개발자들이 수학 관련 식을 거의 만들어 둔 상태
        // Math.abs()가 절댓값 구해주는 기능
        System.out.println(Math.abs(currentPosition));



    } // end of main
} // end of main
