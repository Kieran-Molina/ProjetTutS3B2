package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;

/**
 * Created by nico on 06/01/16.
 */
public class Infanterie extends Unite {

    public Infanterie(int posX, int posY, boolean ami) {

        super(posX, posY,ami);
        if(ami==true){
            loadImage("IDEA/Images/Tactical/Unite/Infanterie/Normal/Déplacement_LEFT/Infanterie_Deplacement_11.png");}

        else{loadImage("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_LEFT/InfanterieEnnemi_Deplacement_1.png");}
        getImageDimensions();
        force=(int)(25+random()*(50-25));
        prix=50;

    }



}
