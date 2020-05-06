package com.chugunoff.Engine.MIDI;


public class Config {

    public static Melody nowPlaying = new Melody("","", Melodies.None);
    public static int WIN_WIDTH =1000;
    public static int WIN_HEIGHT = 600;

    public static void setNowPlayingSound(){
        System.out.println("---------------------------------");
        System.out.println("Now playing - " + nowPlaying.name);
        System.out.println("Author - " + nowPlaying.author);
        System.out.println("---------------------------------");
    }

}
