package com.chugunoff.CGE.Graphics.Window;

import com.chugunoff.CGE.Control.Camera;
import com.chugunoff.CGE.Control.Player;
import com.chugunoff.CGE.Graphics.Animation.Object;
import com.chugunoff.CGE.Utils.Sleep;
import com.chugunoff.CGE.Zones.Wall;
import com.chugunoff.CGE.Game.Config;
import com.chugunoff.res.LoadResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.chugunoff.CGE.Game.Config.dir;


public class Room implements Runnable {

    GameWindow win;

    JLabel player;
    JLabel background;

    int winH = 800;
    int winW = 1200;
    int ACLeft = 0;
    int ACRight = 0;
    int ACUp = 0;
    int ACDown = 0;

    boolean right=true,left=true,up=true,down=true;

    ImageIcon BGImage = null;
    String direction;
    Camera camera = new Camera();
    Wall wLeft, wRight, wUp, wDown,playerBack;

    @Override
    public void run() {

    }

   public  void debugMode(boolean d) {
        if (d) {
            wLeft.createVisible(Config.panel);
            wRight.createVisible(Config.panel);
            wUp.createVisible(Config.panel);
            wDown.createVisible(Config.panel);
            playerBack.createVisible(Config.panel);
            debug();
        }
    }

    @com.chugunoff.CGE.Annotations.GameRoom
    public void initFrame(GameWindow win) {

        this.win = win;
        Config.panel = new JPanel();
        Config.panel.setBounds(0, 0, 20000000, 20000000);
        Config.panel.setBackground(Color.BLACK);
        Config.panel.setLayout(null);

        drawFrame();
        initListeners();
        Config.panel.add(background);

           // Config.frame= new JFrame();
        Config.frame.setContentPane(Config.panel);
        Config.frame.setUndecorated(Config.isNOTDecorated);
        Config.frame.pack();
        Config.frame.setSize(1200, 800);
        Config.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Config.frame.setLocationRelativeTo(null);
        Config.frame.setVisible(true);
        Config.frame.setTitle("Game|" + Player.Name + "|");
        Config.i = false;//wtf?

    }//НАЖМИ CTRL+SHIFT+K ТАМ РЕШЕНИЕ

    public void drawFrame() {
        drawOnPlayer();

        player = new Object(Player.x, Player.y, LoadResource.PlayerDown[0]);

        wLeft = new Wall(0, 0, 1, winH);
        wRight = new Wall(winW - 1 , 0, 1, winH);
        wUp = new Wall(0, 0, winW, 1);
        wDown = new Wall(0, winH - 1 , winW, 1);
        playerBack = new Wall(0,0,0,0);
        if (playerBack.checkCollision(player)){
            player.setLocation(500,225);
            Config.player.x = 500;
            Config.player.y = 125;
        }

        debugMode(Config.DEBUG);

        background = new JLabel(BGImage);
        background.setBounds(Camera.x,Camera.y,BGImage.getIconWidth(), BGImage.getIconHeight());
    }

