package animations;

import Main.DemoPanel;
import java.awt.*;
public class StageLarge extends Stage{

    public StageLarge(DemoPanel dp) {
        this.dp = dp;
        configuration1();
    }

    public void configuration1() {
        lamp1 = new Lamp(this.dp,180, 80, spriteLoader.circleYellow, 5);
        lamp2 = new Lamp(this.dp, 240, 80, spriteLoader.circleYellow, 5);
        lamp3 = new Lamp(this.dp, 300, 80, spriteLoader.circleYellow, 5);
        lamp4 = new Lamp(this.dp, 180, 160, spriteLoader.circleGreen, 5);
        lamp5 = new Lamp(this.dp, 240, 160, spriteLoader.circleBlue, 5);
        lamp6 = new Lamp(this.dp, 300, 160, spriteLoader.circleGreen, 5);
        lamp7 = new Lamp(this.dp, 460, 80, spriteLoader.circleYellow, 5);
        lamp8 = new Lamp(this.dp, 520, 80, spriteLoader.circleYellow, 5);
        lamp9 = new Lamp(this.dp, 580, 80, spriteLoader.circleYellow, 5);
        lamp10 = new Lamp(this.dp, 460, 160, spriteLoader.circleGreen, 5);
        lamp11 = new Lamp(this.dp, 520, 160, spriteLoader.circleBlue, 5);
        lamp12 = new Lamp(this.dp, 580, 160, spriteLoader.circleGreen, 5);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(5));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(0));

        myConfigState = ConfigState.CONFIG1;
    }

    public void configuration2() {
        lamp1 = new Lamp(this.dp,180, 80, spriteLoader.circleRed, 4);
        lamp2 = new Lamp(this.dp, 240, 80, spriteLoader.circleYellow, 2);
        lamp3 = new Lamp(this.dp, 180, 130, spriteLoader.circleRed, 4);
        lamp4 = new Lamp(this.dp, 240, 130, spriteLoader.circleYellow, 2);
        lamp5 = new Lamp(this.dp, 180, 180, spriteLoader.circleRed, 4);
        lamp6 = new Lamp(this.dp, 240, 180, spriteLoader.circleYellow, 2);
        lamp7 = new Lamp(this.dp, 500, 80, spriteLoader.circleYellow, 2);
        lamp8 = new Lamp(this.dp, 560, 80, spriteLoader.circleRed, 4);
        lamp9 = new Lamp(this.dp, 500, 130, spriteLoader.circleYellow, 2);
        lamp10 = new Lamp(this.dp, 560, 130, spriteLoader.circleRed, 4);
        lamp11 = new Lamp(this.dp, 500, 180, spriteLoader.circleYellow, 2);
        lamp12 = new Lamp(this.dp, 560, 180, spriteLoader.circleRed, 4);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(5));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(1));

        myConfigState = ConfigState.CONFIG2;
    }

    public void configuration3() {
        lamp1 = new Lamp(this.dp, 160, 80, spriteLoader.circleYellow, 1);
        lamp2 = new Lamp(this.dp, 240, 80, spriteLoader.circleYellow, 2);
        lamp3 = new Lamp(this.dp, 320, 80, spriteLoader.circleYellow, 3);
        lamp4 = new Lamp(this.dp, 400, 80, spriteLoader.circleYellow, 4);
        lamp5 = new Lamp(this.dp, 480, 80, spriteLoader.circleYellow, 5);
        lamp6 = new Lamp(this.dp, 560, 80, spriteLoader.circleYellow, 6);
        lamp7 = new Lamp(this.dp, 160, 130, spriteLoader.circleYellow, 1);
        lamp8 = new Lamp(this.dp, 240, 130, spriteLoader.circleYellow, 2);
        lamp9 = new Lamp(this.dp, 320, 130, spriteLoader.circleYellow, 3);
        lamp10 = new Lamp(this.dp, 400, 130, spriteLoader.circleYellow, 4);
        lamp11 = new Lamp(this.dp, 480, 130, spriteLoader.circleYellow, 5);
        lamp12 = new Lamp(this.dp, 560, 130, spriteLoader.circleYellow, 6);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(5));
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
        lamp9.update();
        lamp10.update();
        lamp11.update();
        lamp12.update();
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
        lamp9.draw(g2);
        lamp10.draw(g2);
        lamp11.draw(g2);
        lamp12.draw(g2);

        textLabel1.draw(g2);
        textLabel2.draw(g2);

    }
}
