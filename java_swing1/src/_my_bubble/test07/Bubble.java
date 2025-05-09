package _my_bubble.test07;

import javax.swing.*;

public class Bubble extends JLabel implements Moveable {

    private int x;
    private int y;

    private int detectX;
    private int detectY;

    // 물방울의 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;

    private ImageIcon bubble;
    private ImageIcon bomb;
    private Player player;
    private Enemy enemy;
    private BackgroundBubbleService backgroundBubbleService;

    // 생성자 의존 주입
    public Bubble(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        this.backgroundBubbleService = new BackgroundBubbleService(this);

        initData();
        setInitLayout();
        // 버블은 스레드가 하나면 된다.
        bubbleStartThread();
    }

    private void bubbleStartThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (player.getPlayerWay() == PlayerWay.LEFT) {
                    left();
                } else {
                    right();
                }
            }
        }).start();
    }

    private void initData() {
        bubble = new ImageIcon("img/bubble.png");
        bomb = new ImageIcon("img/bomb.png");

        left = false;
        right = false;
        up = false;
    }

    private void setInitLayout() {
        x = player.getX();
        y = player.getY();

        setIcon(bubble);
        setSize(50, 50);
        setLocation(x, y);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
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

    public ImageIcon getBubble() {
        return bubble;
    }

    public Player getPlayer() {
        return player;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void left() {
        left = true;
        for (int i = 0; i < 400; i++) {
            x--;
            setLocation(x, y);
            detectX = x + 25;
            detectY = y + 25;

            if (backgroundBubbleService.leftWall() == true) {
                break;
            }

            if (detectX >= Enemy.dummyX && detectX <= Enemy.dummyX + 60 && detectY >= Enemy.dummyY && detectY <= Enemy.dummyY + 60) {
                enemy.setStop(true);
                setIcon(null);
                bubble = null;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void right() {
        right = true;
        for (int i = 0; i < 400; i++) {
            x++;
            setLocation(x, y);
            detectX = x + 25;
            detectY = y + 25;

            if (backgroundBubbleService.rightWall() == true) {
                break;
            }

            if (detectX >= Enemy.dummyX && detectX <= Enemy.dummyX + 60 && detectY >= Enemy.dummyY && detectY <= Enemy.dummyY + 60) {
                enemy.setStop(true);
                setIcon(null);
                bubble = null;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void up() {
        up = true;
        while (true) {
            try {
                y--;
                setLocation(x, y);
                Thread.sleep(1);

                if (bubble != null && enemy.isStop() == false && backgroundBubbleService.upWall() == true) {
                    Thread.sleep(2000);
                    setIcon(bomb);
                    Thread.sleep(500);
                    setIcon(null);
                    bubble = null;
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
