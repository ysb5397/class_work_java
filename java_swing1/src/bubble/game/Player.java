package bubble.game;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Player extends JLabel implements Moveable {
    // Context --> 별 5개짜리
    private BubbleFrame mContext;

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 플레이어의 움직인 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;
    private boolean standing;

    // 플레이어 방향 상태 (enum 타입 사용 법 1 - 선언 )
    private PlayerWay playerWay;

    // BubbleFrame의 주소값을 전달 받을 수 있도록 설계
    public Player(BubbleFrame mContext) {
        // 문맥(환경정보) --> Context
        this.mContext = mContext;

        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
        // 플레이어 초기 상태 설정
        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;
        standing = true;
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
                while (left) {
                    setIcon(playerL);
                    x = x - SPEED;
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
                while (right) {
                    setIcon(playerR);
                    x = x + SPEED;
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
                for(int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y = y - JUMP_SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
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
            }
        }).start();
    }

    public void bubbleAttack() {
        mContext.add(new Bubble(this));
    }
}
