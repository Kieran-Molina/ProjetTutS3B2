package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;

/**
 * Created by nico on 06/01/16.
 */
public class Infanterie extends Unite {
    public static final int prix = 100;

    public Infanterie(int posX, int posY, boolean ami) {

        super(posX, posY,ami);
        if(ami) loadImage("IDEA/Images/Tactical/Unite/Infanterie/soldier_face.png");
        else loadImage("IDEA/Images/Tactical/Unite/Infanterie/soldier_faceB.png");

        getImageDimensions();
        force=(int)(35+random()*(15));
        munition=100;
        deplacement=3;
    }

    public int getEtatMax(){return ETAT_MAX;}

}
