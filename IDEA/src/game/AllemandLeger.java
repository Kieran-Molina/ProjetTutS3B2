package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;


public class AllemandLeger extends Unite {

    public AllemandLeger(int posX, int posY, boolean ami) {
        super(posX, posY, ami);
        force=(int)(125+random()*(125-80));

        loadImage("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_LEFT/AllemandLeger_Deplacement_1.png");
        getImageDimensions();
        prix=500;
    }





}