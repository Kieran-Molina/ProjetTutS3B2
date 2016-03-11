package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;

/**
 * Created by nico on 06/01/16.
 */
public class TankLeger extends Unite {
    public static final int prix = 4000;
    final static int ETAT_MAX=180;

    public TankLeger(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        if (ami) loadImage("IDEA/Images/Tactical/Unite/Tank/TanklRougeDroit.png");
        else loadImage("IDEA/Images/Tactical/Unite/TankL/E-TanklBleuGauche.png");
        getImageDimensions();
        force=(int)(150+random()*(25));
        munition=8;
        deplacement=5;
        etat=ETAT_MAX;
    }

    public int getEtatMax(){return ETAT_MAX;}


}
