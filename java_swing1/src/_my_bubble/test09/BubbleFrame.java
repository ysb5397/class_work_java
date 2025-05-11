package _my_bubble.test09;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;
    private Enemy enemy;
    private int key;

    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();

        new Thread(new BackgroundPlayerService(player)).start();
        new Thread(new BackgroundEnemyService(enemy)).start();
    }

    private void initData() {
        setTitle("버블버블 게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        setContentPane(backgroundMap);
        player = new Player();
        enemy = new Enemy();
    }

    private void setInitLayout() {
        setLayout(null); // 좌표 기준
        setResizable(false); // 리사이즈 조절 막기
        setLocationRelativeTo(null); // JFrame 화면 가운데 배치

        add(player);
        add(enemy);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            // 키를 누를 때
            @Override
            public void keyPressed(KeyEvent e) {
                key = e.getKeyCode();

                switch (key) {
                    case KeyEvent.VK_LEFT:
                        if (player.isDied() == false && player.isLeft() == false && player.isLeftWallCrash() == false) {
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (player.isDied() == false && player.isRight() == false && player.isRightWallCrash() == false) {
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (player.isUp() == false) {
                            player.up();
                        }
                        break;
                }
            }

            // 키를 다시 뗄 경우
            @Override
            public void keyReleased(KeyEvent e) {
                key = e.getKeyCode();

                switch (key) {
                    case KeyEvent.VK_LEFT:
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        break;
                    case KeyEvent.VK_SPACE:
                        add(new Bubble(player, enemy));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
