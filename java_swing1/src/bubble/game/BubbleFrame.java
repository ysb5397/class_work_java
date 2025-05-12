package bubble.game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    // 명시하기
    BubbleFrame mContext = this; // 자기 자신의 주솟값 담기

    private JLabel backgroundMap;
    private Player player;
    private int key;

    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();

        new Thread(new BackgroundPlayerService(player)).start();
    }

    private void initData() {
        setTitle("버블버블 게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        setContentPane(backgroundMap);
        player = new Player(mContext);
    }

    private void setInitLayout() {
        setLayout(null); // 좌표 기준
        setResizable(false); // 리사이즈 조절 막기
        setLocationRelativeTo(null); // JFrame 화면 가운데 배치

        add(player);
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
                        if (player.isLeft() == false && player.isLeftWallCrash() == false) {
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (player.isRight() == false && player.isRightWallCrash() == false) {
                            player.right();
                        }
                        player.setIcon(player.getPlayerR());
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
                        player.bubbleAttack();
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        // BubbleFrame (이 하위에 생성되는 모든 객체들의 주솟값에 접근 가능)
        // main 함수를 가질 수 있는 클래스는 Context 라는 개념이 생길 수 있다.
        new BubbleFrame();
    }
}
