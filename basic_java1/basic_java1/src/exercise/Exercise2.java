package exercise;

public class Exercise2 {
    public static void main(String[] args) {
        // 1. 데이터 10, 100, 100을 변수 선언과 동시에 초기화 하고 화면에 출력
        int data1 = 10;
        int data2 = 100;
        int data3 = 100;
        System.out.println("현재 data1: " + data1);
        System.out.println("현재 data2: " + data2);
        System.out.println("현재 data3: " + data3);

        // 2. int ageBox 상자에 20을 담기
        int ageBox = 20;
//        System.out.println("현재 ageBox: " + ageBox);
        // 2.1 ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮기기
        int temp = ageBox;
        ageBox = 30;

//        System.out.println("옮겨진 temp: " + temp);
//        System.out.println("바뀐 ageBox: " + ageBox);

        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
        int a = 1;
        int b = 3;

        int c = a;
        a = b;
        b = c;

//        System.out.println("스위칭 된 a: " + a);
//        System.out.println("스위칭 된 b: " + b);
    } // end of main
} // end of class
