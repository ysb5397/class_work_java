package ch09;

public class Space {

    String name;
    Boolean isStar;
    Boolean hasLife;

    public Space(String n, Boolean star, Boolean life) {
        name = n;
        isStar = star;
        hasLife = life;
    }


    public void showInfo() {
        System.out.println("별의 이름: " + name);
        System.out.println("항성인지 여부: " + isStar);
        System.out.println("생명체 존재 여부: " + hasLife);
    }
}
