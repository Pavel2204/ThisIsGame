package com.chugunoff.Engine.MIDI;

import javax.sound.midi.MidiUnavailableException;

public class Melody {
    Note [][] play;
    String name;
    String author;
    public Melody(String name, String author, Note[][] play){
        this.author = author;
        this.name = name;
        this.play = play;
    }

    public void play() throws MidiUnavailableException, InterruptedException {
        Config.nowPlaying = this;
        Config.setNowPlayingSound();
        new MIDI().playNotSimpleSound(this.play);
    }

}
