package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public ColorChangeFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("버튼1");
        button2 = new JButton("버튼2");
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());

        panel.setBackground(Color.YELLOW);
        add(panel, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addEventListener() {
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        // 다운 캐스팅
        JButton selectedButton = (JButton)e.getSource();
        System.out.println(selectedButton);
        System.out.println(selectedButton.getText());

        if (selectedButton == button1) {
            panel.setBackground(Color.CYAN);
        } else if (selectedButton == button2) {
            panel.setBackground((Color.black));
        }
    }

    // 테스트 코드
    public static void main(String[] args) {
        new ColorChangeFrame2();
    }
}

