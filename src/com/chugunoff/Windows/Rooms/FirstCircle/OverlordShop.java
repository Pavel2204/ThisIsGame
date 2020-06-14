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

public class OverlordShop extends Room {

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
        super.init(new Camera(), Config.resources.Sixy);
        super.initFrame(panel, win);
    }

    @Override
    public void drawFrame(JPanel panel) {
        super.drawFrame(panel);

    }

    @Override
    public void checkDirections() {

    }

    @Override
    public void drawOnPlayer() {

    }
}