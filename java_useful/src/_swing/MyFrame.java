package _swing;

import javax.swing.*;
import java.awt.*;

/**
 *  JLable 을 이용해서 이미지를 다룰 수 있다.
 *  JLable.add(); 메서드를 이용해서 이미지를 겹칠 수 있다.
 *  좌표 기준으로 배치관리자를 세팅하려면 null값 부여
 */
public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;

    public MyFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("JLabel을 이용한 이미지 사용");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon backgroundIcon = new ImageIcon("background.png");
        ImageIcon playerIcon = new ImageIcon("player.png");

        // JLabel
        backgroundMap = new JLabel(backgroundIcon);
        player = new JLabel(playerIcon);

        backgroundMap.setSize(500, 500);
        backgroundMap.setLocation(0, 0);

        player.setSize(100, 100);
        player.setLocation(200, 200);
    }

    private void setInitLayout() {
        // 좌표 기반(주의점 - 크기 및 x, y지정)
        setLayout(null);

        // 패널에 붙이기
        add(player);
        add(backgroundMap);

        // 맨 밑
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
