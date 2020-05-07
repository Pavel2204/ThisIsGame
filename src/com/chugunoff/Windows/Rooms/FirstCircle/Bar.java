package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.Engine.Graphics.Animation;
import com.chugunoff.Engine.Graphics.Dialog.PanelDialog;
import com.chugunoff.Engine.Graphics.Object;
import com.chugunoff.Engine.Utils.Dialog;
import com.chugunoff.InfoClasses.Config;
import com.chugunoff.Engine.Control.Player;
import com.chugunoff.Engine.Zones.TPZone;
import com.chugunoff.Engine.Zones.Wall;
import com.chugunoff.res.LoadResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.chugunoff.InfoClasses.Config.dir;
import static java.lang.Thread.sleep;
import static javax.swing.JLayeredPane.*;

public class Bar implements Runnable {

    JFrame frame;
    JPanel panel, playerBack;
    JLabel player, Background, location;
    Wall tables1, tables2, tables3,DarvinWall;
    TPZone Back;
    boolean onDarvin = false,ije = true;
    int ACLeft = 0;
    int ACRight = 0;
    int ACUp = 0;
    int ACDown = 0;
    String deltaDirect = "Up";
    Animation f1,f2,f3,f4, Darvin;
    PanelDialog DarvinDialog;

    @Override
    public void run() {
        initFrame();
    }

    private void initDialogs(){
        DarvinDialog = new PanelDialog(frame,panel,Config.resources.Darvin.icons[0],Player.y,new String[]{
                "Хррррр...",
                "Хррррр...",
                "Хррррр..."
        },new Thread(new Runnable() {
            @Override
            public void run() {
                if(ije) {
                    frame.dispose();
                    reInitFrame2();
                    ije = !ije;
                }
            }
        }),Config.resources.font.getFont(22.5f));
    }

    void initFrame() {
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(-1800, 0, Config.WIN_WIDTH, 2000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        initDialogs();
        drawFrame();
        initListeners();


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack();
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }

    void reInitFrame2(){
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(-1800, 0, Config.WIN_WIDTH, 2000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        initDialogs();
        new PanelDialog(frame,panel,Config.resources.PlayerDown[0],Player.y, new String[]{
                "Похоже он спит...",
                "",
                ""
        },new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }),Config.resources.font.getFont(22.5f)).init();
        drawFrame();
        initListeners();


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack();
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }

