package com.chugunoff.Engine.MIDI;

import com.chugunoff.Engine.MIDI.Note;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class MIDI {

    public static Octave octave = new Octave();
    public static Synthesizer synth;
    public static MidiChannel[] channels;
    public static Notes nts;

    static {
        try {
            nts = new Notes();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public MIDI() throws MidiUnavailableException {
        synth = MidiSystem.getSynthesizer();
        synth.open();
        channels = synth.getChannels();
    }

    public void recordNote(int Channel,int MIDINumber, int Volume, int Sleep) throws InterruptedException {
        if(Channel > 16 && MIDINumber > 127 && Volume > 127){
            new Dialog("Out of range.");
        }else{
            channels[Channel].noteOn(MIDINumber, Volume);
            Thread.sleep(Sleep);
        }
    }

    public void note(Note note) throws InterruptedException {
        channels[note.Channel].noteOn(note.MIDINumber,note.Volume);
        Thread.sleep(note.Sleep);
    }

    public void unNote(int MIDINumber, int Channel){
        channels[Channel].noteOff(MIDINumber);
    }

    public void close(){
        synth.close();
    }

    public void Change(int Channel, int Tool){
        channels[Channel].programChange(Tool);
    }

    public void recordSound(int channel, int sleep, int volume, int[] notes) throws InterruptedException {
        for (int note : notes) {
            channels[channel].noteOn(note, volume);
            Thread.sleep(sleep);
        }

    }
    public void recordNotSimpleSound(int channel, int sleep, int volume, int[][] notes) throws InterruptedException {
        for (int note[] : notes) {
            for (int nt : note) {
                channels[channel].noteOn(nt, volume);
                Thread.sleep(sleep);
            }
        }
    }
    public void playSound(Note[] notes) throws InterruptedException {
        for (Note note : notes) {
            channels[note.Channel].noteOn(note.MIDINumber, note.Volume);
            Thread.sleep(note.Sleep);
        }
    }

    public void playNotSimpleSound(Note[][] notess) throws InterruptedException {
        for (Note[] notes: notess){
            for(Note note:notes){
                channels[note.Channel].noteOn(note.MIDINumber, note.Volume);
                Thread.sleep(note.Sleep);
            }
        }
    }

    public void testAll() throws InterruptedException, MidiUnavailableException {
        for(Note note : nts.subcontroctava ) {note.testNote();}
        for(Note note : nts.controctava ) {note.testNote();}
        for(Note note : nts.big ) {note.testNote();}
        for(Note note : nts.small ) {note.testNote();}
        for(Note note : nts.first ) {note.testNote();}
        for(Note note : nts.second ) {note.testNote();}
        for(Note note : nts.third ) {note.testNote();}
        for(Note note : nts.fourth ) {note.testNote();}
        for(Note note : nts.fifth ) {note.testNote();}
    }


}
