package lotto.ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    private int testNumber = 45;
    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private int[] result = new int[6];
    private Color[] colors = {Color.ORANGE, Color.BLUE, Color.RED, Color.GRAY, Color.GREEN};

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
        System.out.println("로또 번호가 생성 되었습니다!");
        result = lottoRandomNumber.createNumber();

        // 그림 다시 그리기
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("궁서체", Font.BOLD, 20);
        g.setFont(f);

        for (int i = 0; i < lottoRandomNumber.LOTTO_NUMBER_COUNT; i++) {
            g.drawString(result[i] + "", 100 + (i * 70), 150);

            if (result[i] <= 10) {

            } else if ((result[i] >= 11) && (result[i] <= 20)) {

            } else if ((result[i] >= 21) && (result[i] <= 30)) {

            } else if ((result[i] >= 31) && (result[i] <= 40)) {

            } else {

            }
        }
    }

    // 테스트
    public static void main(String[] args) {
        new LottoFrame();
    }
}
