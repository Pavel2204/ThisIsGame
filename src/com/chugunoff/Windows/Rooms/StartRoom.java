package com.chugunoff.Windows.Rooms;


import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.Control.Player;
import com.chugunoff.CGE.Graphics.Window.Room;
import com.chugunoff.CGE.Zones.TPZone;
import com.chugunoff.CGE.Utils.Dialog;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_ONE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartRoom extends Room {

    JFrame frame;
    JPanel panel;
    JLabel test;
    JLabel player;
    JLabel location;
    JPanel MenuBar;
    JLabel animate;
    JLabel animateCount;
    JLabel MenuBtn;
    JComponent background;
    JLabel Door;
    int y = 0;
    int asdf = 213;
    int ACRight = 0;
    int ACLeft = 0;
    int ACDown = 0;
    int ACUp = 0;
    boolean isRight;
    TPZone FC_ONE;
    boolean isLeft;

    @Override
    public void run() {
        initFrame();

    }

    Thread update = new Thread(new Runnable() {
        @Override
        public void run() {
            while (Config.run){
                
            }
        }
    });

    public void debug(){
        FC_ONE.createVisible(panel);
    }

    void initFrame() {


        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(0, -1200, Config.WIN_WIDTH, 2000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        drawFrame();
        initListeners();
        update.start();


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack( );
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }


    public void drawFrame() {
        //obj_player
        player = new JLabel(Config.resources.PlayerRight[0]);
        player.setBounds(Player.x, Player.y, 100, 250);
        player.setBackground(Color.BLACK);
        panel.add(player);

        //jpn_MenuBar
        MenuBar = new JPanel();
        MenuBar.setBounds(400,150,200,500);
        MenuBar.setBackground(Color.white);
        MenuBar.setLayout(null);

        //btn_MenuBtn
        MenuBtn = new JLabel(Config.resources.ExitAlternative);
        MenuBtn.setBounds(143, 50, 21,21);
        panel.add(MenuBtn);

        //obj_portal1
        Door = new JLabel(Config.resources.Portal1);
        Door.setBounds(500,-1000, 35,35);
        panel.add(Door);

        //lbl_location
        location = new JLabel("X:" + Player.x + "\n \n Y:" + Player.y);
        location.setBounds(50,25,300,125);
        location.setForeground(new Color(222, 220, 220));
        panel.add(location);

        FC_ONE = new TPZone(0,-1200 , 1200,60);
        FC_ONE.setTPLocation(75,300);

        //lbl_animation
        animate = new JLabel("Count of animates: ");
        animate.setBounds(50,150,300,125);
        animate.setForeground(new Color(222, 220, 220));
        panel.add(animate);

        //lbl_animateCount
        animateCount = new JLabel("Left: " + ACLeft + "\n\n Right: " + ACRight);
        animateCount.setBounds(50,180,300,125);
        animateCount.setForeground(new Color(222, 220, 220));
        panel.add(animateCount);

        //lbl_animateCount
        if(Config.DEBUG){
            debug();
        }

        //obj_test
        test = new JLabel(Config.resources.HENTAI);
        test.setBounds(500,-1200,50,50);
        panel.add(test);

        //cmp_background
        background = new JLabel(Config.resources.UniverseVaccum);
        background.setBounds(0,-1200,1200,2000);
        panel.add(background);
    }


    public void initListeners() {

        MenuBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);

            }
        });

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {


                if (e.getKeyChar() == 'w') {
                    if (Config.player.y <= 50) {
                       if (y < 1200) {
                            y += 10;
                        }
                       else if(y == 1200){
                          /////if(Config.player.x >= 460 && Config.player.x <= 530){
                           //    if(Config.player.y == 50){
                           ////       FC_ONE nextRoom = new FC_ONE();
                              //     frame.dispose();
                              //     javax.swing.SwingUtilities.invokeLater(nextRoom);
                             //  }
                          // }
                       }
                    } else {
                        Player.move("Up");
                        try {
                            Thread.sleep(Config.SLEEPMS);
                        } catch (InterruptedException ex) {
                            new Dialog("The error has occuped! \n " + ex.toString());
                        }


                        if (ACUp > 6) {
                            ACUp = 0;
                        }

                        player.setIcon(Config.resources.PlayerUp[ACUp]);
                        // player.setLocation(Config.player.x, Config.player.y);
                        ACUp++;

                        player.setLocation(Config.player.x, Config.player.y);
                    }
                }
                if (e.getKeyChar() == 'a') {
                    if (Config.player.x > 0) {
                        Player.move("Left");
                        try {
                            Thread.sleep(Config.SLEEPMS);
                        } catch (InterruptedException ex) {
                            new Dialog("The error has occuped! \n " + ex.toString());
                        }

                    }
                    if (ACLeft > 7) {
                        ACLeft = 0;
                    }

                    player.setIcon(Config.resources.PlayerLeft[ACLeft]);
                    player.setLocation(Config.player.x, Config.player.y);
                    ACLeft++;

                }
                if (e.getKeyChar() == 's') {
                    if (Config.player.y >= 450) {
                        if (y > 0) {
                            y -= 20;
                        }
                    } else {
                        Player.move("Down");
                        try {
                            Thread.sleep(Config.SLEEPMS);
                        } catch (InterruptedException ex) {
                            new Dialog("The error has occuped! \n " + ex.toString());
                        }


                        if (ACDown > 6) {
                            ACDown = 0;
                        }

                        player.setIcon(Config.resources.PlayerDown[ACDown]);
                        // player.setLocation(Config.player.x, Config.player.y);
                        ACDown++;


                        player.setLocation(Config.player.x, Config.player.y);
                    }
                }
                if (e.getKeyChar() == 'd') {
                    if (Config.player.x < 1090) {
                        Player.move("Right");
                        try {
                            Thread.sleep(35L);
                        } catch (InterruptedException ex) {
                            new Dialog("The error has occuped! \n " + ex.toString());
                        }
                    }

                    if (ACRight > 7) {
                        ACRight = 0;
                    }

                    player.setIcon(Config.resources.PlayerRight[ACRight]);
                    player.setLocation(Config.player.x,Config.player.y);
                    ACRight++;
                }

                if (Config.player.y >= 50){
                    background.setLocation(0, -1200 + y);
                    test.setLocation(500,-1200 + y);
            }


                location.setText("X:" + Player.x + "\n \n Y:" + Player.y);
                animateCount.setText("Left: " + ACLeft + "\n\n Right: " + ACRight);

                //player.setLocation(Player.x, Player.y);
                background.setLocation(0,-1200 + y);
                FC_ONE.setLocation(0,-1200+y);
                FC_ONE.checkTPZone(player,new FC_ONE(),frame);

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(isLeft) {
                    player.setIcon(Config.resources.PlayerLeft[0]);
                }else if(isRight){
                    player.setIcon(Config.resources.PlayerRight[9]);
                }
            }
        });
    }

}