   public void initListeners() {
        checkDirections();
        Config.frame.addKeyListener(key);
    }
    public KeyAdapter key = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W&&up) {
                direction = "Up";
                if (wUp.checkCollision(player)) {
                    Player.move(direction);
                    new Sleep(Config.SLEEPMS);
                    if (ACUp > 6)
                        ACUp = 0;

                    camera.move(direction);
                    background.setLocation(camera.x, camera.y);
                    player.setIcon(LoadResource.PlayerUp[ACUp]);
                    ACUp++;
                } else {
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_A&&left) {
                direction = "Left";
                if (wLeft.checkCollision(player)) {
                    Player.move(direction);
                    new Sleep(Config.SLEEPMS);
                    if (ACLeft > 7)
                        ACLeft = 0;

                    camera.move(direction);
                    background.setLocation(camera.x, camera.y);
                    player.setIcon(LoadResource.PlayerLeft[ACLeft]);
                    ACLeft++;
                } else {
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_S&&down) {
                direction = "Down";
                if (wDown.checkCollision(player)) {
                    Player.move(direction);
                    new Sleep(Config.SLEEPMS);
                    if (ACDown > 6) {
                        ACDown = 0;
                    }
                    camera.move(direction);
                    background.setLocation(camera.x, camera.y);
                    player.setIcon(LoadResource.PlayerDown[ACDown]);
                    ACDown++;
                } else {
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_D&&right) {
                direction = "Right";
                if (wRight.checkCollision(player)) {
                    Player.move(direction);
                    new Sleep(Config.SLEEPMS);
                    if (ACRight > 7) {
                        ACRight = 0;
                    }
                    camera.move(direction);
                    background.setLocation(camera.x, camera.y);
                    player.setIcon(LoadResource.PlayerRight[ACRight]);
                    ACRight++;
                } else {
                }
            }
            keyListenner(e);
            after();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (direction == "Right") {
                player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerStep.png"));
            } else if (direction == "Left") {
                player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerStep.png"));
            } else if (direction == "Up") {
                player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerStep.png"));
            } else if (direction == "Down") {
                player.setIcon(new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerStep.png"));
            }
        }

    };

    public void keyListenner(KeyEvent e){

    }

    public void after(){

    }

    public void checkDirections(){

    }

    public void drawOnPlayer(){

    }

    public JFrame getFrame() {
        return Config.frame;
    }

    public void setFrame(JFrame frame) {
        Config.frame = frame;
    }

    public JPanel getPanel() {
        return Config.panel;
    }

    public void setPanel(JPanel panel) {
        Config.panel = panel;
    }

    public JLabel getPlayer() {
        return player;
    }

    public void setPlayer(JLabel player) {
        this.player = player;
    }

    public JLabel getBackground() {
        return background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }

    public int getWinH() {
        return winH;
    }

    public GameWindow getWin() {
        return win;
    }

    public void setWin(GameWindow win) {
        this.win = win;
    }

    public void setWinH(int winH) {
        this.winH = winH;
    }

    public int getWinW() {
        return winW;
    }

    public void setWinW(int winW) {
        this.winW = winW;
    }

    public int getACLeft() {
        return ACLeft;
    }

    public void add(Component chcomp){
        Config.panel.add(chcomp);
    }

    public void setACLeft(int ACLeft) {
        this.ACLeft = ACLeft;
    }

    public int getACRight() {
        return ACRight;
    }

    public void setACRight(int ACRight) {
        this.ACRight = ACRight;
    }

    public void debug(){}

    public int getACUp() {
        return ACUp;
    }

    public void setACUp(int ACUp) {
        this.ACUp = ACUp;
    }

    public int getACDown() {
        return ACDown;
    }

    public void setACDown(int ACDown) {
        this.ACDown = ACDown;
    }

    public ImageIcon getBGImage() {
        return BGImage;
    }

    public void setBGImage(ImageIcon BGImage) {
        this.BGImage = BGImage;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Wall getwLeft() {
        return wLeft;
    }

    public void setwLeft(Wall wLeft) {
        this.wLeft = wLeft;
    }

    public Wall getwRight() {
        return wRight;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setwRight(Wall wRight) {
        this.wRight = wRight;
    }

    public Wall getwUp() {
        return wUp;
    }

    public void setwUp(Wall wUp) {
        this.wUp = wUp;
    }

    public Wall getwDown() {
        return wDown;
    }

    public void setwDown(Wall wDown) {
        this.wDown = wDown;
    }

    public void совершитьРоскомнадзор(GameWindow win){
        removeself(win);
    }

    public void removeself(GameWindow win){
        //Config.frame.dispose();
        Config.i = true;
        Config.panel = new JPanel();
        removeobjects();
    }

    public void init(Camera a, ImageIcon b){
        camera = a;
        BGImage = b;
    }

    public void removeobjects(){
        Config.panel.removeAll();
        Config.frame.removeKeyListener(key);
    }

}
