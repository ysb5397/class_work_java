package copy;

public class MainTest1 {

    public static void main(String[] args) {
        // 얕은 복사(shallow) , 깊은 복사 (deep)
        // 기본 데이터 타입(소문자)과 참조 타입(대문자)

        int a = 10;
        int b = a; // 기본 데이터 타입은 값 복사
        b = 100;
        System.out.println(a);
        System.out.println(b);

        // 참조 변수(변수안에 담기는 값은 heap 메모리 주소)
        Person person1 = new Person("홍길동");
        Person person2 = person1; // 주소값 복사 ( 얕은 복사 )
        // 즉 person1과 person2는 같은 객체를 바라보고 있기 때문
        person2.name = "티모";

        System.out.println(person1.name);
        System.out.println(person2.name);

        int[] test1 = new int[10];
        test1[0] = 5;

        int[] test2 = test1;
        test2[0] = 10;

        System.out.println(test1[0]);
        System.out.println(test2[0]);



    }
} // end

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
