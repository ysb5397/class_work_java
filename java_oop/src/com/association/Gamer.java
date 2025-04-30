package com.association;

public class Gamer {

    private String name;
    private Game game;

    public Gamer(String name) {
        this.name = name;
        game = null;
    }

    public void playGame(Game game) {
        if (this.game == null) {
            this.game = game;
            System.out.println(name + "이(가) " + this.game.getName() + "을(를) 플레이 중입니다!");
        } else if (this.game != game) {
            System.out.println(name + "이(가) 플레이 하던 " + this.game.getName() + "에서 " + game.getName() + "으로 변경했습니다.");
            this.game = game;
        } else {
            System.out.println(game.getName() + "은(는) 이미 " + name + "이(가) 플레이 중입니다!");
        }
    }

    public void quitGame(Game game) {
        if  (this.game == game) {
            System.out.println(name + "이(가) 플레이 하던 " + this.game.getName() + "을(를) 종료했습니다. ");
            this.game = null;
        } else {
            System.out.println(game.getName() + "은(는) " + name + "이(가) 하고 있지 않는 게임입니다.");
        }
    }

    public void showGameInfo() {
        if (this.game != null) {
            System.out.println("현재 " + name + "이(가) 플레이 중인 게임: " + this.game.getName());
        } else {
            System.out.println("현재 " + name + "은 아무것도 안하고 있습니다.");
        }
    }
}
