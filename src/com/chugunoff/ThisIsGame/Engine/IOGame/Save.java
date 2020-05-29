package com.chugunoff.ThisIsGame.Engine.IOGame;

import com.chugunoff.ThisIsGame.InfoClasses.Config;
import com.chugunoff.ThisIsGame.Engine.Utils.Dialog;

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