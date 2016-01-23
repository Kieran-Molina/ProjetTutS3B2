package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;

/**
 * Created by nico on 06/01/16.
 */
public class TankLeger extends Unite {

    public TankLeger(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        loadImage("IDEA/Images/Tactical/Unite/TankL/TanklL.png");
        getImageDimensions();
        force=(int)(150+random()*(150-125));
        prix=4000;
        munition=8;
        deplacement=5;
    }

}
