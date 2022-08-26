package frames;

import application.RhyThmGame;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
    public DynamicBeat() {
        this.setTitle("Dynamic Beat");
        this.setSize(RhyThmGame.SCREENWIDTH, RhyThmGame.SCREENHEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
