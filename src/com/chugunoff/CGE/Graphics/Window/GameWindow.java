package com.chugunoff.CGE.Graphics.Window;

import com.chugunoff.CGE.Control.Player;
import com.chugunoff.CGE.Game.Config;
import com.chugunoff.CGE.Utils.Dialog;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_TWO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.annotation.ElementType;

public class GameWindow {

    Room currentRoom = new Room();

    public GameWindow(){

    }

    public void show(Room room){
        currentRoom.совершитьРоскомнадзор(this);
        currentRoom = room;
        currentRoom.initFrame(this);
    }

}
