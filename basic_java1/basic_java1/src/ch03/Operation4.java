package ch03;

// 비교 연산자 2
// 연산의 결과 값은 true, false로 반환 된다.

public class Operation4 {
    public static void main(String[] args) {

        // 게임 캐릭터의 상태를 설정
        int playerHealth = 50; // 플레이어 체력
        int playerLevel = 10; // 플레이어 레벨
        int enemyHealth = 30; // 적 체력
        int requiredLevel = 15; // 최소 요구 레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인
        boolean isStronger = playerHealth > enemyHealth;
        System.out.println("강한가?: " + isStronger);

        // 2. 플레이어의 체력이 위험 수준(20이하) 인지 확인
        boolean isInDanger = playerHealth <= 20;
        System.out.println("위험한가?: " + isInDanger);

        // 3. 플레이어 레벨이 최소 요구 조건 이상인지 확인
        boolean canDoQuest = playerLevel >= requiredLevel;
        System.out.println("조건을 만족하는가?: " + canDoQuest);

        // 4. 플레이어와 적의 체력이 같은지 확인 (비교 연산자)
        boolean isSameHealth = playerHealth == enemyHealth;
        System.out.println("체력이 같은가?: " + isSameHealth);

        // 5. 플레이어 레벨이 특정 레벨과 같은지 확인(10) (비교 연산자)
        boolean isSameLevel = playerLevel == 10;
        System.out.println("레벨이 같은가?: " + isSameLevel);

        // 6. 플레이어 레벨이 특정 레벨과 다른지 확인(10) (비교 연산자)
        boolean isDifferLevel = playerLevel != 10;
        System.out.println("레벨이 다른가?: " + isDifferLevel);

    } // end of main
} // end of class
