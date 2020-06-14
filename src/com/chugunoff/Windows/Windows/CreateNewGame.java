package com.chugunoff.Windows.Windows;

import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.IOGame.Load;
import com.chugunoff.CGE.Control.Player;
import com.chugunoff.CGE.IOGame.Save;
import com.chugunoff.CGE.Utils.Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class CreateNewGame implements Runnable{

    static JFrame frame;
    static JPanel panel;

    static String Name;
    private static String dir = new File("").getAbsolutePath();

    //Objects
    JLabel Warning;
    JLabel EntName;
    JLabel Cancel;
    JLabel NewGame;
    static JLabel _Name;

    @Override
    public void run() {
        initFrame(); //Create basic window
        initObjects(); //Draw on window all elements
        initNameChooser(); //Create keyboard listener

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
        frame.setTitle("New game");
    }

    void initObjects() {

        //btn_NewGame
        NewGame = new JLabel(Config.resources.StartDeact);
        NewGame.setBounds(400, 500 , 200, 50);
        panel.add(NewGame);

        //btn_Cancel
        Cancel = new JLabel(Config.resources.CancelDeact);
        Cancel.setBounds(800,500,200,50);
        panel.add(Cancel);

        //lbl_warning
        Warning = new JLabel("P.S. You have only one chance choose your name!");
        Warning.setBounds(5, 745, Config.WIN_WIDTH - 5, 25);
        Warning.setForeground(Color.DARK_GRAY);
        Warning.setFont(new Font(Warning.getFont().getName(), Font.PLAIN, 15));
        panel.add(Warning);

        //ent_EntName
        EntName = new JLabel("Name:");
        EntName.setBounds(Config.WIN_WIDTH - 700,300,200, 25);
        EntName.setForeground(Color.WHITE);
        EntName.setFont(new Font(EntName.getFont().getName(), Font.PLAIN, 25));
        panel.add(EntName);

        //lbl__Name
        _Name = new JLabel(Name);
        _Name.setBounds(Config.WIN_WIDTH - 600,300,550, 25);
        _Name.setForeground(Color.YELLOW);
        _Name.setFont(new Font(_Name.getFont().getName(), Font.PLAIN, 25));
        panel.add(_Name);

        //Adapters

        NewGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Config.player = new Player(500,300, 100,100,0,10,1,1,_Name.getText(),new ImageIcon(""));
                new Dialog("Player name is " + Config.player.Name);

                try {
                    new Save(new Object[]{Config.player.Name, Config.player.DMG, Config.player.Money, Config.player.x, Config.player.y, Config.player.Atk_ID, Config.player.Def_ID, Config.player.HP, Config.player.MP, 0},
                            dir + "/Data/Game.save");

                    new Load(dir + "/Data/Game.save");
                    frame.dispose();
                } catch (IOException ex) {
                    new Dialog("Error has been ocuped \n" + ex.getMessage());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                NewGame.setIcon(Config.resources.StartAct);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                NewGame.setIcon(Config.resources.StartDeact);
            }
        });

        //btn_Cancel
        Cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                MainMenu mainmenu = new MainMenu();
                javax.swing.SwingUtilities.invokeLater(mainmenu);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Cancel.setIcon(Config.resources.CancelAct);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Cancel.setIcon(Config.resources.CancelDeact);
            }
        });

}

    static void initNameChooser(){

        Name = "";

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Name += Character.toString(e.getKeyChar());
                _Name.setText(Name);
                panel.add(_Name);
                System.out.print(e.getKeyChar());
            }
        });
    }

}