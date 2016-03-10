package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;

/**
 * Created by nico on 03/01/16.
 */
public class TankLourd extends Unite {
    public static final int prix = 6000;
    final static int ETAT_MAX=200;

    public TankLourd(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        if(ami==true){
            loadImage("IDEA/Images/Tactical/Unite/Renault_FT17/Normal/Déplacement_LEFT/Renault_FT_17_Deplacement_11.png");}//if pour savoir que sprite selon l'armée
        else{loadImage("IDEA/Images/Tactical/Unite/Renault_FT17/Normal/Déplacement_RIGHT/Renault_FT_17_Deplacement_11.png");}
        getImageDimensions();
        force=(int)(180+random()*(50));
        munition=9;
        deplacement=6;
        etat=ETAT_MAX;
    }

    public int getEtatMax(){return ETAT_MAX;}

}
