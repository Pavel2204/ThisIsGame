package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.CGE.Control.Camera;
import com.chugunoff.CGE.Graphics.Animation.Animation;
import com.chugunoff.CGE.Graphics.Animation.Object;
import com.chugunoff.CGE.Graphics.Dialog.PanelDialog;
import com.chugunoff.CGE.Graphics.Window.GameWindow;
import com.chugunoff.CGE.Graphics.Window.Room;
import com.chugunoff.CGE.Zones.TPZone;
import com.chugunoff.CGE.Game.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class FC_TWO extends Room {

    TPZone OverShop;
    JLabel location,PanelDialog1,PanelDialog2;
    PanelDialog pd1,pd2;

    @Override
    public void debug() {
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void initFrame(GameWindow win) {
        super.init(new Camera(), Config.resources.Crossroads);
        super.initFrame(win);
    }

    Animation d =  new Animation(Config.resources.BarmanSmoke,new Object(0,0,Config.resources.BarmanSmoke[0]),Config.resources.BarmanSmoke.length - 1,100l,true);


    @Override
    public void drawOnPlayer() {
       Animation hui =  new Animation(Config.resources.BarmanBeer,new Object(0,0,Config.resources.BarmanBeer[0]),Config.resources.BarmanBeer.length - 1,100l,new Thread(new Runnable() {
            @Override
            public void run() {
                 d.animate();
            }
        }));

       hui.animate();

        location = new JLabel("X: " + Config.player.x + " Y: " + Config.player.x);
        location.setBounds(50,50,150,75);
        location.setForeground(Color.WHITE);
        add(location);
    }

    @Override
    public void drawFrame() {
        super.drawFrame();
        OverShop = new TPZone(390,1020,300,10);
        OverShop.setTPLocation(getCamera().x, getCamera().y + 300);
        if(Config.DEBUG)
            OverShop.createVisible(getPanel());
        PanelDialog1 = new JLabel();
        PanelDialog2 = new JLabel();
        Config.panel.add(PanelDialog1);
        Config.panel.add(PanelDialog2);

        pd1 = new PanelDialog(PanelDialog1,Config.resources.PlayerDown[1],getPlayer().getY(),new String[]{
                "А вы знали,",
                "Что главный программист игры",
                "ОЧЕНЬ сильно хочет укусить Владиславу?"
        },new Thread(new Runnable(){
            @Override
            public void run() {
                pd2 = new PanelDialog(PanelDialog2,Config.resources.PlayerDown[3],getPlayer().getY(),new String[]{
                    "Знали, а?",
                    "",
                    ""
            },new Thread(new Runnable(){
                @Override
                public void run() {
                    System.out.println("Второй диалог в FC_TWO");
                }
            }),175,Config.resources.font.getFont(53.5f));

                pd2.init();
            }
        }),Config.resources.font.getFont(25f));
    }

    @Override
    public void initListeners() {
        super.initListeners();
    }

    @Override
    public void keyListenner(KeyEvent e) {
        if(e.getKeyChar() == ',' && false)
            pd1.init();
    }

    @Override
    public void after() {
        location.setText("X: " + getPlayer().getX() + " Y: " + getPlayer().getY());
        OverShop.checkTPZone(getPlayer(),new OverlordShop(),getFrame());
        OverShop.setLocation(390+ getCamera().x,795 + getCamera().y);
    }

    @Override
    public void checkDirections() {

    }


}