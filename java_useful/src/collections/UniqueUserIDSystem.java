package collections;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

    // TODO 1 -> 사용자가 키보드로 입력한 ID를 많이 저장
    // TODO 2 -> 고유한 값이어야하고, 메모리상으로 관리
    private HashSet<String> registeredIDs;

    public UniqueUserIDSystem() {
        registeredIDs = new HashSet<>();

        // showIDs 메서드를 테스트하기 위해 샘플 데이터 입력
        // 샘플 데이터 입력 - TODO 추후 삭제 예정
        registeredIDs.add("홍길동");
        registeredIDs.add("이순신");
        registeredIDs.add("야스오");
    }

    public boolean addUserId(String userId) {
        return registeredIDs.add(userId);
    }

    // 사용자 ID를 출력하는 메서드
    public void showIDs() {
        if (registeredIDs.isEmpty()) {
            System.out.println("현재 존재하는 ID가 없습니다");
            return;
        }

        for (String id : registeredIDs) {
            System.out.println("id: " + id);
        }

        System.out.println("총 등록된 ID 개수: " + registeredIDs.size());
    }

    public void findID(Scanner scanner) {
        System.out.println("ID를 입력해주세요.");
        String find = scanner.next().trim();

        if (registeredIDs.contains(find)) {
            System.out.println(find + " 이라는 ID가 있는 것을 확인하였습니다!");
        } else {
            System.out.println(find + "이라는 ID는 존재하지 않거나, 잘못 입력한 것 같습니다.");
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("사용하고 싶은 ID를 입력하세요. ID 선택 출력 : find / ID 전체 출력 : show / 종료 : exit 입력\n입력: ");
            String input = scanner.next().trim();

            // 사용자가 키보드에서 값을 넣지 않고 바로 엔터를 누를 경우
            // 빈 입력 처리
            if (input.isEmpty()) {
                System.out.println("ID를 입력해주세요.");
                continue;
            }

            if ("exit".equals(input)) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else if ("show".equals(input)) {
                showIDs();
                continue;
            } else if ("find".equals(input)) {
                findID(scanner);
                continue;
            }

            boolean isRegistered = addUserId(input);
            if(isRegistered) {
                System.out.println("새로운 사용자 ID가 등록되었습니다");
            } else {
                System.out.println("이미 등록된 사용자 ID 입니다.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        UniqueUserIDSystem idSystem = new UniqueUserIDSystem();
//        idSystem.start();
        idSystem.showIDs();
    }
}
