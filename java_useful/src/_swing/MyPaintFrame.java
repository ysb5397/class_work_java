package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {
    // 변수, 생성자, 메서드, 내부 클래스
    // 패널
//    private JPanel panel; --> 이 패널도 클래스 이기 때문에 내가 정의한 클래스에 상속 가능
    private MyDrawPanel drawPanel;

    public MyPaintFrame() {

        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("내부 클래스에서 JPanel 상속처리");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawPanel = new MyDrawPanel();
    }

    private void setInitLayout() {

        super.add(drawPanel);

    }

    // 사용자 정의 정적 내부 클래스
    static class MyDrawPanel extends JPanel {

        // paint 메서드(paints 랑은 다름)
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(50, 50, 100, 50);
            g.drawLine(200, 100, 200, 350);
            g.drawLine(200, 100, 400, 350);

            g.drawString("******", 200, 200);
            g.drawString("시나리오***", 500, 500);
            g.drawString("\uD83C\uDF88", 400, 400);

        }
    } // end of MyDrawPanel

    public static void main(String[] args) {
        MyPaintFrame myPaintFrame = new MyPaintFrame();

    }

}
