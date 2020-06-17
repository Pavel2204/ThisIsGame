package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.CGE.Control.Camera;
import com.chugunoff.CGE.Graphics.Object;
import com.chugunoff.CGE.Graphics.Window.GameWindow;
import com.chugunoff.CGE.Graphics.Window.Room;
import com.chugunoff.CGE.Utils.Sleep;
import com.chugunoff.CGE.Zones.TPZone;
import com.chugunoff.CGE.Zones.Wall;
import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.Control.Player;
import com.chugunoff.res.LoadResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.chugunoff.CGE.Game.Config.dir;

public class FC_TWO extends Room {

    TPZone OverShop;
    JLabel location;

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

    @Override
    public void drawOnPlayer() {
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

    }

    @Override
    public void initListeners() {
        super.initListeners();

    }

    @Override
    public void keyListenner(KeyEvent e) {

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