package animations;

import Main.ButtonHandler;
import Main.DemoPanel;

import java.awt.*;

public abstract class Stage {

    DemoPanel dp;
    public ConfigState myConfigState;
    SpriteLoader spriteLoader = SpriteLoader.getInstance();
    public Lamp lamp1, lamp2, lamp3, lamp4, lamp5, lamp6, lamp7, lamp8, lamp9, lamp10, lamp11, lamp12;
    public TextLabel textLabel1, textLabel2;

    public abstract void configuration1();
    public abstract void configuration2();
    public abstract void configuration3();
    public abstract void update();
    public abstract void draw(Graphics2D g2);


}
