package _my_bubble.test07;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Enemy extends JLabel implements Moveable {

    private ImageIcon enemyL;
    private ImageIcon enemyR;
    private ImageIcon bubbled;

    private final int MOVE_SPEED = 3;

    private int x;
    private int y;
    private int actionWay;
    private int actionTime;

    static int dummyX;
    static int dummyY;

    private boolean left;
    private boolean right;
    private boolean down;
    private boolean stop;

    private boolean leftWallCrash;
    private boolean rightWallCrash;

    private Random random = new Random();

    public ImageIcon getEnemyL() {
        return enemyL;
    }

    public ImageIcon getEnemyR() {
        return enemyR;
    }

    public int getMOVE_SPEED() {
        return MOVE_SPEED;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public int getActionWay() {
        return actionWay;
    }

    public int getActionTime() {
        return actionTime;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
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

    public boolean isStop() {
        return stop;
    }

    public void setEnemyL(ImageIcon enemyL) {
        this.enemyL = enemyL;
    }

    public void setEnemyR(ImageIcon enemyR) {
        this.enemyR = enemyR;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setActionWay(int actionWay) {
        this.actionWay = actionWay;
    }

    public void setActionTime(int actionTime) {
        this.actionTime = actionTime;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
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

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public Enemy() {
        initData();
        setInitLayout();
        left();
    }

    public void initData() {
        enemyL = new ImageIcon("img/enemyL.png");
        enemyR = new ImageIcon("img/enemyR.png");
        bubbled = new ImageIcon("img/bubbled.png");

        x = 500;
        y = 10;
        actionWay = 0;
        stop = false;
    }

    public void setInitLayout() {
        setSize(50, 50);
        setIcon(enemyL);
        setLocation(x, y);
    }

    @Override
    public void left() {
        left = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left && !stop) {
                    setIcon(enemyL);
                    x -= MOVE_SPEED;
                    setLocation(x, y);
                    dummyX = x;
                    dummyY = y;

                    try {
                        Thread.sleep(10);
                        actionTime++;
                        if (actionTime >= 50) {
                            actionWay = random.nextInt(100);
                            actionTime = 0;

                            if (actionWay >= 50 && actionWay <= 99 || leftWallCrash == true) {
                                left = false;
                            }
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (stop) {
                    setIcon(bubbled);
                    try {
                        Thread.sleep(3000);
                        stop = false;
                        right();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    right();
                }
            }
        }).start();
    }

    @Override
    public void right() {
        right = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right && !stop) {
                    setIcon(enemyR);
                    x += MOVE_SPEED;
                    setLocation(x, y);
                    dummyX = x;
                    dummyY = y;

                    try {
                        Thread.sleep(10);
                        actionTime++;
                        if (actionTime >= 50) {
                            actionWay = random.nextInt(100);
                            actionTime = 0;

                            if (actionWay >= 0 && actionWay <= 49 || rightWallCrash == true) {
                                right = false;
                            }
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (stop) {
                    setIcon(bubbled);
                    try {
                        Thread.sleep(3000);
                        stop = false;
                        left();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    left();
                }
            }
        }).start();
    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (down) {
                    y += 2;
                    setLocation(x, y);

                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of while
                down = false; // 상태값을 확실하게 처리하자.
            }
        }).start();
    }
}
