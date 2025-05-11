package _my_bubble.test08;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 백그라운드 플레이어 서비스는 스레드가 계속 돌고 있는 상태
 *  LIGHT 백그라운드 버블 서비스는 스레드가 너무 많이 발생해서
 *  LIGHT 게임에 많은 영향을 미칠 수 있다.
 */

public class BackgroundBubbleService {
    private BufferedImage image;
    private Bubble bubble;

    public BackgroundBubbleService(Bubble bubble) {
        try {
            this.bubble = bubble;
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 왼쪽 벽 확인
    public boolean leftWall() {
        Color leftColor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY() + 25));

        if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
            return true;
        }
        return false;
    }

    // 오른쪽 벽 확인
    public boolean rightWall() {
        Color rightColor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY() + 25));

        if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
            return true;
        }
        return false;
    }

    // 위쪽 벽 확인
    public boolean upWall() {
        Color upColor = new Color(image.getRGB(bubble.getX() + 25, bubble.getY() - 10));

        if (upColor.getRed() == 255 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
            return true;
        }
        return false;
    }
}
