package com.chugunoff.ThisIsGame.Windows;

import com.chugunoff.ThisIsGame.InfoClasses.Config;

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
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        JLabel hentai = new JLabel(Config.resources.HENTAI);
        hentai.setBounds(0,0,800,500);
        panel.add(hentai);


        frame = new JFrame();
        initObjects();
        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Settings");
    }

    int exit(){
        frame.dispose();
        return 0;
    }

    void initObjects(){

    }

}
