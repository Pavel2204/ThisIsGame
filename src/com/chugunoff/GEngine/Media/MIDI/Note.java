package com.chugunoff.GEngine.Media.MIDI;

import javax.sound.midi.MidiUnavailableException;

public class Note {
    int MIDINumber;
    int Volume;
    int Channel;
    int Sleep;
    public Note(int MIDINumber){
        this.MIDINumber = MIDINumber;
        Volume = 177;
        Channel = 0;
        Sleep = 750;
    }

    public Note(int MIDINumber, int volume, int channel, int sleep) {
        this.MIDINumber = MIDINumber;
        Volume = volume;
        Channel = channel;
        Sleep = sleep;
    }

    public void testNote() throws MidiUnavailableException, InterruptedException {
        new MIDI().recordNote(0,MIDINumber,177,1000);
    }
}
