package lotto.ch01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    private JButton button;

    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("로또 번호 추출기");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("생성하기");
    }

    private void setInitLayout() {
        add(button, BorderLayout.NORTH);

        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("테스트 메시지 입니다.");
    }

    // 테스트
    public static void main(String[] args) {
        new LottoFrame();
    }
}
