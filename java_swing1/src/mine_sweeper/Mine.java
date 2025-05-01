package mine_sweeper;

import javax.swing.*;

public class Mine extends JLabel implements Action {

    private ImageIcon mineTile;

    public Mine() {
        initData();
        setInitLayout();
    }

    private void initData() {
        mineTile = new ImageIcon("img/tile.png");

    }

    private void setInitLayout() {
        setSize(100, 100);
        setIcon(mineTile);
    }

    @Override
    public void flag() {

    }

    @Override
    public void mine() {

    }

    @Override
    public void explode() {

    }
}
