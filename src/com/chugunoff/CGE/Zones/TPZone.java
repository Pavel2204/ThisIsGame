package com.chugunoff.CGE.Zones;

import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.Graphics.Window.Room;

import javax.swing.*;
import java.awt.*;

public class TPZone extends Wall {

    private int x,y;

    public TPZone(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    private boolean checkColizion(JLabel player){
        return !super.checkCollision(player);
    }

    public void setTPLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void checkTPZone(JLabel player, Room Room, JFrame frame){
        if(!this.checkCollision(player)){
            Config.player.x = x;
            Config.player.y = y;
            frame.dispose();
            Config.ThisIsGame.gameWindow.show(Room);
        }
    }

    public void createVisible(JPanel panel, Color color){
        setBackground(color);
        panel.add(this);
    }

    public void createVisible(JPanel panel){
        setBackground(Config.TPZONE_COLOR);
        panel.add(this);
    }

}
