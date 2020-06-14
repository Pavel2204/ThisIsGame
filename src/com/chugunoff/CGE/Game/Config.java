package com.chugunoff.CGE.Game;

import com.chugunoff.CGE.Control.Camera;
import com.chugunoff.CGE.Control.Player;
import com.chugunoff.res.LoadResource;
import org.python.util.PythonInterpreter;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Config {

    public static JFrame frame = new JFrame();
    public static boolean i = true;
    public static final Game ThisIsGame = new Game();
    public static final int WIN_WIDTH = 1200;
    public static final int WIN_HEIGHT = 800;
    public static final boolean DEBUG = true;
    public static final int SLEEPMS = 32;
    public static final long LOGOSHOWTIME = 1500l;
    public static final String dir = new File("").getAbsolutePath();
//wsww

    //Game Modules
    public static PythonInterpreter python = new PythonInterpreter();

    //Game Classes-[Functions]
    public static Player player;
    public static Camera camera;

    //Game variables-[Non-Const]
    public static boolean Dialoged = false;
    public static boolean run = true;
    public static boolean isNOTDecorated = false;

    //Game Classes-[Utilites]
    public static LoadResource resources = new LoadResource(dir);

    public static  Color TPZONE_COLOR = Color.GREEN;

}
