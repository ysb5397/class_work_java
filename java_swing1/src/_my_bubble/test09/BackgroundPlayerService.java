package _my_bubble.test09;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * 현재 메인 스레드는 너무 바쁜 상태
 * 백그라운드에서 계속 player의 움직임을 관찰
 */

public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;

    private int playerDummyX;
    private int playerDummyY;

    // 생성자 의존 주입( DI ) - 연관 관계
    public BackgroundPlayerService(Player player) {
        this.player = player;

        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            // ARGB
            // RGB 각각 0 ~ 255
            Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
            Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));

            // 바닥 감지
            // 하얀색 (255, 255, 255)
            int bottomColorLeft = image.getRGB(player.getX() + 20, player.getY() + 55);
            int bottomColorRight = image.getRGB(player.getX() + 50, player.getY() + 55);

            if (bottomColorLeft + bottomColorRight != -2) {
                player.setDown(false);
            } else {
                if (player.isUp() == false && player.isDown() == false) {
                    player.down();
                }
            }

            // 플레이어 좌표 값에 따라서 빨간색, 파란색, 하얀색을 구분할 수 있다.
            // 논리적으로 255, 0, 0 이면 빨간색 벽에 충돌한 것으로 판단
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                // 왼쪽 벽에 닿음.
                player.setLeftWallCrash(true);
                player.setLeft(false);
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                // 오른쪽 벽에 닿음.
                player.setRightWallCrash(true);
                player.setRight(false);
            } else {
                player.setLeftWallCrash(false);
                player.setRightWallCrash(false);
            }

            playerDummyX = player.getX() + 25;
            playerDummyY = player.getY() + 25;

            if (playerDummyX >= Enemy.dummyX && playerDummyX <= Enemy.dummyX + 50 && playerDummyY >= Enemy.dummyY && playerDummyY <= Enemy.dummyY + 50) {
                player.setDied(true);

                if (player.getIcon().equals(player.getPlayerL())) {
                    player.setIcon(player.getPlayerLDie());

                    try {
                        Thread.sleep(3000);
                        player.setIcon(player.getPlayerL());
                        player.setDied(false);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (player.getIcon().equals(player.getPlayerR())) {
                    player.setIcon(player.getPlayerRDie());

                    try {
                        Thread.sleep(3000);
                        player.setIcon(player.getPlayerR());
                        player.setDied(false);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            // 위 조건에 부합하지 않으면 움직임이 허용된 공간안에 있다는 뜻
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
