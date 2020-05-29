package com.chugunoff.ThisIsGame;

import com.chugunoff.ThisIsGame.Windows.MainMenu;

public class Main {

    public static void main(String[] args) {

        Thread mainMenu = new Thread(new Runnable() {
            @Override
            public void run() {
                MainMenu main = new MainMenu();
                javax.swing.SwingUtilities.invokeLater(main);
            }
        });

        mainMenu.start();
        System.out.println("Game started.www");

    }
}
