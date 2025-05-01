package bubble.test01;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerL;
    private ImageIcon playerR;

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerL = new ImageIcon("img/playerL.png");
        playerR = new ImageIcon("img/playerR.png");
    }

    private void setInitLayout() {
        x = 55;
        y = 535;
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }

    @Override
    public void left() {
        System.out.println("왼쪽으로 갑니다");
    }

    @Override
    public void right() {
        System.out.println("오른쪽으로 갑니다");
    }

    @Override
    public void up() {
        System.out.println("위쪽으로 갑니다");
    }

    @Override
    public void down() {

    }
}
