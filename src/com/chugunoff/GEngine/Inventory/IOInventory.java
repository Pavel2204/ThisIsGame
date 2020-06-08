package com.chugunoff.GEngine.Inventory;

import com.chugunoff.GEngine.Game.Config;
import com.chugunoff.InfoClasses.Items;
import com.chugunoff.GEngine.Utils.Dialog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOInventory {

    private static  String filename;
    private static ArrayList items;
    private static LoadInvenory Load;
    private static SaveInventory Save;

    public IOInventory(String filename, List<Item> items){
        this.filename = filename;
    }

    private static  class LoadInvenory{

        public LoadInvenory(String filename) throws IOException {

            String[] RawInventoryList = getSaveFile(filename);

            int i = 0;
            int ii = 0;

            while(i < RawInventoryList.length){
                while (ii < Items.itm.size()) {
                    if(Items.itm.get(ii).id == Integer.parseInt(RawInventoryList[i])) {
                        Config.player.inventory.items.add(Items.itm.get(ii));
                        System.out.println(Items.itm.get(ii).name);
                    }
                    ii++;
             }
                i++;
            }

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

    private static class SaveInventory{

        public SaveInventory(String filename)  {

            try(FileWriter save = new FileWriter(filename, false)){

                int i = 0;

//                for (Item element : Config.player.inventory.items){
  //                  save.write(element.id + "\n");
    //            }
                while (i < Config.player.inventory.items.size()){
                    save.write(Config.player.inventory.items.get(i).id + "\n");
                    i++;
                }


            }catch (IOException ex){
                new Dialog("Error for creating save file. Path to file: "+ filename + "[" + ex.getCause() + "]");
            }

        }

    }

    public static void Load() throws IOException {

        new LoadInvenory(filename);

    }

    public static void Save()  {
        new SaveInventory(filename);
    }


}
