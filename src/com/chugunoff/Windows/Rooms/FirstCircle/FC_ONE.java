package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.CGE.Graphics.Animation.Object;
import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.Control.Player;
import com.chugunoff.CGE.Graphics.Window.GameWindow;
import com.chugunoff.CGE.Graphics.Window.Room;
import com.chugunoff.CGE.Zones.ScriptZone;
import com.chugunoff.CGE.Zones.TPZone;
import com.chugunoff.CGE.Zones.Wall;
import com.chugunoff.InfoClasses.Scripts;
import com.chugunoff.CGE.Utils.Dialog;
import com.chugunoff.CGE.Graphics.Dialog.*;
import com.chugunoff.Windows.Rooms.StartRoom;
import com.chugunoff.res.LoadResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.chugunoff.CGE.Game.Config.dir;

public class FC_ONE extends Room {

    @Override
    public void debugMode(boolean d) {
        super.debugMode(d);
    }
    @Override
    public void initFrame(GameWindow win) {
        super.setBGImage(Config.resources.Transition);
        super.initFrame(win);
    }

    @Override
    public void drawFrame() {
        super.drawFrame();
    }

    @Override
    public void initListeners() {
        super.initListeners();
    }

    @Override
    public void keyListenner(KeyEvent e) {
        super.keyListenner(e);
    }

    @Override
    public void after() {
        super.after();
    }

    @Override
    public void checkDirections() {
        super.checkDirections();
    }

    @Override
    public void drawOnPlayer() {
        super.drawOnPlayer();
    }
}
