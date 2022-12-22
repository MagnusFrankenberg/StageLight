package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    Main main;
    DemoPanel dp;
    public ButtonHandler(Main main, DemoPanel dp){
        this.main = main;
        this.dp = dp;

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(main.button1)){
            dp.nextStage();
        }
        if(e.getSource().equals(main.button2)){
            dp.nextConfiguration();
        }
    }
}
