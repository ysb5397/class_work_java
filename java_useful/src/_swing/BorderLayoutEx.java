package _swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    // 멤버 변수
    JButton[] buttons;

    // 생성자
    public BorderLayoutEx() {
        setTitle("borderLayout 연습");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    // 메서드
    private void initData() {
        buttons = new JButton[5];

        // for 문으로 수정
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
    }

    private void setInitLayout() {
        // 배치 관리자 (보더 레이아웃)
        // BorderLayout은 컴포넌트들을 동서남북 가운데로 배치시켜주는 레이아웃
        setLayout(new BorderLayout());

        String[] directions = {BorderLayout.NORTH, BorderLayout.EAST, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.CENTER};

        // 프레임(패널)
        // 우리가 생성한 JButton 객체를 프레임에 붙인다.

        // for 문으로 수정
        for (int i = 0; i < 5; i++) {
            if (buttons[i] != null) {
                add(buttons[i], directions[i]);
            }
        }
    }
}
