package bubble.test04;

import javax.swing.*;
import java.awt.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerL;
    private ImageIcon playerR;
    private BackgroundPlayerService backgroundPlayerService;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 플레이어의 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private boolean leftWallCrash;
    private boolean rightWallCrash;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMP_SPEED() {
        return JUMP_SPEED;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeftWallCrash() {
        return leftWallCrash;
    }

    public boolean isRightWallCrash() {
        return rightWallCrash;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeftWallCrash(boolean leftWallCrash) {
        this.leftWallCrash = leftWallCrash;
    }

    public void setRightWallCrash(boolean rightWallCrash) {
        this.rightWallCrash = rightWallCrash;
    }


    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerL = new ImageIcon("img/playerL.png");
        playerR = new ImageIcon("img/playerR.png");

        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitLayout() {
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }

    @Override
    public void left() {
        left = true;
        setIcon(playerL);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(left) {
                    x -= SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void right() {
        right = true; // 움직임 상태값 변경
        setIcon(playerR);

        // 익명 클래스 - 스레드를 시작시키면 run() 메서드 안의 구문이 동작한다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(right) {
                    x += SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void up() {
        up = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y -= JUMP_SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of for
                up = false;
                down();
            }
        }).start();
    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y += JUMP_SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of for
                down = false;
            }
        }).start();
    }
}
