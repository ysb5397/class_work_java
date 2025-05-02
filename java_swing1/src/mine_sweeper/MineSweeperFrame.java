package mine_sweeper;

import javax.swing.*;
import java.awt.*;
import java.util.EventListener;

public class MineSweeperFrame extends JFrame implements EventListener {

    private JPanel panel;
    private Mine mine;

    public MineSweeperFrame(){
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("지뢰찾기");
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        panel = new JPanel();
        mine = new Mine();
    }

    private void setInitLayout() {
        panel.setLayout(new GridLayout(4, 4));
        add(panel);
        panel.add(mine);

        setVisible(true);
    }

    private void addEventListener() {

    }

    public static void main(String[] args) {
        new MineSweeperFrame();
    }
}
