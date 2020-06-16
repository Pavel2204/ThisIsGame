package com.chugunoff.CGE.Graphics.Window;

import com.chugunoff.CGE.Control.Player;
import com.chugunoff.CGE.Game.Config;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_TWO;

import javax.swing.*;

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
