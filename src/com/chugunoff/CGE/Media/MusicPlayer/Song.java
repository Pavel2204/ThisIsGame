package com.chugunoff.CGE.Media.MusicPlayer;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Song {
FileInputStream path;
Player player;

    public Song(String filename){
        try {
            path = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            player = new Player(path);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public void play(){
        try {
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public void stop(){
        player.close();
    }
}
