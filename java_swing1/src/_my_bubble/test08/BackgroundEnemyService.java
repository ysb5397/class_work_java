package _my_bubble.test08;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackgroundEnemyService implements Runnable {

    private BufferedImage image;
    private Enemy enemy;

    public BackgroundEnemyService(Enemy enemy) {
        this.enemy = enemy;

        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            Color leftWallColor = new Color(image.getRGB(enemy.getX(), enemy.getY() + 25));
            Color rightWallColor = new Color(image.getRGB(enemy.getX() + 60, enemy.getY() + 25));

            if (leftWallColor.getRed() == 255 && leftWallColor.getGreen() == 0 && leftWallColor.getBlue() == 0) {
                enemy.setLeftWallCrash(true);
                enemy.setLeft(false);
            } else if (rightWallColor.getRed() == 255 && rightWallColor.getGreen() == 0 && rightWallColor.getBlue() == 0) {
                enemy.setRightWallCrash(true);
                enemy.setRight(false);
            } else {
                enemy.setLeftWallCrash(false);
                enemy.setRightWallCrash(false);
            }

            int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 55);
            int bottomColorRight = image.getRGB(enemy.getX() + 50, enemy.getY() + 55);

            if (bottomColorLeft + bottomColorRight != -2) {
                enemy.setDown(false);
            } else {
                if (enemy.isUp() == false && enemy.isDown() == false) {
                    enemy.down();
                }
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
