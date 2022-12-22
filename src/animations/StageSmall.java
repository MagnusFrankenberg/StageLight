package animations;

import Main.DemoPanel;
import java.awt.*;
public class StageSmall extends Stage {

    public StageSmall(DemoPanel dp) {
        this.dp = dp;
        configuration1();
    }

    public void configuration1() {
        lamp1 = new Lamp(this.dp,200, 100, spriteLoader.circleBlue, 5);
        lamp2 = new Lamp(this.dp,260, 100, spriteLoader.circleBlue, 5);
        lamp3 = new Lamp(this.dp,440, 100, spriteLoader.circleRed, 5);
        lamp4 = new Lamp(this.dp,500, 100, spriteLoader.circleRed, 5);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(3));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(0));

        myConfigState = ConfigState.CONFIG1;
    }

    public void configuration2() {
        lamp1 = new Lamp(this.dp, 200, 100, spriteLoader.circleRed, 5);
        lamp2 = new Lamp(this.dp, 300, 100, spriteLoader.circleYellow, 5);
        lamp3 = new Lamp(this.dp, 400, 100, spriteLoader.circleYellow, 5);
        lamp4 = new Lamp(this.dp, 500, 100, spriteLoader.circleRed, 5);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(3));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(1));

        myConfigState = ConfigState.CONFIG2;
    }

    public void configuration3() {
        lamp1 = new Lamp(this.dp, 280, 80, spriteLoader.circleYellow, 2);
        lamp2 = new Lamp(this.dp, 280, 180, spriteLoader.circleRed, 5);
        lamp3 = new Lamp(this.dp, 420, 80, spriteLoader.circleYellow, 2);
        lamp4 = new Lamp(this.dp, 420, 180, spriteLoader.circleRed, 5);

        textLabel1 = new TextLabel(this.dp, 230,250,spriteLoader.textLabels.get(3));
        textLabel2 = new TextLabel(this.dp, 230,310,spriteLoader.textLabels.get(2));

        myConfigState = ConfigState.CONFIG3;
    }


    @Override
    public void update() {
        lamp1.update();
        lamp2.update();
        lamp3.update();
        lamp4.update();
    }

    @Override
    public void draw(Graphics2D g2) {
        lamp1.draw(g2);
        lamp2.draw(g2);
        lamp3.draw(g2);
        lamp4.draw(g2);
        textLabel1.draw(g2);
        textLabel2.draw(g2);

    }
}
