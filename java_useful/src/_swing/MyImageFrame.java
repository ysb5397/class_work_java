package _swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    private MyImagePanel myImagePanel;

    public MyImageFrame() {
        initData();
        setInitLayout();
        setVisible(true);
        repaint();
    }

    private void initData() {
        setTitle("이미지 넣어보는 연습");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myImagePanel = new MyImagePanel();

    }

    private void setInitLayout() {
        add(myImagePanel);
    }

    // 내부 클래스
    static class MyImagePanel extends JPanel {
        // 내부 클래스의 멤버 변수 선언
        private Image image1;
        private Image image2;
        private Image image3;
        private Image image4;

        // 내부 클래스 생성자
        public MyImagePanel() {
            // 이미지 아이콘이라는 데이터 타입을 ---> .getImage 라는 메서드를 호출해서 형변환
            // 이미지 아이콘(파일명) --> 기준은 루트폴더(java_useful) 아래를 확인한다
            image1 = new ImageIcon("image1.png").getImage();
            image2 = new ImageIcon("image2.png").getImage();
            image3 = new ImageIcon("image3.png").getImage();
            image4 = new ImageIcon("image4.png").getImage();
        }

        // 자동으로 호출되게끔 순서가 정해져있다.
        @Override
        public void paint(Graphics g) {
            // 이미지를 올려보자
            g.drawImage(image1, 100, 100, 100, 100, null);
            g.drawImage(image2, 300, 300, 100, 100, null);
            g.drawImage(image3, 200, 200, 100, 100, null);
            g.drawImage(image4, 100, 200, 100, 100, null);
        }
    } // MyImagePanel 끝



    public static void main(String[] args) {
        new MyImageFrame();
    }
}
