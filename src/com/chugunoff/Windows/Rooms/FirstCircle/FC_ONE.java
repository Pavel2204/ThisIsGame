package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.Engine.Graphics.Object;
import com.chugunoff.InfoClasses.Config;
import com.chugunoff.Engine.Control.Player;
import com.chugunoff.Engine.Zones.ScriptZone;
import com.chugunoff.Engine.Zones.TPZone;
import com.chugunoff.Engine.Zones.Wall;
import com.chugunoff.InfoClasses.Scripts;
import com.chugunoff.Engine.Utils.Dialog;
import com.chugunoff.Engine.Graphics.Dialog.*;
import com.chugunoff.Windows.Rooms.StartRoom;
import com.chugunoff.res.LoadResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.chugunoff.InfoClasses.Config.dir;

public class FC_ONE implements Runnable {
    //FOR TESTS
    /*xd
    1055x200
     */

    JFrame frame;
    static Point c;
    JPanel panel;
    JLabel Back;
    JLabel Background;
    JLabel location;
    JLabel BackLocation;
    JPanel playerBack;
    int ACLeft = 0;
    int ACRight = 0;
    int ACUp = 0;
    int ACDown = 0;
    static int x = 0;
    volatile boolean f = false;
    String deltaDirect = "Right";

    PanelDialog test,test2;


    static Object player;
    Wall testWall,testWall2,testWall3, testWall4;
    TPZone startRoom,FC_TWO,Bar;
    ScriptZone Easter1;

    @Override
    public void run() {
        Player.x = 75;
        Player.y = 300;
        initFrame();
    }

