package ch03;

// 빠른 평가란?
// 논리 연산에서 첫 번째 조건이 결과를 결정할 경우
// 두번째 조건을 평가하지 않는 것

public class Operation8 {
    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리 합(||) 에서 빠른 평가가 되는 식을 만들어 보자.
        // 논리 합 --> 첫 번째 조건이 참인 경우, 그 다음은 평가하지 않음.

        boolean result = ((number -= 2) < 7) || ((index += 2) > 3);
        System.out.println(result);

        // 처음 조건에서 number가 3이 되었고, 이는 7보다 작다는 조건에 참이다.
        // 따라서 두번째 조건과는 상관없이 어차피 참이므로 평가는 끝난다.
        // number는 3으로 변동O, index는 평가가 끝남에 따라 0으로 변동X
        System.out.println(number);
        System.out.println(index);


    } // end of main
} // end of class
