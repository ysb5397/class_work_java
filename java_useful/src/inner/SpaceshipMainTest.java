package inner;

public class SpaceshipMainTest {
    public static void main(String[] args) {

        // 멤버 내부 클래스 --> 외부 클래스가 먼저 생성이 되어야 접근이 가능
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // 정적 내부 클래스 사용
        SpaceShip s1 = new SpaceShip();
        s1.startSpaceShip();

        SpaceShip.Engine 엔진1번 = new SpaceShip.Engine();
        SpaceShip.Engine 엔진2번 = new SpaceShip.Engine();
        SpaceShip.Engine 엔진3번 = new SpaceShip.Engine();

        s1.addEngine(엔진1번);
        s1.startSpaceShip();

        // 사용하는 이유
        // 논리적인 그룹화를 위해 사용한다
        // 정적 내부 클래스는 외부 클래스와 논리적으로 관련 있는 클래스들을
        // 그룹화 하는데 유용하다. 이는 코드의 가독성과 구조화 개선이며, 관련 클래스들을
        // 함께 유지할 수 있게 도움을 준다.
    }
}
