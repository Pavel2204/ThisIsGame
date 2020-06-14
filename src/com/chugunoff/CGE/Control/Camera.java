package com.chugunoff.CGE.Control;

import com.chugunoff.CGE.Utils.Dialog;

public class Camera {
    public static int x = 0;
    public static int y = 0;

    public void move(String direction){

        switch (direction){
            case "Left":
                x += 20;
                break;
            case "Right":
                x -= 20;
                break;
            case "Up":
                y += 20;
                break;
            case "Down":
                y -= 20;
                break;
            default:
                new Dialog("Ошибка: " + direction + " - нет такого направления!");
        }
    }

}
