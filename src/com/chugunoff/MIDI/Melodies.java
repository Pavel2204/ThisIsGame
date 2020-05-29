package com.chugunoff.MIDI;

import javax.sound.midi.MidiUnavailableException;

public class Melodies {
    static Notes n;
    public static int Test[][] = {{470, 81}, {230, 80}, {470, 81}, {250, -1}, {230, 80}, {470, 81}, {230, 69}, {230, 76}, {470, 81}, {230, 69}, {470, 74}, {470, 73}, {470, 74}, {470, 76}, {470, 73}, {470, 71}, {970, -1}, {230, 69}, {230, 68}, {470, 69}, {730, -1}, {230, 64}, {230, 69}, {230, 71}, {470, 73}, {970, -1}, {230, 73}, {230, 74}, {470, 76}, {730, -1}, {230, 69}, {230, 74}, {230, 73}, {470, 71}, {1450, -1}, {470, 81}, {230, 80}, {470, 81}, {250, -1}, {230, 80}, {470, 81}, {230, 69}, {230, 76}, {470, 81}, {230, 69}, {470, 74}, {470, 73}, {470, 74}, {470, 76}, {470, 73}, {470, 71}, {970, -1}, {230, 69}, {230, 68}, {470, 69}, {730, -1}, {230, 64}, {230, 69}, {230, 71}, {470, 73}, {970, -1}, {230, 73}, {230, 74}, {470, 76}, {730, -1}, {230, 69}, {230, 74}, {230, 73}, {470, 71}, {250, -1}};
    public static Note[][] None = {{}};

    static {
        try {
            n = new Notes();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
    static Note fastSecond0 = new Note(71,177,0,300);
    static Note fastFirst5 = new Note(65,177,0,300);
    static Note fastFirst1 = new Note(61,177,0,400);
    static Note fastSmall3 = new Note(57,177,0,1000);

    public static Melody Cat = new Melody("Bongo cat", "Pavel Chugunoff",new Note[][]{{n.first[5], fastSecond0, fastFirst5, fastSecond0,fastSecond0,n.first[5],fastFirst1,fastSecond0,fastFirst1,fastSmall3}});
    public static Melody OP = new Melody("ThisIsGame OP", "Pavel Chugunoff", new Note[][]{{n.first[5],n.second[7]},{n.small[3],n.second[7]},{new Note(65,177,0,300),n.first[5],n.second[7]},{n.small[3],n.second[7]}});
    public static Melody HZ = new Melody("Хуй Знает", "Pavel Chugunoff", new Note[][]{{n.big[0]}});

    public static Melody[] melodies = new Melody[]{OP,Cat};
    public Melodies() throws MidiUnavailableException {

    }
}
