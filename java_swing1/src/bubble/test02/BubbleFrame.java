package bubble.test02;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;
    private int key;

    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("버블버블 게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
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
                    case KeyEvent.VK_LEFT :
                        player.left();
                        break;
                    case KeyEvent.VK_RIGHT :
                        player.right();
                        break;
                    case KeyEvent.VK_UP :
                        player.up();
                        break;
                }
            }

            // 키를 다시 뗄 경우
            @Override
            public void keyReleased(KeyEvent e) {
                key = e.getKeyCode();

                switch (key) {
                    case KeyEvent.VK_LEFT :
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT :
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP :
                        player.setUp(false);
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
