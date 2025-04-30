package exercise;

public class TypeConversionExercises {
    public static void main(String[] args) {

        int a = 300;
        double b = a; // 자동 형변환
        // b를 출력한다면 어떻게 나올까?
        System.out.println(b);

        // 문제
        double c = 5.67;
        int d = (int) c;
        System.out.println(d);

        // 문제
        float floatNum = 4.5f;
        int intNum = (int) floatNum;
        System.out.println(intNum);

        // 문제
        double largeValue = 150.75;
        byte byteValue = (byte)largeValue;
        System.out.println(byteValue);


    } // end of main
} // end of class
