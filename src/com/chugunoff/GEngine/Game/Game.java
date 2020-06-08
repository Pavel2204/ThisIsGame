package com.chugunoff.GEngine.Game;

import com.chugunoff.GEngine.Utils.Dialog;
import com.chugunoff.Windows.Rooms.*;
import com.chugunoff.Windows.Rooms.FirstCircle.Bar;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_ONE;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_TWO;
import com.chugunoff.Windows.Rooms.FirstCircle.OverlordShop;

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
        }else if(level == 2)
            load(new Bar());
        else if(level == 3)
            load(new FC_TWO());
        else if(level == 4)
            load(new OverlordShop());
        else{
            new Dialog("Error #404: [" +level+"] - Room not found");
        }

    }

    private static void load(Runnable d){
        javax.swing.SwingUtilities.invokeLater(d);
    }
    }

