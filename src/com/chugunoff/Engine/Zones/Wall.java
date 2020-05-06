package com.chugunoff.Engine.Zones;

import javax.swing.*;
import java.awt.*;

public class Wall extends JPanel {

    public Wall(int x, int y, int w, int h){
        setBounds(x,y,w,h);
        setBackground(null);
        setLayout(null);
    }
    public void createVisible(JPanel panel, Color color){
        setBackground(color);
        panel.add(this);
    }

    public void createVisible(JPanel panel){
        setBackground(Color.WHITE);
        panel.add(this);
    }


    public boolean checkCollision(JLabel player){
        return !this.getBounds().intersects(player.getBounds());
    }

}
