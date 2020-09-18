package ru.mirea.bert7438.javagui;

import javax.swing.*;
import java.awt.*;

public class MatchActivity extends JFrame{
    private JButton realMadridButton;
    private JButton ACMilanButton;
    private JLabel winLabel;
    private JLabel scorerLabel;
    private JLabel resLabel;
    private JPanel rootPanel;

    Font fnt = new Font("Consolas", Font.BOLD, 16);

    public MatchActivity(){
        setSize(1280,720);
        setContentPane(rootPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MatchActivity();
    }
}