    void debugMode(){

        test = new PanelDialog(frame,panel,LoadResource.PlayerDown[0],Player.y,  new String[]{
                "А вы знали, что главный программист игры",
                "ОЧЕНЬ сильно любит печеньку?"
                ,"Знали, а?"},new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ВТОРОЙ ДИАЛОГ В FC_ONE!");
            }
        }), LoadResource.font.getFont(22.5f));
        test.init();

        testWall4.setBackground(Color.WHITE);
        panel.add(testWall4);
        testWall2.setBackground(Color.WHITE);
        testWall.setBackground(Color.WHITE);
        startRoom.createVisible(panel);
        FC_TWO.createVisible(panel);
        Bar.createVisible(panel);
        Easter1.createVisible(panel);
        panel.add(testWall);
        panel.add(testWall2);
        panel.add(Back);
        panel.add(playerBack);
        panel.add(BackLocation);
        panel.add(location);
        testWall3.createVisible(panel);
    }


    void initFrame(){
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(-1800, 0, Config.WIN_WIDTH, 2000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        drawFrame(Config.DEBUG);
        initListeners();
        panel.add(Background);


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack( );
        frame.setSize(Config.WIN_WIDTH, Config.WIN_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }

    private void drawFrame(boolean debug) {



        //obj_location
        location = new JLabel("X:" + Player.x + "\n \n Y:" + Player.y);
        location.setBounds(50,25,300,125);
        location.setForeground(new Color(222, 220, 220));

        //walls
        testWall = new Wall(500,0,50,280);
        testWall2 = new Wall(500,230,2180,50);
        testWall4 = new Wall(500,0,50,280);
        testWall3 = new Wall(2135,200,1000,45);

        //tp_zones
        startRoom = new TPZone(0,280,46,300);
        startRoom.setTPLocation(500,300);

        FC_TWO = new TPZone(2954-x,550,46,250);
        FC_TWO.setTPLocation(0,0);

        Bar = new TPZone(2705 - x,134,150,46);
        Bar.setTPLocation(380,450);

        //scripted_zones
        Easter1 = new ScriptZone(0,0,5,800,false);
        Easter1.setScript(Scripts.E1);

        //obj_locationBack
        BackLocation = new JLabel("Background X:" + x);
        BackLocation.setBounds(50,40,300,125);
        BackLocation.setForeground(new Color(222, 220, 220));

        //btn_back
        Back = new JLabel("BACK");
        Back.setBounds(0,0,100,50);
        Back.setForeground(Color.RED);


        //obj_player
        player = new Object(Player.x, Player.y, LoadResource.PlayerRight[8],panel);

        playerBack = new JPanel();
        playerBack.setBackground(Color.DARK_GRAY);
        playerBack.setBounds(player.getBounds());

        c= player.getLocation();
        if(debug)
            debugMode();

        //bkg_fon
        Background = new JLabel(LoadResource.Transition);
        Background.setBounds(-x, 0,3000,800);
        panel.add(Background);

        player.setLocation(c);

    }

    private void after(){
        Background.setLocation(-x, 0);
        startRoom.checkTPZone(player,new StartRoom(),frame);
        startRoom.setLocation(-x,280);
        FC_TWO.checkTPZone(player,new FC_TWO(),frame);
        FC_TWO.setLocation(2954-x,550);
        Bar.checkTPZone(player, new Bar(), frame);
        Bar.setLocation(2705 - x, 134);
        Easter1.checkScriptZone(player);
        testWall3.setLocation(2850 - x,200);
        testWall2.setLocation(500-x,230);
        Easter1.setLocation(-x,0);
        BackLocation.setText("Background X: " + x);
        playerBack.setLocation(player.getX(), player.getY());
        location.setText("X:" + player.getX() + "\n \n Y:" + player.getY());
    }

    private void initListeners() {

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == 'w'){
                    if(testWall3.checkCollision(player)&&testWall2.checkCollision(player)|| player.getX() == 1050 && x == 1660 || player.getX()<909 && player.getX() > 951 && x > 1599) {
                        if (Player.y > 0) {
                            Player.move("Up");
                            deltaDirect = "Up";

                            try {
                                Thread.sleep(Config.SLEEPMS);
                            } catch (InterruptedException ex) {
                                new Dialog("The error has occuped! \n " + ex.toString());
                            }


                        if (ACUp > 6) {
                            ACUp = 0;
                        }

                        player.setIcon(LoadResource.PlayerUp[ACUp]);
                        // player.setLocation(Config.player.x, Config.player.y);
                        ACUp++;

                            player.setLocation(Player.x, Player.y);
                        }
                    }
                }
                if(e.getKeyChar() == 'a') {
                    deltaDirect = "Left";
                    if (Player.x > 0) {
                        if (testWall2.checkCollision(new JLabel())) {//
                            if (testWall.checkCollision(player)) {
                                if (x <= 1800 && x > 0) {
                                    x -= 20;
                                } else {
                                    Player.move("Left");
                                    player.setLocation(Player.x, Player.y);
                                }
                                // Config.player.move("Left");
                                //w player.setLocation(Config.player.x, Config.player.y);

                                try {
                                    Thread.sleep(Config.SLEEPMS);
                                } catch (InterruptedException ex) {
                                    new Dialog("The error has occuped! \n " + ex.toString());
                                }


                                if (ACLeft > 7) {
                                    ACLeft = 0;
                                }

                                player.setIcon(LoadResource.PlayerLeft[ACLeft]);
                                // player.setLocation(Config.player.x, Config.player.y);
                                ACLeft++;
                            }
                        }
                    }
                }
                if(e.getKeyChar() == 's'){
                    deltaDirect = "Down";
                        if(player.getY() <= 365) {

                                Player.move("Down");

                            try {
                                Thread.sleep(Config.SLEEPMS);
                            } catch (InterruptedException ex) {
                                new Dialog("The error has occuped! \n " + ex.toString());
                            }


                            if (ACDown > 6) {
                                ACDown= 0;
                            }

                            player.setIcon(LoadResource.PlayerDown[ACDown]);
                            // player.setLocation(Config.player.x, Config.player.y);
                            ACDown++;


                                player.setLocation(Player.x, Player.y);


                        }
                }
                if(e.getKeyChar() == 'd') {
                    deltaDirect = "Right";
                    if (Player.x < 1100) {
                        if (testWall2.checkCollision(player))
                            if (testWall3.checkCollision(player)) {
                                if (testWall4.checkCollision(player)) {
                                    if (x < 1800) {
                                        x += 20;
                                    } else {
                                        Player.move("Right");
                                        player.setLocation(Player.x, Player.y);
                                    }
                                    //Player.move("Right");
                                    //player.setLocation(Config.player.x, Config.player.y);

                                    try {
                                        Thread.sleep(35L);
                                    } catch (InterruptedException ex) {
                                        new Dialog("The error has occuped! \n " + ex.toString());
                                    }


                                    if (ACRight > 7) {
                                        ACRight = 0;
                                    }

                                    player.setIcon(LoadResource.PlayerRight[ACRight]);
                                    ACRight++;
                                }

                            }
                    }
                }

                after();


            }

            @Override
            public void keyReleased(KeyEvent e) {
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
