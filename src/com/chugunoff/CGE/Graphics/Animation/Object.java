package com.chugunoff.CGE.Graphics.Animation;

import com.chugunoff.CGE.Game.Config;

import javax.swing.*;

public class Object extends JLabel{
    public Object(int x, int y, ImageIcon icon) {
        setIcon(icon);
        setBounds(x,y,icon.getIconWidth(), icon.getIconHeight());
        Config.panel.add(this);
    }


}
