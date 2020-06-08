package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.GEngine.Annotations.GameRoom;
import com.chugunoff.GEngine.Control.Camera;
import com.chugunoff.GEngine.Control.Player;
import com.chugunoff.GEngine.Game.Config;
import com.chugunoff.GEngine.Graphics.Object;
import com.chugunoff.GEngine.Utils.Sleep;
import com.chugunoff.GEngine.Zones.Wall;
import com.chugunoff.res.LoadResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.chugunoff.GEngine.Game.Config.dir;

public class OverlordShop implements Runnable{

    JFrame frame;
    JPanel panel;
    JLabel player;
    JLabel background;

    int winH = 800;
    int winW = 1200;
    int ACLeft = 0;
    int ACRight = 0;
    int ACUp = 0;
    int ACDown = 0;

    ImageIcon BGImage = new ImageIcon("/home/pc/Dev/Java/ThisIsGame/Data/Memories_DLC/TestDraw/ShopDraw.png");
    String direction;
    Camera camera;
    Wall wLeft, wRight, wUp, wDown;

    @Override
    public void run() {
        initFrame();
    }

    void debugMode(boolean d){
        if(d){
            wLeft.createVisible(panel);
            wRight.createVisible(panel);
            wUp.createVisible(panel);
            wDown.createVisible(panel);
        }
    }

    @GameRoom
    void initFrame(){
        JFrame.setDefaultLookAndFeelDecorated(false);

        panel = new JPanel();
        panel.setBounds(-1800, 0, 200000, 200000);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        frame = new JFrame();
        drawFrame();
        initListeners();
        panel.add(background);


        frame.setContentPane(panel);
        frame.setUndecorated(Config.isNOTDecorated);
        frame.pack( );
        frame.setSize(winW, winH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game|" + Player.Name + "|");
    }

    void drawFrame(){
        player = new Object(Player.x, Player.y, LoadResource.PlayerDown[0],panel);

        wLeft = new Wall(0,0,1,winH);
        wRight = new Wall(winW - 1,0,1,winH);
        wUp = new Wall(0,0,winW,1);
        wDown = new Wall(0,738,winW,1);

        debugMode(Config.DEBUG);

        background = new JLabel(BGImage);

    }

    void initListeners(){
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_W){direction = "Up";
                    if(wUp.checkCollision(player)){
                        Player.move(direction);
                        new Sleep(Config.SLEEPMS);
                        if (ACUp > 6)
                            ACUp = 0;
                        player.setIcon(LoadResource.PlayerUp[ACUp]);
                        ACUp++;
                        player.setLocation(Player.x, Player.y);
                    }else{
                        camera.move(direction);
                        background.setLocation(camera.x,camera.y);
                    }
                }

                if(e.getKeyCode() == KeyEvent.VK_A){direction = "Left";
                    if(wLeft.checkCollision(player)){
                        Player.move(direction);
                        new Sleep(Config.SLEEPMS);
                        if (ACLeft > 7) {
                            ACLeft = 0;
                        }
                        player.setIcon(LoadResource.PlayerLeft[ACLeft]);
                        player.setLocation(Config.player.x, Config.player.y);
                        ACLeft++;
                    }else{
                        camera.move(direction);
                        background.setLocation(camera.x,camera.y);
                    }
                }

                if(e.getKeyCode() == KeyEvent.VK_S){direction = "Down";
                    if(wDown.checkCollision(player)){
                        Player.move(direction);
                        new Sleep(Config.SLEEPMS);
                        if (ACDown > 6) {
                            ACDown = 0;
                        }
                        player.setIcon(LoadResource.PlayerDown[ACDown]);
                        player.setLocation(Config.player.x, Config.player.y);
                        ACDown++;
                    }else{
                        camera.move(direction);
                        background.setLocation(camera.x,camera.y);
                    }
                }

                if(e.getKeyCode() == KeyEvent.VK_D){direction = "Right";
                    if(wRight.checkCollision(player)){
                        Player.move(direction);
                        new Sleep(Config.SLEEPMS);
                        if (ACRight > 7) {
                            ACRight = 0;
                        }
                        player.setIcon(LoadResource.PlayerRight[ACRight]);
                        player.setLocation(Config.player.x, Config.player.y);
                        ACRight++;
                    }else{
                        camera.move(direction);
                        background.setLocation(camera.x,camera.y);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(direction == "Right"){
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerStep.png"));
                } else if (direction == "Left") {
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerStep.png"));
                } else if (direction == "Up") {
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerStep.png"));
                } else if (direction == "Down") {
                    player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerStep.png"));
                }
            }

        });
    }

}
