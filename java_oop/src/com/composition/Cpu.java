package com.composition;

import java.util.Random;

public class Cpu {

    private int core;
    Random random = new Random();

    // getter
    public int getCore() {
        return core;
    }

    public Cpu() {
        core = 2 * (1 + random.nextInt(4));
        System.out.println(core + "코어 CPU를 탑재시켰습니다!");
    }




}
