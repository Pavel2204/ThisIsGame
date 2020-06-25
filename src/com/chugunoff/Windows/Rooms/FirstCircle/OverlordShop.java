package com.chugunoff.Windows.Rooms.FirstCircle;

import com.chugunoff.CGE.Control.Camera;
import com.chugunoff.CGE.Graphics.Window.GameWindow;
import com.chugunoff.CGE.Graphics.Window.Room;
import com.chugunoff.CGE.Game.Config;

public class OverlordShop extends Room {

    @Override
    public void debug(){

    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void initFrame(GameWindow win) {
        super.init(new Camera(), Config.resources.Sixy);
        super.initFrame(win);
    }

    @Override
    public void drawFrame() {
        super.drawFrame();

    }

    @Override
    public void checkDirections() {

    }

    @Override
    public void drawOnPlayer() {

    }
}