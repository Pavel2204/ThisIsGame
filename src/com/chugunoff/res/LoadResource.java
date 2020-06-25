package com.chugunoff.res;

import com.chugunoff.CGE.Graphics.Animation.NPC;
import com.chugunoff.CGE.Graphics.Dialog._Font_;
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
        ImageIcon Crossroads = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/Crossroads.png");
        ImageIcon Sixy = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/Sixy.png");
        ImageIcon Sixy2 = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/Sixy2.png");
        ImageIcon Dialog = new ImageIcon(dir + "/src/com/chugunoff/res/img/obj/Dialog/Dialog.png");
        _Font_ font = new _Font_(dir + "/src/com/chugunoff/res/fnt/ru_RU.ttf");

        //LOGO
        ImageIcon AESLogo = new ImageIcon(dir + "/src/com/chugunoff/res/logo/AESLogo.png");

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

        //Barman
        ImageIcon[] BarmanSmokes = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Smoke/Smoke1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Smoke/Smoke2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Smoke/Smoke3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Smoke/Smoke4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Smoke/Smoke5.png")
        };

        ImageIcon[] BarmanBeer = new ImageIcon[]{
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад1.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад2.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад3.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад4.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад5.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад6.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад7.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад8.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад9.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад10.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад11.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад12.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад13.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад14.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад15.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад16.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад17.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад18.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад19.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад20.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад21.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад22.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад23.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад24.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад25.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад26.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад27.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад28.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад29.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад30.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад31.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад32.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад33.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад34.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад35.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад36.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад37.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад38.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад39.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад40.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад41.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад42.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад43.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад44.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад45.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад46.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад47.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад48.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад49.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад50.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад51.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад52.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад53.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад54.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад55.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад56.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад57.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад58.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад59.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад60.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад61.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад62.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад63.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад64.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад65.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад66.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад67.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад68.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад69.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад70.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад71.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад72.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад73.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад74.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад75.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад76.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад77.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад78.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад79.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад80.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад81.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад82.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад83.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад84.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад85.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад86.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад87.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад88.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад89.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад90.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад91.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад92.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад93.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад94.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад95.png"),
                new ImageIcon(dir + "/src/com/chugunoff/res/img/NPC/Barman/Beer/ад96.png")



        };


        ImageIcon HENTAI = new ImageIcon(dir + "/src/com/chugunoff/res/bkg/HENTAI.jpeg");
        ImageIcon PlayerUp1 = new ImageIcon(dir + "/src/com/chugunoff/res/img/player/playerUp1.png");


        this.NewGameAct = NewGameAct;
        this.NewGameDeact = NewGameDeact;
        this.LoadGameAct = LoadGameAct;
        this.BarFire = BarFire;
        this.BarFire3 = BarFire3;
        this.BarFire4 = BarFire4;
        this.AESLogo = AESLogo;
        this.BarFire2 = BarFire2;
        this.LoadGameDeact = LoadGameDeact;
        this.Crossroads = Crossroads;
        this.Dialog = Dialog;
        this.SettingsAct = SettingsAct;
        this.SettingsDeact = SettingsDeact;
        this.ExitGameAct = ExitGameAct;
        this.BarmanBeer = BarmanBeer;
        this.BarmanSmoke = BarmanSmokes;
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
        this.Sixy = Sixy;
        this.Sixy2 = Sixy2;


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
    public static ImageIcon Sixy;
    public static ImageIcon Sixy2;
    public static ImageIcon[] BarFire;
    public static ImageIcon[] BarFire2;
    public static ImageIcon[] BarFire3;
    public static ImageIcon AESLogo;
    public static ImageIcon[] BarFire4;
    public static ImageIcon[] PlayerRight;
    public static ImageIcon[] PlayerLeft;
    public static ImageIcon Crossroads;
    public static ImageIcon[] PlayerUp;
    public static _Font_ font;
    public static ImageIcon[] PlayerDown;
    public static ImageIcon[] BarmanBeer;
    public static ImageIcon[] BarmanSmoke;
    public static NPC Darvin;


    public static ImageIcon HENTAI;
    public static ImageIcon PlayerUp1;
}
