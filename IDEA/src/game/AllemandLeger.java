package game;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class AllemandLeger extends Unite {

    public AllemandLeger(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        force=3;

        loadImage("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_LEFT/AllemandLeger_Deplacement_1.png");
        getImageDimensions();
        prix=500;
    }





}