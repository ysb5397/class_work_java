package com.association;

public class GamePlayTest1 {

    public static void main(String[] args) {

        Gamer gamer1 = new Gamer("게이머1");

        Game game1 = new Game("마인크래프트");
        Game game2 = new Game("지뢰찾기");

        gamer1.playGame(game1);
        gamer1.playGame(game2);
        gamer1.playGame(game2);
        System.out.println("----------------");

        gamer1.quitGame(game1);
        gamer1.showGameInfo();
        System.out.println("------------------");

        gamer1.quitGame(game2);
        gamer1.showGameInfo();

    }

}
