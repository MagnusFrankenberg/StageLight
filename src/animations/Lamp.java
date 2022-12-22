package animations;

import Main.DemoPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Lamp {

    public int spriteCounter =0;
    public int spriteNum = 0;
    int flashSpeed;

    public int x;
    public int y;
    DemoPanel dp;
    List<BufferedImage> myLamp;

    public Lamp(DemoPanel dp,int x, int y, List<BufferedImage> myLamp, int flashSpeed ) {
        this.dp = dp;
        this.x = x;
        this.y = y;
        this.myLamp = new ArrayList<>(myLamp);
        this.flashSpeed = flashSpeed;

    }


    public void update() {

        spriteCounter++;
        if (spriteCounter > flashSpeed) {
            spriteNum++;
            if(spriteNum>4){
                spriteNum=0;
            }
            spriteCounter = 0;
        }
    }



    public void draw(Graphics2D g2) {
        BufferedImage image = null;

        image = myLamp.get(spriteNum);

        g2.drawImage(image, x, y, 48, 48, null);
    }
}
