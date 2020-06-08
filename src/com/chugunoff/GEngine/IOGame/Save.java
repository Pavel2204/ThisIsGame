package com.chugunoff.GEngine.IOGame;

import com.chugunoff.GEngine.Game.Config;
import com.chugunoff.GEngine.Utils.Dialog;

import java.io.FileWriter;
import java.io.IOException;

public class Save {

    public Save(Object[] SaveData, String FileName) throws IOException {
        try(FileWriter save = new FileWriter(FileName, false))
        {
            for (Object item : SaveData){
                save.write(item.toString() + "\n");
            }
        }
        catch(IOException ex){

            new Dialog("Error for creating save file. Path to file: "+ FileName + "[" + ex.getCause() + "]");
        }

        Config.player.inventory.IO.Save();

    }

}