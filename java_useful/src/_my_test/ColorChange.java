package _my_test;

import _swing2.ColorChangeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChange extends JFrame implements ActionListener {

    private final int SIZE = 500;
    private final int BUTTON_SIZE = 100;
    private JButton[] buttons = new JButton[7];
    private JPanel panel;
    private Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA};

    public ColorChange() {
        JButton[] buttons = new JButton[7];

        initData();
        setInitLayout(buttons);
        addEventListener(buttons);
    }

    private void initData() {
        setTitle("무지개색으로 변경");
        setSize(SIZE, SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setInitLayout(JButton[] buttons) {
        setLayout(new BorderLayout());

        panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        panel.setBackground(Color.black);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("버튼" + (i + 1));
            buttons[i].setSize(BUTTON_SIZE, BUTTON_SIZE);
            panel.add(buttons[i]);
        }
        setVisible(true);
    }

    private void addEventListener(JButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton) e.getSource();

        for (int i = 0; i < buttons.length; i++) {
            if (selectedButton.getText().equals(("버튼" + (i + 1)))) {
                panel.setBackground(colors[i]);
            }
        }
    }

    public static void main(String[] args) {
        new ColorChange();
    }
}
