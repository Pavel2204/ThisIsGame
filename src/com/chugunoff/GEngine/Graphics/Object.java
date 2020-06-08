package com.chugunoff.GEngine.Graphics;

import javax.swing.*;

public class Object extends JLabel{
    public Object(int x, int y, ImageIcon icon,JPanel panel) {
        setIcon(icon);
        setBounds(x,y,icon.getIconWidth(), icon.getIconHeight());
        panel.add(this);
    }

}