    void reInitFrame() {
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(-1800, 0, Config.WIN_WIDTH, 2000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        initDialogs();
        DarvinDialog.init();
        drawFrame();
        initListeners();


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack();
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }

    void debug() {
        panel.add(location);
        panel.add(playerBack);
        // tables1.createVisible(panel);
        //tables2.createVisible(panel);
        DarvinWall.createVisible(panel);
        tables3.createVisible(panel);
        Back.createVisible(panel);
    }

    private void drawFrame() {

        addAnimation();
        f1.stop();
        f2.stop();
        f3.stop();
        f4.stop();
        //Darvin.stop();

        //obj_location
        location = new JLabel("X:" + Player.x + "\n \n Y:" + Player.y);
        location.setBounds(50, 25, 300, 125);
        location.setForeground(new Color(222, 220, 220));


        //obj_player
        player = new JLabel(Config.resources.PlayerRight[8]);
        player.setBounds(Config.player.x, Config.player.y, 100, 250);
        panel.add(player);

        playerBack = new JPanel();
        playerBack.setBackground(Color.DARK_GRAY);
        playerBack.setBounds(player.getBounds());

        tables1 = new Wall(540, 565, 5043, 28340);
        tables2 = new Wall(0, 565, 340, 2344);
        tables3 = new Wall(0, 200, 1000000000, 1);
        DarvinWall = new Wall(50, 215,Darvin.frames[0].getIconWidth() - 120,50);

        Back = new TPZone(340, 700, 200, 234);
        FC_ONE.c = new Point(975, 270);
        FC_ONE.x = 1800;

        if (Config.DEBUG) {
            debug();
        }

        LoadResource.Darvin.setLocation(0,150);
        LoadResource.Darvin.show(panel);



        Background = new JLabel(Config.resources.Bar);
        Background.setBounds(0, 0, 1200, 800);
        panel.add(Background,DEFAULT_LAYER);

    }
    void redrawBackground(){
        Background = new JLabel(Config.resources.Bar);
        Background.setBounds(0, 0, 1200, 800);
        panel.add(Background);
    }

    private void addAnimation(){
        f1 = new Animation(Config.resources.BarFire, new Object(931, 47, Config.resources.BarFire[1], panel), 4, 100, true);
        f2 = new Animation(Config.resources.BarFire2, new Object(590, 52, Config.resources.BarFire2[1], panel), 4, 100, true);
        f3 = new Animation(Config.resources.BarFire3, new Object(870, 70, Config.resources.BarFire3[1], panel), 4, 100, true);
        f4 = new Animation(Config.resources.BarFire4, new Object(0, 0, Config.resources.BarFire4[1], panel), 4, 100, true);
        Darvin = new Animation(Config.resources.Darvin.icons, LoadResource.Darvin, 1, 750, true);

        f1.animate();
        f2.animate();
        f3.animate();
        f4.animate();
        Darvin.animate();
    }

    private void initListeners() {

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'w') {
                    if (tables3.checkCollision(player)) {
                        if (Config.player.y > 0) {
                            Player.move("Up");
                            deltaDirect = "Up";//
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
                }
                if (e.getKeyChar() == 'a') {
                    if (tables2.checkCollision(player)) {
                        if (Config.player.x > 0) {
                            deltaDirect = "Left";
                            Player.move("Left");
                            try {
                                Thread.sleep(Config.SLEEPMS);
                            } catch (InterruptedException ex) {
                                new Dialog("The error has occuped! \n " + ex.toString());
                            }


                            if (ACLeft > 7) {
                                ACLeft = 0;
                            }

                            player.setIcon(Config.resources.PlayerLeft[ACLeft]);
                            // player.setLocation(Config.player.x, Config.player.y);
                            ACLeft++;
                            player.setLocation(Config.player.x, Config.player.y);
                        }
                    }
                }
                if (e.getKeyChar() == 's') {
                    if (tables1.checkCollision(player)) {
                        if (tables2.checkCollision(player)) {
                            if (Config.player.y < 4050) {
                                deltaDirect = "Down";
                                Player.move("Down");
                                try {
                                    Thread.sleep(Config.SLEEPMS);
                                } catch (InterruptedException ex) {
                                    new Dialog("The error has occuped! \n " + ex.toString());
                                }


                                if (ACDown > 6) {
                                    ACDown= 0;
                                }

                                player.setIcon(Config.resources.PlayerDown[ACDown]);
                                // player.setLocation(Config.player.x, Config.player.y);
                                ACDown++;
                                player.setLocation(Config.player.x, Config.player.y);
                            }
                        }
                    }
                }
                if (e.getKeyChar() == 'd') {
                    if (tables1.checkCollision(player)) {
                        if (Config.player.x < 1100) {
                            deltaDirect = "Right";
                            Player.move("Right");
                            try {
                                Thread.sleep(35L);
                            } catch (InterruptedException ex) {
                                new Dialog("The error has occuped! \n " + ex.toString());
                            }


                            if (ACRight > 7) {
                                ACRight = 0;
                            }

                            player.setIcon(Config.resources.PlayerRight[ACRight]);
                            ACRight++;
                            player.setLocation(Config.player.x, Config.player.y);
                        }
                    }
                }

                if(e.getKeyCode() == KeyEvent.VK_Z && !DarvinWall.checkCollision(player)) {
                    frame.dispose();
                    reInitFrame();
                    ije = true;
                }

                playerBack.setLocation(player.getLocation());
                location.setText("X:" + player.getX() + "\n \n Y:" + player.getY());
                Back.checkTPZone(player, new FC_ONE(), frame);
            }

            @Override
            public void keyReleased(KeyEvent e) {//
                if(deltaDirect == "Right"){
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerStep.png"));
                } else if (deltaDirect == "Left") {
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerStep.png"));
                } else if (deltaDirect == "Up") {
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerStep.png"));
                } else if (deltaDirect == "Down") {
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerStep.png"));
                }
            }
        });
    }

}


