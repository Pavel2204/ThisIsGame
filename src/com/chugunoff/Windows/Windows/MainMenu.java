package com.chugunoff.Windows.Windows;

import com.chugunoff.CGE.Graphics.CutScene.Slide;
import com.chugunoff.CGE.Graphics.Dialog.GraphicsDictor;
import com.chugunoff.CGE.Utils.IconInfo;
import com.chugunoff.CGE.Utils.Sleep;
import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.IOGame.Load;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class MainMenu implements Runnable {


    JFrame frame;
    JPanel panel;
    //Objects
    JLabel NewGame;
    JLabel LoadGame;
    JLabel Settings;
    JLabel Exit;
    JLabel GameName;
    JLabel AESLogo;
    JLabel alphaBlack;


    String dir = new File("").getAbsolutePath();

    boolean GoodNikita = false;

    @Override
    public void run() {
        System.out.print("Game directory - " + dir);
        initFrame(); //Create basic window
        IconInfo.getSize(Config.resources.AESLogo);
        initObjects(); //Draw on window all elements
    }

    void initFrame() {
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(0, 0, Config.WIN_WIDTH, Config.WIN_HEIGHT);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        frame = new JFrame();
        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack();
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game");

        AESLogo = new JLabel();

    }

    void initObjects() {

        AESLogo = new JLabel();
        panel.add(AESLogo);
        new Slide(Config.resources.AESLogo).show(2500l,panel,AESLogo);
        panel.repaint();
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Sleep(Config.LOGOSHOWTIME);
                panel.remove(AESLogo);
                panel.repaint();
            }
        }).start();

        //btn_NewGame
        NewGame = new JLabel(Config.resources.NewGameDeact);
        NewGame.setBounds(400, 200 , 400, 50);
        panel.add(NewGame);

        //lbl_GameName
        GameName = new JLabel("");
        GameName.setBounds(Config.WIN_WIDTH / 4, 50, 900, 50);
        GameName.setForeground(Color.WHITE);
        GameName.setFont(new Font(GameName.getFont().getName(), Font.PLAIN, 30));
        panel.add(GameName);
        new GraphicsDictor().speak("Никита любит кушац.",GameName,10L,Config.resources.font.getFont(30f));

        //btn_LoadGame
        LoadGame = new JLabel(Config.resources.LoadGameDeact);
        LoadGame.setBounds(400, 300 , 400, 50);
        panel.add(LoadGame);

        //btn_Settings
        Settings = new JLabel(Config.resources.SettingsDeact);
        Settings.setBounds(400, 400 , 400, 50);
        panel.add(Settings);

        //btn_Settings
        Exit = new JLabel(Config.resources.ExitGameDeact);
        Exit.setBounds(400, 500 , 400, 50);
        panel.add(Exit);


        ///Adapters

        //btn_NewGame
        NewGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GameName.setText("Новый Никита хочет кушац.");
                new GraphicsDictor().speak("Новый Никита хочет кушац.",GameName,10L);
                CreateNewGame NG = new CreateNewGame();
                javax.swing.SwingUtilities.invokeLater(NG);
                frame.dispose();

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                new GraphicsDictor().speak("Оох, семпай, этот курсор слишком горяч для меня!",GameName,10L);

                NewGame.setIcon(Config.resources.NewGameAct);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                new GraphicsDictor().speak("Никита хочет кушац.",GameName,10L);
                NewGame.setIcon(Config.resources.NewGameDeact);
            }
        });

        //btn_Exit
        Exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                new GraphicsDictor().speak("Семпай, пожалуйста, не уходи от меня!",GameName,10L);
                Exit.setIcon(Config.resources.ExitGameAct);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                new GraphicsDictor().speak("Никита хочет кушац.",GameName,10L);
                Exit.setIcon(Config.resources.ExitGameDeact);
            }
        });

        //btn_Settings
        Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new GraphicsDictor().speak("Никита хочет кушац.",GameName,10L);
                NewGame.setIcon(Config.resources.NewGameDeact);
                com.chugunoff.Windows.Windows.Settings ST = new Settings();
                javax.swing.SwingUtilities.invokeLater(ST);


            }

            @Override
            public void mouseEntered(MouseEvent e) {
                new GraphicsDictor().speak("Сейчас вы увидите хентай по-программистски",GameName,10L);
                Settings.setIcon(Config.resources.SettingsAct);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                new GraphicsDictor().speak("Никита хочет кушац.",GameName,10L);
                Settings.setIcon(Config.resources.SettingsDeact);
            }
        });

        //btn_LoadGame
        LoadGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new GraphicsDictor().speak("Никита хочет кушац.",GameName,10L);

                frame.dispose();
                try {
                    Load load = new Load(dir + "/Data/Game.save");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                new GraphicsDictor().speak("Лиза кука",GameName,10L);
                LoadGame.setIcon(Config.resources.LoadGameAct);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                new GraphicsDictor().speak("Никита хочет кушац.",GameName,10L);
                LoadGame.setIcon(Config.resources.LoadGameDeact);
            }
        });



    }

}

