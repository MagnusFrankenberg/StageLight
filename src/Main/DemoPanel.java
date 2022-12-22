package Main;


import animations.*;

import javax.swing.*;
import java.awt.*;

public class DemoPanel extends JPanel implements Runnable {


    int FPS = 60;

    Stage stage;

    Thread demoThread;
    ButtonHandler buttonHandler;


    public StageSmall stageSmall = new StageSmall(this);
    public StageMedium stageMedium = new StageMedium(this);
    public StageLarge stageLarge = new StageLarge(this);


    public DemoPanel(ButtonHandler buttonHandler) {
        this.buttonHandler = buttonHandler;
        this.setPreferredSize(new Dimension(800, 400));
        this.setBackground(new Color(50, 50, 50));
        this.setDoubleBuffered(true);
        setStartStage();
        startDemoThread();
    }


    public void nextStage() {
        if (stage instanceof StageSmall) {
            stage = stageMedium;
        } else if (stage instanceof StageMedium) {
            stage = stageLarge;
        } else if (stage instanceof StageLarge) {
            stage = stageSmall;
        }
    }

    public void nextConfiguration() {
        if (stage.myConfigState == ConfigState.CONFIG1){
            stage.configuration2();
        }else if(stage.myConfigState==ConfigState.CONFIG2){
            stage.configuration3();
        }else if(stage.myConfigState==ConfigState.CONFIG3){
            stage.configuration1();
        }
    }


    public void setStartStage() {
        stage = stageSmall;
        stage.configuration1();
    }


    public void startDemoThread() {
        demoThread = new Thread(this);
        demoThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (demoThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {

        stage.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        stage.draw(g2);
        g2.dispose();
    }
}
