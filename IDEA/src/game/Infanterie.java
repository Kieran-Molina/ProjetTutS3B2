package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 06/01/16.
 */
public class Infanterie extends Unite {

    public Infanterie(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        if(ami==true){
            loadImage("IDEA/Images/Tactical/Unite/Infanterie/Normal/Déplacement_LEFT/Infanterie_Deplacement_1.png");}

        else{loadImage("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_LEFT/InfanterieEnnemi_Deplacement_1.png");}
        getImageDimensions();
        force=2;
        prix=50;

    }



}
