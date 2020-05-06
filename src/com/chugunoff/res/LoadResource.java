package com.chugunoff.res;

import com.chugunoff.Engine.Graphics.NPC;
import com.chugunoff.Engine.Graphics.Dialog._Font_;
import com.chugunoff.InfoClasses.Items;
import com.chugunoff.InfoClasses.Scripts;
import javax.swing.*;

public class LoadResource {
    public LoadResource(String dir) {
        ImageIcon NewGameDeact = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/NewGame/NewGameDeact.png");
        ImageIcon NewGameAct = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/NewGame/NewGameAct.png");
        ImageIcon LoadGameDeact = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/LoadGame/LoadGameDeact.png");
        ImageIcon LoadGameAct = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/LoadGame/LoadGameAct.png");
        ImageIcon SettingsDeact = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Settings/SettingsDeact.png");
        ImageIcon SettingsAct = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Settings/SettingsAct.png");
        ImageIcon ExitGameAct = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Exit/ExitGameAct.png");
        ImageIcon ExitGameDeact = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Exit/ExitGameDeact.png");
        ImageIcon ExitAlternative = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Exit/ExitAlternative.png");
        ImageIcon StartAct = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Start/StartAct.png");
        ImageIcon StartDeact = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Start/StartDeact.png");
        ImageIcon UniverseVaccum =  new ImageIcon(dir + "/src/com/chugunoff/res/bkg/UniverseVaccum.png");
        ImageIcon Portal1 = new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Portal/Portal1.png");
        ImageIcon MenuBtn = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Menu/Menu.png");
        ImageIcon CancelDeact = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Cancel/CancelDeact.png");
        ImageIcon CancelAct = new ImageIcon(dir + "/src/com/chugunoff/res/img/btn/Cancel/CancelAct.png");
        ImageIcon Transition = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/Transition.png");
        ImageIcon Bar = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/Bar.png");
        ImageIcon Dialog = new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Dialog/Dialog.png");
        _Font_ font = new _Font_(dir + "/src/com/chugunoff/res/fnt/ru_RU.ttf");


        //NPCs

        NPC Darvin = new NPC(new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Darvin/sit/DarvinSit1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Darvin/sit/DarvinSit2.png"),
        }, "Darvin");

        ///PLAYER
        ImageIcon[] PlayerRight = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight5.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight6.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight7.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerRight8.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/right/PlayerStep.png")
        };

        ImageIcon[] PlayerLeft = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft5.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft6.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft7.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerLeft8.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/left/PlayerStep.png")};

        ImageIcon[] PlayerUp = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerUp1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerUp2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerUp3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerUp4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerUp5.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerUp7.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/up/PlayerStep.png")
        };

        ImageIcon[] PlayerDown = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerDown1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerDown2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerDown3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerDown4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerDown5.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerDown7.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/player/down/PlayerStep.png")
        };

        //BAR_FIRE
        ImageIcon[] BarFire = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire/fire1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire/fire2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire/fire3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire/fire4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire/fire5.png"),
        };

        ImageIcon[] BarFire2 = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire2/fire1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire2/fire2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire2/fire3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire2/fire4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire2/fire5.png"),
        };

        ImageIcon[] BarFire3 = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire3/fire1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire3/fire2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire3/fire3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire3/fire4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire3/fire5.png"),
        };

        ImageIcon[] BarFire4 = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire4/fire1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire4/fire2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire4/fire3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire4/fire4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Bar/fire4/fire5.png"),
        };


        ImageIcon HENTAI = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/HENTAI.jpeg");
        ImageIcon PlayerUp1 = new ImageIcon(dir + "/src/com/chugunoff/res/img/player/playerUp1.png");


        this.NewGameAct = NewGameAct;
        this.NewGameDeact = NewGameDeact;
        this.LoadGameAct = LoadGameAct;
        this.BarFire = BarFire;
        this.BarFire3 = BarFire3;
        this.BarFire4 = BarFire4;
        this.BarFire2 = BarFire2;
        this.LoadGameDeact = LoadGameDeact;
        this.Dialog = Dialog;
        this.SettingsAct = SettingsAct;
        this.SettingsDeact = SettingsDeact;
        this.ExitGameAct = ExitGameAct;
        this.ExitGameDeact = ExitGameDeact;
        this.font = font;
        this.ExitAlternative = ExitAlternative;
        this.StartAct = StartAct;
        this.StartDeact = StartDeact;
        this.UniverseVaccum = UniverseVaccum;
        this.MenuBtn = MenuBtn;
        this.CancelAct = CancelAct;
        this.CancelDeact = CancelDeact;
        this.PlayerRight = PlayerRight;
        this.PlayerLeft = PlayerLeft;
        this.PlayerUp = PlayerUp;
        this.Darvin = Darvin;
        this.PlayerDown = PlayerDown;
        this.Transition = Transition;
        this.Bar = Bar;


        this.HENTAI = HENTAI;
        this.Portal1 = Portal1;
        this.PlayerUp1 = PlayerUp1;
    }
    public static Scripts scripts;
    public static Items items = new Items();
    public static ImageIcon NewGameDeact;
    public static ImageIcon NewGameAct;
    public static ImageIcon LoadGameDeact;
    public static ImageIcon LoadGameAct;
    public static ImageIcon SettingsDeact;
    public static ImageIcon SettingsAct;
    public static ImageIcon ExitGameDeact;
    public static ImageIcon ExitGameAct;
    public static ImageIcon ExitAlternative;
    public static ImageIcon StartAct;
    public static ImageIcon StartDeact;
    public static ImageIcon UniverseVaccum;
    public static ImageIcon Portal1;
    public static ImageIcon MenuBtn;
    public static ImageIcon CancelAct;
    public static ImageIcon CancelDeact;
    public static ImageIcon Transition;
    public static ImageIcon Bar;
    public static ImageIcon Dialog;
    public static ImageIcon[] BarFire;
    public static ImageIcon[] BarFire2;
    public static ImageIcon[] BarFire3;
    public static ImageIcon[] BarFire4;
    public static ImageIcon[] PlayerRight;
    public static ImageIcon[] PlayerLeft;
    public static ImageIcon[] PlayerUp;
    public static _Font_ font;
    public static ImageIcon[] PlayerDown;

    public static NPC Darvin;


    public static ImageIcon HENTAI;
    public static ImageIcon PlayerUp1;
}
