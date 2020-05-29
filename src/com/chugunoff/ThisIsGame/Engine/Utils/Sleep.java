package com.chugunoff.ThisIsGame.Engine.Utils;

import com.chugunoff.ThisIsGame.InfoClasses.Config;

public class Sleep {
    public Sleep(long s){
        try {
            Thread.sleep(s);
        } catch (InterruptedException ex) {
            new Dialog("The error has occuped! \n " + ex.toString());
        }
    }
}
