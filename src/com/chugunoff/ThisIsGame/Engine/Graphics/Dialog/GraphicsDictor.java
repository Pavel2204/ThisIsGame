package com.chugunoff.ThisIsGame.Engine.Graphics.Dialog;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;

public class GraphicsDictor {

     public void speak(String text,JLabel label, long sleep){
          new Thread(new Runnable() {
               @Override
               public void run() {
                    String txt = "";
                    char[] textChars = text.toCharArray();
                    for (char c:textChars) {
                         txt += Character.toString(c);
                        // try {
                              //new MIDI().note(new Note(40));
                         //} catch (MidiUnavailableException | InterruptedException e) {
                          //    e.printStackTrace();
                      //   }
                         try {
                              Thread.sleep(sleep);
                         } catch (InterruptedException e) {
                              e.printStackTrace();
                         }
                         label.setText(txt);
                    }
               }
          }).start();

     }

     public void speak(String text,JLabel label, long sleep, Font font){
          new Thread(new Runnable() {
               @Override
               public void run() {
                    label.setFont(font);
                    String txt = "";
                    char[] textChars = text.toCharArray();
                    for (char c:textChars) {
                              txt += Character.toString(c);
                         // try {
                         //new MIDI().note(new Note(40));
                         //} catch (MidiUnavailableException | InterruptedException e) {
                         //    e.printStackTrace();
                         //   }

                         try {
                              Thread.sleep(sleep);
                         } catch (InterruptedException e) {
                              e.printStackTrace();
                         }
                         label.setText(txt);

                    }
               }
          }).start();

     }

}
