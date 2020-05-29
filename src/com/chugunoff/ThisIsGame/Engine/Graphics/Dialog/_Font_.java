package com.chugunoff.ThisIsGame.Engine.Graphics.Dialog;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class _Font_ {
    public GraphicsEnvironment font;
    public String filename;

    public _Font_(String filename){
        this.filename = filename;
    }

    public Font getFont(float size){
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(filename)).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(filename)));
            return customFont;
        } catch (IOException e) {
            e.printStackTrace();
        } catch(FontFormatException e) {
            e.printStackTrace();
        }
       return null;
    }

}
