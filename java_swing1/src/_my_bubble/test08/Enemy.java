package _my_bubble.test08;

import javax.swing.*;
import java.util.Random;

public class Enemy extends JLabel implements Moveable {

    private ImageIcon enemyL;
    private ImageIcon enemyR;
    private ImageIcon bubbled;

    private final int MOVE_SPEED = 3;
    private final int JUMP_SPEED = 2;

    private int x;
    private int y;
    private int actionWay;
    private int actionTime;

    static int dummyX;
    static int dummyY;

    private boolean left;
    private boolean right;
    private boolean up;
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

                            if (!(actionWay >= 0 && actionWay <= 44) || leftWallCrash == true) {
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
                    if (right == false && actionWay >= 45 && actionWay <= 90 || leftWallCrash == true) {
                        right();
                    } else if (up == false) {
                        up();
                    }
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

                            if (!(actionWay >= 45 && actionWay <= 90) || rightWallCrash == true) {
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
                    if (left == false && actionWay >= 0 && actionWay <= 44 || rightWallCrash == true) {
                        left();
                    } else if (up == false) {
                        up();
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
                for (int i = 0; i < y / JUMP_SPEED; i++) {
                    if (i <= 130 / JUMP_SPEED) {
                        y -= JUMP_SPEED;
                        setLocation(x, y);
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } // end of for
                up = false; // 상태값을 잘 다루어야 버그가 없다.
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

                while (down) {
                    y += JUMP_SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of while
                down = false; // 상태값을 확실하게 처리하자.
                actionWay = random.nextInt(67);

                if (actionWay >= 0 && actionWay <= 44 && left == false) {
                    left();
                } else if (actionWay >= 45 && actionWay <= 90 && right == false ) {
                    right();
                }
            }
        }).start();
    }
}
