package ru.mirea.bert7438.javagui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MatchActivity extends JFrame{
    private JButton realMadridButton;
    private JButton ACMilanButton;
    private JLabel winLabel;
    private JLabel scorerLabel;
    private JLabel resLabel;

    private JPanel rootPanel;

    private int scoreMadrid = 0;
    private int scoreACMilan = 0;



    Font fnt = new Font("Consolas", Font.BOLD, 16);

    public MatchActivity(){
        realMadridButton.setFont(fnt);
        ACMilanButton.setFont(fnt);
        winLabel.setFont(fnt);
        scorerLabel.setFont(fnt);
        resLabel.setFont(fnt);


        setSize(1280,720);
        setContentPane(rootPanel);
        setVisible(true);
        realMadridButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scoreMadrid++;
                resLabel.setText(String.format("Result: %d X %d", scoreMadrid, scoreACMilan));
                scorerLabel.setText("Last Scorer: Real Madrid");
                if(scoreMadrid > scoreACMilan)
                    winLabel.setText("Winner: Real Madrid");
                super.mouseClicked(e);
            }
        });
        ACMilanButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scoreACMilan++;
                resLabel.setText(String.format("Result: %d X %d", scoreMadrid, scoreACMilan));
                scorerLabel.setText("Last Scorer: AC Milan");
                if(scoreACMilan > scoreMadrid)
                    winLabel.setText("Winner: AC Milan");
                super.mouseClicked(e);
            }


        });
    }

    public static void main(String[] args) {
        new MatchActivity();
    }
}
