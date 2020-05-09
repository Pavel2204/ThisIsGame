package com.chugunoff.Engine.Graphics.Dialog;

import com.chugunoff.InfoClasses.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static javax.swing.JLayeredPane.DRAG_LAYER;

public class PanelDialog extends JLabel {
    public JLabel l1,l2,l3,face,background;
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    boolean i = true;
    String[] texts;
    volatile long sleep, y;
    public volatile long allTime;//
    Font font;
    GraphicsDictor dicktor = new GraphicsDictor();
    public Thread main,nextDialog;

     public PanelDialog(JFrame frame, JPanel panel, ImageIcon icon, int y, String[] texts, Thread nextDialog , Font font) {
        setIcon(Config.resources.Dialog);
        this.nextDialog = nextDialog;
        this.frame = frame;
        this. panel = panel;
        this.y = y;
        this.icon = icon;
        this.texts = texts;
        this.font = font;
        sleep = 50;
        allTime = (texts[0].length() + texts[1].length() + texts[2].length()) * sleep;
        setCloseListener();
    }
    synchronized public void init(){
       main =   new Thread(new Runnable(){@Override public void run(){draw();}});
       main.setDaemon(true);
       main.start();
     }

    synchronized void animText(String[] texts, JLabel[] lbls, int sleep, Font font) {
        for(int i = 0; i < 3; i++){
            lbls[i].setForeground(Color.WHITE);
            dicktor.speak(texts[i], lbls[i],sleep, font);
            sleep(texts[i].length() * sleep);
        }
    }

    synchronized   void draw() {
        if (y < 400) {
            setBounds(50, 700 - Config.resources.Dialog.getIconHeight(), 1100, Config.resources.Dialog.getIconHeight());
        } else {
            setBounds(50, 50, 1100, Config.resources.Dialog.getIconHeight());
        }
        panel.add(this,DRAG_LAYER);
        //l1
        l1 = new JLabel();
        l1.setBounds(25, 25, 925, 50);
        add(l1);
        //l2
        l2 = new JLabel();
        l2.setBounds(25, 80, 925, 50);
        add(l2);
        //l3
        l3 = new JLabel();
        l3.setBounds(25, 135, 925, 50);
        add(l3);
        //face
        face = new JLabel(icon);
        face.setBounds(737, 15, 247, 169);
        add(face);

        animText(texts, new JLabel[]{l1, l2, l3}, Math.toIntExact(sleep), font);

     }

    synchronized void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void setCloseListener(){

         frame.addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) {
                 if (i == true) {
                     if (e.getKeyChar() == 'x') {
                         // main.interrupt();

                         nextDialog.start();
                         i = false;


                         setVisible(i);

                     }
                 }
             }
         });
    }

}
