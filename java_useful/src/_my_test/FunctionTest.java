package _my_test;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FunctionTest extends JFrame {

    private drawPaint drawPaint;

    public FunctionTest() {
        initData();
        setInitData();
    }

    private void initData() {
        setTitle("함수 테스트");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawPaint = new drawPaint();
    }

    private void setInitData() {
        super.add(drawPaint);
    }

    static class drawPaint extends JPanel {
        private Random random = new Random();

        @Override
        public void paint(Graphics g) {
            int xRan = 0;
            int yRan = 0;
            int widRan = 0;
            int heiRan = 0;
            for (int i = 0; i < 400; i++) {
                yRan = random.nextInt(800);
                xRan = random.nextInt(800);
                widRan = random.nextInt(100);
                heiRan = random.nextInt(100);
                g.drawRect(xRan, yRan, widRan, heiRan);
            }
        }
    }

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
    }
}
