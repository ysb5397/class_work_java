package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    private BufferedImage backgroundImage;
    private BufferedImage player1;
    private BufferedImage player2;
    private ImagePanel imagePanel;

    private int playerX = 200;
    private int playerY = 50;

    private int detectPlayerX;
    private int detectPlayerY;

    private final int PLAYER_SCALE = 300;

    private int player2X = 300;
    private int player2Y = 300;

    private boolean flag = true;

    public GameFrame() {
        initData();
        setInitData();
        addEventListener();
        // 메인 작업자가 서브 작업자를 생성한다
        Thread thread1 = new Thread(imagePanel);
        thread1.start();
        // 이미지 패널 안에 구현한 run() 메서드가 시작
    }

    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            backgroundImage = ImageIO.read(new File("images/background1.png"));
            player1 = ImageIO.read(new File("images/player1.png"));
            player2 = ImageIO.read(new File("images/player2.png"));
            // TODO 플레이어 이미지도 올려야 함.
        } catch (IOException e) {
            e.printStackTrace();
        }

        imagePanel = new ImagePanel();
    }

    private void setInitData() {
        add(imagePanel);
        setVisible(true);
    }

    private void addEventListener() {
        // KeyListener는 인터페이스
        // 자바 문법 인터페이스, 추상 클래스를 구현 클래스(즉, 객체로 사용하는 문법 제공)
        // new KeyListener() 추상 메서드를 구현 메서드로 오버라이드 (클래스로 바라본다.)
        // JFrame 자체에 키 이벤트 리스너를 등록한다.
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            playerX -= 20;
        } else if (code == KeyEvent.VK_RIGHT) {
            playerX += 20;
        } else if (code == KeyEvent.VK_UP) {
            playerY -= 20;
        } else if (code == KeyEvent.VK_DOWN) {
            playerY += 20;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    // 내부 클래스
    private class ImagePanel extends  JPanel implements Runnable {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 600, null);
            g.drawImage(player1, playerX, playerY, PLAYER_SCALE, PLAYER_SCALE, null);
            g.drawImage(player2, player2X, player2Y, PLAYER_SCALE, PLAYER_SCALE, null);
        }

        @Override
        public void run() {
            // direction이 true면 오른쪽, false면 왼쪽
            boolean direction = false;
            // 서브 작업자가 해야하는 일을 명시하도록 약속
            while (flag) {
                if (direction) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }

                if (player2X >= 700) {
                    direction = false;
                } else if (player2X <= 0) {
                    direction = true;
                }

                // 플레이어 1의 판정을 점으로 설정(플레이어 정가운데)
                detectPlayerX = playerX + (PLAYER_SCALE / 2);
                detectPlayerY = playerY + (PLAYER_SCALE / 2);

                // 플레이어 1의 판정(점)이 플레이어 2의 히트박스 안으로 들어오면 플레이어 1을 소멸
                if (((detectPlayerX >= player2X) && (detectPlayerX <= (player2X + PLAYER_SCALE))) && ((detectPlayerY >= player2Y) && ((detectPlayerY <= (player2Y + PLAYER_SCALE)))) && player1 != null) {
                    System.out.println("플레이어 1이 소멸 되었습니다!");
                    player1 = null;
                }

                try {
                    repaint();
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
