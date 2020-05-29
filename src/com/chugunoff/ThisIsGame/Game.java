package com.chugunoff.ThisIsGame;

import com.chugunoff.ThisIsGame.InfoClasses.Config;
import com.chugunoff.ThisIsGame.Engine.Utils.Dialog;
import com.chugunoff.ThisIsGame.Windows.Rooms.*;
import com.chugunoff.ThisIsGame.Windows.Rooms.FirstCircle.FC_ONE;

public class Game {

    Config config;

    public static int level;

    public Game(Config config){
        this.config = config;
    }

    public static void startGame(int level){
        if(level == 0){
                StartRoom startRoom = new StartRoom();
                javax.swing.SwingUtilities.invokeLater(startRoom);
        } else if(level == 1){
            FC_ONE FCONE = new FC_ONE();
            javax.swing.SwingUtilities.invokeLater(FCONE);
        }else{
            new Dialog("Error #404: Room not found");
        }

    }
    }

