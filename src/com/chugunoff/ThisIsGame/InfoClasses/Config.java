package com.chugunoff.ThisIsGame.InfoClasses;

import com.chugunoff.ThisIsGame.Engine.Control.Camera;
import com.chugunoff.ThisIsGame.Engine.Control.Player;
import com.chugunoff.res.LoadResource;
import org.python.util.PythonInterpreter;

import java.awt.*;
import java.io.File;

public class Config {

    public static final int WIN_WIDTH = 1200;
    public static final int WIN_HEIGHT = 800;
    public static final boolean DEBUG = true;
    public static final int SLEEPMS = 32;
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
