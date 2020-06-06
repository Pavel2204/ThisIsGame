package com.chugunoff.ThisIsGame.Engine.Media.MusicPlayer;

public class Playlist {
    Thread play;
    Song[] playlist;
    Song currentSong;
    boolean stop = false;
    boolean repeat = false;
    public Playlist(Song[] songs){
        this.playlist = songs;
        currentSong = playlist[0];
    }

   synchronized public void start(){
       new Thread(new Runnable() {
           @Override
           public void run() {
               for (Song song:playlist) {
                   currentSong.play();
                   currentSong = song;
                   while(stop){

                   }
               }
           }
       }).start();
    }

    public void stop(){
        stop = true;
    }
    public void play(){
        stop = false;
    }

}
