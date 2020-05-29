package com.chugunoff.ThisIsGame.Engine.Utils;

public class Wait {
    public Wait(int SLEEPMS){

        while(SLEEPMS <= 0)
            SLEEPMS++;
    }
}
