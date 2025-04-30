package test.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame implements KeyListener {

//    private JButton button;
    private JPanel panel;
    private KeyListen keyListen;

    private char keyInput;
    private String text;

    public GameFrame() {
        initData();
        setInitLayout();
        addEventListener();

        Thread thread1 = new Thread(keyListen);
        thread1.start();
    }

    private void initData() {
        setTitle("case 연습");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        button = new JButton("버튼1");
        panel = new JPanel();
        keyListen = new KeyListen();
    }

    private void setInitLayout() {
//        add(button, BorderLayout.NORTH);
        add(panel);
        add(keyListen);

        setVisible(true);
    }

    private void addEventListener() {
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyInput = (char)e.getKeyCode();
        text = keyInput + "";
        System.out.println(text);
    }

    private class KeyListen extends JPanel implements Runnable {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            while (true) {
                if (text != null) {
                    g.drawString(text, 200, 200);
                    text = null;
                }
            }
        }

        @Override
        public void run() {

        }
    }
}
