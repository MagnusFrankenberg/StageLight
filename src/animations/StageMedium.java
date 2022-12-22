package animations;

import Main.DemoPanel;
import java.awt.*;

public class StageMedium extends Stage{

    public StageMedium(DemoPanel dp) {
        this.dp = dp;
        configuration1();
    }

    public void configuration1() {
        lamp1 = new Lamp(this.dp, 200, 100, spriteLoader.circleRed, 5);
        lamp2 = new Lamp(this.dp, 260, 100, spriteLoader.circleRed, 5);
        lamp3 = new Lamp(this.dp, 200, 200, spriteLoader.circleYellow, 5);
        lamp4 = new Lamp(this.dp, 260, 200, spriteLoader.circleYellow, 5);
        lamp5 = new Lamp(this.dp, 440, 100, spriteLoader.circleRed, 5);
        lamp6 = new Lamp(this.dp, 500, 100, spriteLoader.circleRed, 5);
        lamp7 = new Lamp(this.dp, 440, 200, spriteLoader.circleYellow, 5);
        lamp8 = new Lamp(this.dp, 500, 200, spriteLoader.circleYellow, 5);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(4));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(0));

        myConfigState = ConfigState.CONFIG1;
    }

    public void configuration2() {
        lamp8 = new Lamp(this.dp, 80, 80, spriteLoader.circleYellow, 1);
        lamp1 = new Lamp(this.dp, 160, 80, spriteLoader.circleYellow, 2);
        lamp2 = new Lamp(this.dp, 240, 80, spriteLoader.circleYellow, 3);
        lamp3 = new Lamp(this.dp, 320, 80, spriteLoader.circleBlue, 8);
        lamp4 = new Lamp(this.dp, 400, 80, spriteLoader.circleBlue, 8);
        lamp5 = new Lamp(this.dp, 480, 80, spriteLoader.circleYellow, 3);
        lamp6 = new Lamp(this.dp, 560, 80, spriteLoader.circleYellow, 2);
        lamp7 = new Lamp(this.dp, 640, 80, spriteLoader.circleYellow, 1);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(4));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(1));

        myConfigState = ConfigState.CONFIG2;
    }

    public void configuration3() {
        lamp1 = new Lamp(this.dp, 200, 100, spriteLoader.circleRed, 5);
        lamp2 = new Lamp(this.dp, 260, 100, spriteLoader.circleYellow, 5);
        lamp3 = new Lamp(this.dp, 200, 200, spriteLoader.circleGreen, 10);
        lamp4 = new Lamp(this.dp, 260, 200, spriteLoader.circleBlue, 15);
        lamp5 = new Lamp(this.dp, 440, 100, spriteLoader.circleRed, 5);
        lamp6 = new Lamp(this.dp, 500, 100, spriteLoader.circleYellow, 5);
        lamp7 = new Lamp(this.dp, 440, 200, spriteLoader.circleGreen, 10);
        lamp8 = new Lamp(this.dp, 500, 200, spriteLoader.circleBlue, 15);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(4));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(2));

        myConfigState = ConfigState.CONFIG3;
    }

    @Override
    public void update() {
        lamp1.update();
        lamp2.update();
        lamp3.update();
        lamp4.update();
        lamp5.update();
        lamp6.update();
        lamp7.update();
        lamp8.update();
    }

    @Override
    public void draw(Graphics2D g2) {
        lamp1.draw(g2);
        lamp2.draw(g2);
        lamp3.draw(g2);
        lamp4.draw(g2);
        lamp5.draw(g2);
        lamp6.draw(g2);
        lamp7.draw(g2);
        lamp8.draw(g2);

        textLabel1.draw(g2);
        textLabel2.draw(g2);

    }
}
