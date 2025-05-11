package _my_bubble.test08;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;
    private ImageIcon playerRDie;
    private ImageIcon playerLDie;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 플레이어의 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
    private boolean isDied;

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;
    private boolean standing;

    // 플레이어 방향 상태 (enum 타입 사용 법 1 - 선언 )
    private PlayerWay playerWay;

    // PlayerWay - getter 만 생성
    public PlayerWay getPlayerWay() {
        return playerWay;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
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

    public boolean isStanding() {
        return standing;
    }

    public boolean isDied() {
        return isDied;
    }

    public ImageIcon getPlayerRDie() {
        return playerRDie;
    }

    public ImageIcon getPlayerLDie() {
        return playerLDie;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
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

    public void setStanding(boolean standing) {
        this.standing = standing;
    }

    public void setDied(boolean died) {
        isDied = died;
    }

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
        playerRDie = new ImageIcon("img/playerRDie.png");
        playerLDie = new ImageIcon("img/playerLDie.png");
        // 플레이어 초기 상태 설정
        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;
        standing = true;
        isDied = false;
    }

    private void setInitLayout() {
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }


    @Override
    public void left() {
        // 클래스 이름으로 접근한다.
        playerWay = PlayerWay.LEFT;
        left = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left && !isDied) {
                    setIcon(playerL);
                    x -= SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of while
            } // end of run()
        }).start();
    }

    @Override
    public void right() {
        playerWay = PlayerWay.RIGHT;
        right = true; // 움직임 상태값 변경
        // 익명 클래스 - thread.start() ---> run() 메서안에 구문 동작된다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right && !isDied) {
                    setIcon(playerR);
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
                    if (!isDied) {
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

                while (down && !isDied) {
                    y += JUMP_SPEED;
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
