package collections;

import java.util.HashMap;
import java.util.Map;

public class UserMapAddSystem {

    private Map<String, User> users;

    public UserMapAddSystem() {
        users = new HashMap<>();
    }

    // users에 접근해서 데이터를 추가하는 기능 만들어보기
    private void addUser(String name, String email) {
        // 1. map 자료 구조에 넣어야 한다.
        // 2. key 값을 명시하고, value에는 user object가 들어가야 한다
        users.put(name, new User(name, email));
    }

    // users에 접근해서 전체 데이터를 출력하는 기능을 만들어 보자.
    public void showAllUser() {
        for (User u : users.values()) {
            System.out.println(u.toString());
        }
    }

    public static void main(String[] args) {
        UserMapAddSystem userMapAddSystem = new UserMapAddSystem();
        userMapAddSystem.addUser("홍길동", "a@naver.com");
        userMapAddSystem.addUser("가나다", "b@naver.com");

        userMapAddSystem.showAllUser();
    }

} // end of class

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
