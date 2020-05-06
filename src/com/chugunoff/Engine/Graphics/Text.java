package com.chugunoff.Engine.Graphics;

import javax.swing.*;
import java.awt.*;

public class Text extends JLabel {
    public Text(String text, int w, int x, int y, Color clr, JPanel panel){
        setText(text);
        setForeground(clr);
        setBounds(x,y,w,25);
        panel.add(this);
    }
}
