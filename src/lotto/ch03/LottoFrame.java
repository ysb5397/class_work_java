package lotto.ch03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    private static final String INITIAL_MESSAGE = "로또 번호를 생성하세요.";
    private static final String FONT_NAME = "고딕";
    private static final int FONT_SIZE = 20;
    private JPanel panel;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private boolean isInitialState = true;
    private int[] currentNumbers;
    private Color[] colors = {Color.YELLOW, Color.BLUE, Color.RED, Color.GRAY, Color.GREEN};

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
        lottoRandomNumber = new LottoRandomNumber();
        currentNumbers = new int[LottoRandomNumber.LOTTO_NUMBER_COUNT];
        panel = new JPanel();
    }

    private void setInitLayout() {
        add(button, BorderLayout.NORTH);
        add(panel);
        panel.setBackground(Color.LIGHT_GRAY);

        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        isInitialState = false;
        currentNumbers = lottoRandomNumber.createNumber();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));

        if(isInitialState) {
            g.drawString(INITIAL_MESSAGE, 180, 200);
        } else {
            for (int i = 0; i < lottoRandomNumber.LOTTO_NUMBER_COUNT; i++) {
                if (currentNumbers[i] <= 10) {
                    g.setColor(colors[0]);
                } else if ((currentNumbers[i] >= 11) && (currentNumbers[i] <= 20)) {
                    g.setColor(colors[1]);
                } else if ((currentNumbers[i] >= 21) && (currentNumbers[i] <= 30)) {
                    g.setColor(colors[2]);
                } else if ((currentNumbers[i] >= 31) && (currentNumbers[i] <= 40)) {
                    g.setColor(colors[3]);
                } else {
                    g.setColor(colors[4]);
                }

                g.drawString(currentNumbers[i] + "", 100 + (i * 75), 200);
            }
        }
    }

    // 테스트
    public static void main(String[] args) {
        new LottoFrame();
    }
}
