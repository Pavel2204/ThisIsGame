package com.chugunoff.InfoClasses;

import com.chugunoff.CGE.Utils.Dialog;

public class Scripts {

    public static Runnable test = new Runnable() {
        @Override
        public void run() {
            new Dialog("Тестовый скрипт");
        }
    };

    public static Runnable E1 = new Runnable() {
        @Override
        public void run() {
            new Dialog("chugunoff.ru/YOUARENOTKNOWME.php");
        }
    };

}
