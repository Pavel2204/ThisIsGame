package com.chugunoff.CGE.Media.MIDI;

public class Octave {

    public Octave(){
    }

    public Note[] createOctave(int i, int i2, int Sleep){
        Note[] notes = new Note[11];
        int i3 = 0;
        while(i3 < 11&& i < i2){
            notes[i3] = new Note(i + 5,177,0,Sleep);
            i3++;
        }
        return notes;
    }
}
