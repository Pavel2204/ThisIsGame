package com.chugunoff.CGE.Utils;

public class Sleep {
    public Sleep(long s){
        try {
            Thread.sleep(s);
        } catch (InterruptedException ex) {
            new Dialog("The error has occuped! \n " + ex.toString());
        }
    }
}
