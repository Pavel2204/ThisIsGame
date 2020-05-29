package com.chugunoff.ThisIsGame.Engine.Control;

import com.chugunoff.ThisIsGame.Engine.Inventory.Inventory;
import com.chugunoff.ThisIsGame.Engine.Utils.Dialog;

import javax.swing.*;

public class Player {

    public Player(int x, int y, int HP, int MP, int money, int DMG, int atk_ID, int def_ID, String name, ImageIcon img) {
        this.x = x;
        this.y = y;
        this.HP = HP;
        this.MP = MP;
        this.img = img;
        Money = money;
        this.DMG = DMG;
        Atk_ID = atk_ID;
        Def_ID = def_ID;
        Name = name;
        this.speed = 5;
    }

    public static Inventory inventory = new Inventory(10);
    public static int x,y,HP,MP,Money,DMG,Atk_ID,Def_ID;
    public static String Name;
    public static ImageIcon img;

    void Damage(int Enemy_Atk){
        int dmg = (Enemy_Atk - Def_ID) / 2;
        this.HP = this.HP -= dmg;
    }

    void Attack(int Enemy_Def,int EHP){
        int dmg = this.DMG - (Enemy_Def / 2);
        EHP = EHP -= dmg;

    }
    static int speed = 10;
    public static void move(String direction){
        if(direction == "Left"){
            x -= speed;
        }else if(direction == "Right"){
            x += speed;
        }else if(direction == "Down"){
            y += speed;
        }else if(direction == "Up"){
            y -= speed;
        }else{
            new Dialog("Player tried to move of unknown direction with name - " + direction);
            System.exit(1);
        }
    }

}
