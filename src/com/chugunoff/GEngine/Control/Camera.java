package com.chugunoff.GEngine.Control;

import com.chugunoff.GEngine.Utils.Dialog;

public class Camera {
    public static int x = 0;
    public static int y = 0;

    public void move(String direction){
        char[] dr = direction.toCharArray();
        String firstWord = Character.toString(dr[0]);
        String allWords = getAllWords(dr);
        firstWord.toUpperCase();
        direction = firstWord + allWords;

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
                y += 20;
                break;
            default:
                new Dialog("Ошибка: " + direction + " - нет такого направления!");
        }

    }

    private String getAllWords(char[] dr){
        String dir = "";
        for (int i = 0; i < dr.length - 1; i++){
            dir += dr[i];
        }
        return dir;
    }

}
