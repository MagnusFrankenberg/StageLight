package animations;

import Main.DemoPanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class TextLabel {

    public int x;
    public int y;
    DemoPanel dp;
    BufferedImage image;

    public TextLabel(DemoPanel dp,int x, int y, BufferedImage image) {
        this.dp = dp;
        this.x = x;
        this.y = y;
        this.image=image;
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(image, x, y,300,120,null);
    }
}
