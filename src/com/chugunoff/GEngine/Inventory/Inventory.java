package com.chugunoff.GEngine.Inventory;

import com.chugunoff.GEngine.Game.Config;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static List<Item> items;
  public static IOInventory IO;

    public Inventory(int max_size){

        items = new ArrayList<Item>();
        IO = new IOInventory(Config.dir + "/Data/Inventory.save", items);

        items.add(new Item(4, "Ключ воспоминаний."));//new Item(1 ,"СУКА БЛЯТЬ"));

    }

}
