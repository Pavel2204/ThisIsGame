package com.chugunoff.GEngine.Graphics.CutScene;

import javax.swing.*;

public class Slide {

    ImageIcon frame;
    JPanel alphaBlack,slide;
    JLabel slideFrame;

    public Slide(ImageIcon slide){
        this.frame = slide;
        this.slide = new JPanel();
        this.slide.setBounds(0,0,frame.getIconWidth(),frame.getIconHeight());
        this.slideFrame = new JLabel(frame);
        this.slideFrame.setBounds(0,0,frame.getIconWidth(), frame.getIconHeight());
        this.alphaBlack = new JPanel();
        this.alphaBlack.setBounds(0,0,1200,800);
        this.slide.add(slideFrame);
        this.slide.add(alphaBlack);
    }

    public void show(long sleep,JPanel panel,JLabel slideFrame){
        slideFrame.setBounds(this.slideFrame.getBounds());
        slideFrame.setIcon(this.slideFrame.getIcon());



    }

}
