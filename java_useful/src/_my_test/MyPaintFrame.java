package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private JPanel myPanel;

    public MyPaintFrame(){

        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("집 그리기");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitLayout() {
        super.add(myPanel);
    }

    // 내부 클래스
    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            // 자연
            // 달
            g.drawRect(50,50,80,80);
            g.drawRect(60,60,20,20);
            g.drawRect(90,90,30,30);

            // 별
            g.drawString("\uD83C\uDF1F", 100, 30);
            g.drawString("\uD83C\uDF1F", 150, 40);
            g.drawString("\uD83C\uDF1F", 160, 80);
            g.drawString("\uD83C\uDF1F", 210, 40);
            g.drawString("\uD83C\uDF1F", 300, 60);

            // 집
            // 지붕
            g.drawLine(150, 200, 400, 50);
            g.drawLine(400, 50, 650, 200);
            g.drawLine(500,130, 520, 40);
            g.drawLine(480, 30, 560, 50);
            g.drawLine(480, 50, 560, 70);
            g.drawLine(480, 70, 560, 90);

            // 집 본체
            g.drawRect(150, 200, 500, 400);

            // 창문
            g.drawRect(400, 250, 200, 200);
            g.drawLine(500, 250, 500, 450);
            g.drawLine(400, 350, 600, 350);

            // 문
            g.drawRect(200, 450, 100, 150);
            g.drawRect(270, 520, 10, 10);

        }
    } // MyPanel Class

    public static void main(String[] args) {
        MyPaintFrame myPaintFrame = new MyPaintFrame();
    }
}
