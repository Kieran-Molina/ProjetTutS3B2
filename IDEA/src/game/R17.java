package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 03/01/16.
 */
public class R17 extends Unite {

    public R17(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        if(ami==true){
            loadImage("IDEA/Images/Tactical/Unite/Renault_FT17/Normal/Déplacement_LEFT/Renault_FT_17_Deplacement_1.png");}//if pour savoir que sprite selon l'armée
        else{loadImage("IDEA/Images/Tactical/Unite/Renault_FT17/Normal/Déplacement_RIGHT/Renault_FT_17_Deplacement_1.png");}
        getImageDimensions();
        force=8;
        prix=500;
    }






}
