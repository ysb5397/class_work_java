package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPanelEx1 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // 컴포넌트들을 그룹화 시킬 수 있다. 즉, 각각의 배치 관리자를 추가로 설정해서 관리할 수도 있다.
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;


    public MyPanelEx1() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("패널 나누기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");
        setVisible(true);
    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 2));

        // RGB
        // 0 0 0 --> 검은색
        // 255 255 255 --> 흰색
        panel1.setBackground(Color.red);
        add(panel1);

        panel2.setBackground(Color.BLUE);
        add(panel2);

        panel3.setBackground(Color.YELLOW);
        add(panel3);

        panel4.setBackground(Color.GREEN);
        add(panel4);

        // 패널1에 버튼1 붙이기
        // 패널1에 아직 배치 관리자 설정이 안됨
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 100));
        panel1.add(button1);

        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 100));
        panel2.add(button2);

        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 100));
        panel3.add(button3);

        panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 100));
        panel4.add(button4);
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        MyPanelEx1 myPanelEx1 = new MyPanelEx1();
    }
}
