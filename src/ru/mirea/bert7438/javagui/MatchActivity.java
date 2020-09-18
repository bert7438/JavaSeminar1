package ru.mirea.bert7438.javagui;

import javax.swing.*;
import java.awt.*;

public class MatchActivity extends JFrame{
    private JButton realMadridButton;
    private JButton ACMilanButton;
    private JLabel winLabel;
    private JLabel scorerLabel;
    private JLabel resLabel;

    public MatchActivity(JButton realMadridButton, JButton ACMilanButton, JLabel winLabel, JLabel scorerLabel, JLabel resLabel) throws HeadlessException {
        this.realMadridButton = realMadridButton;
        this.ACMilanButton = ACMilanButton;
        this.winLabel = winLabel;
        this.scorerLabel = scorerLabel;
        this.resLabel = resLabel;
    }

    public MatchActivity(GraphicsConfiguration gc, JButton realMadridButton, JButton ACMilanButton, JLabel winLabel, JLabel scorerLabel, JLabel resLabel) {
        super(gc);
        this.realMadridButton = realMadridButton;
        this.ACMilanButton = ACMilanButton;
        this.winLabel = winLabel;
        this.scorerLabel = scorerLabel;
        this.resLabel = resLabel;
    }

    public MatchActivity(String title, JButton realMadridButton, JButton ACMilanButton, JLabel winLabel, JLabel scorerLabel, JLabel resLabel) throws HeadlessException {
        super(title);
        this.realMadridButton = realMadridButton;
        this.ACMilanButton = ACMilanButton;
        this.winLabel = winLabel;
        this.scorerLabel = scorerLabel;
        this.resLabel = resLabel;
    }

    public MatchActivity(String title, GraphicsConfiguration gc, JButton realMadridButton, JButton ACMilanButton, JLabel winLabel, JLabel scorerLabel, JLabel resLabel) {
        super(title, gc);
        this.realMadridButton = realMadridButton;
        this.ACMilanButton = ACMilanButton;
        this.winLabel = winLabel;
        this.scorerLabel = scorerLabel;
        this.resLabel = resLabel;
    }
}
