package com.RealMyTest;

import java.util.Random;

public class MineSweeper {

    private static int blockId = 0;
    private String name;
    private int blockPositionX;
    private int blockPositionY;
    private int hasArroundMine;
    private boolean isMine;

    // 생성자
    public MineSweeper(String name) {
        this.name = name;
        blockId++;
    }

    // getter
    public int getBlockId() {
        return blockId;
    }

    public static void main(String[] args) {
        Random temp = new Random();

        int randomX = 4 + temp.nextInt(5);
        int randomY = 1 + temp.nextInt(8);
        System.out.println(randomX * randomY);

//        int multi = randomX * randomY;
//        int[] size = new int[multi];
        int n2 = 1;
        for (int n1 = 1; n1 < randomY; n1++) {
            if (n2 < randomX) {
                MineSweeper block = new MineSweeper("일반 블록");
                System.out.println(block.getBlockId());
                n2++;
            } else {
                n2 = 1;
            }
        }



    }
}
