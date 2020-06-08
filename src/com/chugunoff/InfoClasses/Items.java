package com.chugunoff.InfoClasses;

import com.chugunoff.GEngine.Inventory.Item;

import java.util.*;

public class Items {

        public static Item SpaceKey = new Item(0, "Ключ пространства.");
        public static Item TimeKey = new Item(1, "Ключ времени.");
        public static Item PlaceKey = new Item(2, "Ключ места.");
        public static Item EventKey = new Item(3, "Ключ события.");
        public static Item MemoryKey = new Item(4, "Ключ воспоминаний.");
        public static Item BoozeKey = new Item(5, "Ключ бухла.");

        public static  List<Item> itm = new ArrayList<Item>() {
                 Item SpaceKey = new Item(0, "Ключ пространства.");
                 Item TimeKey = new Item(1, "Ключ времени.");
                 Item PlaceKey = new Item(2, "Ключ места.");
                 Item EventKey = new Item(3, "Ключ события.");
                 Item MemoryKey = new Item(4, "Ключ воспоминаний.");
                 Item BoozeKey = new Item(5, "Ключ бухла.");
        };

}
