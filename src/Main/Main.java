package Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {

    JButton button1;
    JButton button2;

    DemoPanel demoPanel;
    ButtonHandler buttonHandler;


    public Main(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("StageLightCompany AB");

        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(800, 480));
        bottomPanel.setBackground(new Color(30,30,30));
        bottomPanel.setLayout(new BorderLayout(2,2));

        buttonHandler = new ButtonHandler(this,demoPanel);
        demoPanel = new DemoPanel(buttonHandler);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(800, 80));
        buttonPanel.setBackground(new Color(50,50,50));
        buttonPanel.setBorder(new EmptyBorder(10,10,10,10));

        button1 = new JButton("Show another StageClass >>");
        button2 = new JButton("Show another Configuration >>");
        button1.setPreferredSize(new Dimension(240,50));
        button2.setPreferredSize(new Dimension(240,50));
        button1.addActionListener(new ButtonHandler(this, demoPanel));
        button2.addActionListener(new ButtonHandler(this, demoPanel));

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPanel.setAlignmentY(Component.CENTER_ALIGNMENT);


        bottomPanel.add(demoPanel, BorderLayout.CENTER);
        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

        window.add(bottomPanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);


    }

    public static void main(String[] args) {

        Main m = new Main();

    }
}
