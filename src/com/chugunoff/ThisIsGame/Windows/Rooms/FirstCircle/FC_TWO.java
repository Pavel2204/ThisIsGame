package com.chugunoff.ThisIsGame.Windows.Rooms.FirstCircle;

import com.chugunoff.ThisIsGame.InfoClasses.Config;
import com.chugunoff.ThisIsGame.Engine.Control.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FC_TWO implements Runnable {

    JFrame frame;
    JPanel panel;

    @Override
    public void run() {
        initFrame();
    }

    void initFrame(){
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(-1800, 0, Config.WIN_WIDTH, 2000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        drawFrame();
        initListeners();


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack( );
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }

    private void drawFrame() {


    }


    private void initListeners() {

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

            }
            });
    }
}

