package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;

/**
 * Created by nico on 06/01/16.
 */
public class British extends Unite {

    public British(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        loadImage("IDEA/Images/Tactical/Unite/British MK V/Normal/Déplacement_LEFT/British_Deplacement_1.png");
        getImageDimensions();
        force=(int)(150+random()*(150-125));
        prix=750;
    }





}
