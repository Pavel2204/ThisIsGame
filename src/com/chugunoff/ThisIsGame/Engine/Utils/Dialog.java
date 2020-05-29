package com.chugunoff.ThisIsGame.Engine.Utils;

import javax.swing.*;

public class Dialog extends JDialog{
    public Dialog(String text){
        JOptionPane.showInternalConfirmDialog(null,text);

    }
    public Dialog(int num){
        JOptionPane.showInternalConfirmDialog(null,num);

    }
}
