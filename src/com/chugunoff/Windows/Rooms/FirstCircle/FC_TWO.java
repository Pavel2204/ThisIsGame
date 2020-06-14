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

    @Override
    public void debugMode(boolean d, JPanel panel) {
        super.debugMode(d, panel);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void initFrame(JPanel panel, GameWindow win) {
        super.init(new Camera(), Config.resources.Crossroads);
        super.initFrame(panel, win);
    }

    @Override
    public void drawOnPlayer() {
    }

    @Override
    public void drawFrame(JPanel panel) {

        super.drawFrame(panel);
    }

    @Override
    public void initListeners(JPanel panel) {
        super.initListeners(panel);

    }

    @Override
    public void keyListenner(KeyEvent e) {
        if(e.getKeyChar() == 'c'){
            getWin().show(new OverlordShop());
        }
    }

    @Override
    public void after() {
    }

    @Override
    public void checkDirections() {

    }


}