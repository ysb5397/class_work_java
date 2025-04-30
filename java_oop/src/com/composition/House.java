package com.composition;

public class House {

    private String address;
    Room[] rooms;

    public House(String address) {
        this.address = address;
        this.rooms = new Room[3]; // 컴포지션: 하우스가 룸 배열을 소유
        // 속성으로 선언되고 내부에서 객체를 생성해서 컴포지션이라 할 수 있다
//        room = new Room("안방");
        rooms[0] = new Room("거실");
        rooms[1] = new Room("침실");
        rooms[2] = new Room("주방");
    }

    void showRooms() {
        System.out.println(address + "에 있는 방 목록");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                rooms[i].describe();
            }
        }
    }

    public static void main(String[] args) {
        House house = new House("부산시 진구");
        house.showRooms();

        // house 객체가 소멸되면 rooms도 Room 객체도 소멸된다(GC에 의해)
        house = null;
    }
}
