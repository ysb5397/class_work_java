package generic.ch03;

public class MainTest3 {

    public static void main(String[] args) {
        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();
        Water water1 = new Water();

        // 타입의 안정성과 <T extends Object> 타입에 제한을 둘 수 있다.
        GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
        genericPrinter1.setMaterial(powder1);

        // 컴파일 시점에 오류 발생
//        GenericPrinter<Water> genericPrinter2 = new GenericPrinter<Water>();
    }

}
