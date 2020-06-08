package com.chugunoff.GEngine.Media.MIDI;

import javax.sound.midi.MidiUnavailableException;

public class Notes {
    static Note[] subcontroctava;
    static Note[] controctava;
    static Note[] big;
    static Note[] small;
    static Note[] first;
    static Note[] second;
    static Note[] third;
    static Note[] fourth;
    static Note[] fifth;

    static Note[] fastSubcontroctava;
    static Note[] fastControctava;
    static Note[] fastBig;
    static Note[] fastSmall;
    static Note[] fastFirst;
    static Note[] fastSecond;
    static Note[] fastThird;
    static Note[] fastFourth;
    static Note[] fastFifth;

    static {
        try {
            subcontroctava = new MIDI().octave.createOctave(12,23,750);
              controctava = new MIDI().octave.createOctave(24,35,750);
               big = new MIDI().octave.createOctave(36,47,750);
              small = new MIDI().octave.createOctave(48,59,750);
              first = new MIDI().octave.createOctave(60,71,750);
             second = new MIDI().octave.createOctave(72,83,750);
              third = new MIDI().octave.createOctave(84,95,750);
              fourth = new MIDI().octave.createOctave(96,107,750);
              fifth = new MIDI().octave.createOctave(108,118,750);

            fastSubcontroctava = new MIDI().octave.createOctave(12,23,300);
            fastControctava = new MIDI().octave.createOctave(24,35,300);
            fastBig = new MIDI().octave.createOctave(36,47,300);
            fastSmall = new MIDI().octave.createOctave(48,59,300);
            fastFirst = new MIDI().octave.createOctave(60,71,300);
            fastSecond = new MIDI().octave.createOctave(72,83,300);
            fastThird = new MIDI().octave.createOctave(84,95,300);
            fastFourth = new MIDI().octave.createOctave(96,107,300);
            fastFifth = new MIDI().octave.createOctave(108,118,300);


        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }



    public Notes() throws MidiUnavailableException {
    }
}
