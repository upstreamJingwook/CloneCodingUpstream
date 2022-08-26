package frames;

import application.RhyThmGame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Objects;

public class DynamicBeat extends JFrame {
    private Image screenImage;
    private Graphics screenGraphic;

    private final Image introBackground;

    public DynamicBeat() {
        this.setTitle("Dynamic Beat");
        this.setSize(RhyThmGame.SCREENWIDTH, RhyThmGame.SCREENHEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        introBackground = new ImageIcon("./src/main/resources/introBackground.jpg")
                .getImage();
    }

    public void paint(Graphics graphics) {
        screenImage = createImage(RhyThmGame.SCREENWIDTH, RhyThmGame.SCREENHEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        graphics.drawImage(screenImage, 0, 0, null);
    }

    private void screenDraw(Graphics screenGraphic) {
        screenGraphic.drawImage(introBackground, 0, 0, null);
        this.repaint();
    }
}
