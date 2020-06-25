package com.chugunoff.CGE.Graphics.Animation;

import javax.swing.*;

public class NPC extends JLabel{
    public ImageIcon[] icons;
    Animation anim;
    String Name;

    public NPC(ImageIcon[] icons, String Name){
        this.icons = icons;
        this.Name = Name;
        this.setSize(icons[0].getIconWidth(), icons[0].getIconHeight());
        this.setIcon(icons[0]);
    }

    public void anim(){
        anim.animate();
    }

    public void show(JPanel panel){
        panel.add(this);
    }



}
