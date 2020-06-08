package com.chugunoff.Windows.Windows;

import com.chugunoff.GEngine.Game.Config;

import javax.swing.*;
import java.awt.*;

public class Settings implements Runnable {

    JFrame frame;
    JPanel panel;



    @Override
    public void run() {
        initFrame();
    }

    void initFrame() {

        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(0, 0, Config.WIN_WIDTH, Config.WIN_HEIGHT);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        frame = new JFrame();
        initObjects();
        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(exit());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game |Settings|");
    }

    int exit(){
        frame.dispose();
        return WindowConstants.DO_NOTHING_ON_CLOSE;
    }

    void initObjects(){

    }

}
