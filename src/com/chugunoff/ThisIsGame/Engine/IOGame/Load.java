package com.chugunoff.ThisIsGame.Engine.IOGame;

import com.chugunoff.ThisIsGame.InfoClasses.Config;
import com.chugunoff.ThisIsGame.Game;

import java.io.*;
import java.util.ArrayList;

public class Load {

    public Load(String FileName) throws IOException {
        String[] load = getSaveFile(FileName);
        int i = 1;

        Config.player.Name = load[0];
        Config.player.DMG = Integer.parseInt(load[1]);
        Config.player.Money = Integer.parseInt(load[2]);
        Config.player.x = Integer.parseInt(load[3]);
        Config.player.y = Integer.parseInt(load[4]);
        Config.player.Atk_ID = Integer.parseInt(load[5]);
        Config.player.Def_ID = Integer.parseInt(load[6]);
        Config.player.HP = Integer.parseInt(load[7]);
        Config.player.MP = Integer.parseInt(load[8]);
        Game.level = Integer.parseInt(load[9]);

        Config.player.inventory.IO.Load();

        Game.startGame(Game.level);

    }

    public String[] getSaveFile(String FileName) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            String str;

            ArrayList<String> list = new ArrayList<String>();
            while((str = reader.readLine()) != null ){
                if(!str.isEmpty()){
                    list.add(str);
                    System.out.println(str);
                }}
            String[] stringArr = list.toArray(new String[0]);
            return stringArr;
    }



}
