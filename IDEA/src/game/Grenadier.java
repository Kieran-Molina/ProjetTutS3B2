package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;


public class Grenadier extends Unite {
    public static final int prix = 300;

    public Grenadier(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        if(ami) loadImage("IDEA/Images/Tactical/Unite/Grenadier/SoldatRDroit.png");
        else loadImage("IDEA/Images/Tactical/Unite/Grenadier/SoldatBGauche.png");
        getImageDimensions();
        force=(int)(50+random()*(30));
        munition=3;
        deplacement=2;

    }

    public int getEtatMax(){return ETAT_MAX;}

}