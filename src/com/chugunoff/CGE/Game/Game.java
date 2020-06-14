package com.chugunoff.CGE.Game;

import com.chugunoff.CGE.Graphics.Window.GameWindow;
import com.chugunoff.CGE.Graphics.Window.Room;
import com.chugunoff.CGE.Utils.Dialog;
import com.chugunoff.Windows.Rooms.*;
import com.chugunoff.Windows.Rooms.FirstCircle.Bar;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_ONE;
import com.chugunoff.Windows.Rooms.FirstCircle.FC_TWO;
import com.chugunoff.Windows.Rooms.FirstCircle.OverlordShop;

public class Game {

    Config config;
    public static GameWindow gameWindow;

    public static int level;

    public Game(){
        gameWindow = new GameWindow();
        System.out.println("Этот проект был создан с использованием движка Chugunoff Game Engine"+
                "\n Официальный сайт движка - ThisIsGame.chugunoff.ru/CGE");
    }


    public static void startGame(int level){
        if(level == 0){
                newGame();
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

    private static void load(Room d){
        gameWindow.show(d);
    }

    private static void newGame(){
        javax.swing.SwingUtilities.invokeLater(new StartRoom());
    }

    public void пойтиНахуй(){
        System.exit(228);
    }
}

