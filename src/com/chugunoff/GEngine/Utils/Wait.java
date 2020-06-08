package com.chugunoff.GEngine.Utils;

public class Wait {
    public Wait(int SLEEPMS){

        while(SLEEPMS <= 0)
            SLEEPMS++;
    }
}
