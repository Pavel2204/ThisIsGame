package com.chugunoff.CGE.Zones;

import com.chugunoff.CGE.Utils.Dialog;

import javax.swing.*;
import java.awt.*;

public class ScriptZone extends Wall {

    Runnable Script = null;
    boolean scripted = false;
    boolean runned = false;
    boolean isInvisible;

    public ScriptZone(int x, int y, int w, int h, boolean isInvisible) {
        super(x, y, w, h);
        this.isInvisible = isInvisible;
    }

    public void setScript(Runnable Script){
        this.Script = Script;
        scripted = true;
    }

    public void checkScriptZone(JLabel player){
        if(!runned) {
            if(scripted){
            if (!checkCollision(player)) {
                Script.run();
                runned = !isInvisible;
            }
        }else{
            new Dialog("Script not found.");
        }
    }
    }

    public void createVisible(JPanel panel, Color color){
        setBackground(color);
        panel.add(this);
    }

    public void createVisible(JPanel panel){
        setBackground(Color.RED);
        panel.add(this);
    }

}
