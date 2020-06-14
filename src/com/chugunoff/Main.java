package com.chugunoff;

import com.chugunoff.JSON.JSONArray;
import com.chugunoff.JSON.JSONObject;
import com.chugunoff.JSON.parser.JSONParser;
import com.chugunoff.JSON.parser.ParseException;
import com.chugunoff.Windows.Windows.MainMenu;

import java.lang.reflect.Array;

public class Main {
//Адрес Бога: Посад, ул. Садовая д. 2
    public static void main(String[] args) throws ParseException {


        Thread mainMenu = new Thread(new Runnable() {
            @Override
            public void run() {
                MainMenu main = new MainMenu();
                javax.swing.SwingUtilities.invokeLater(main);
            }
        });

        mainMenu.start();
        System.out.println("Game started.");
    }
}
