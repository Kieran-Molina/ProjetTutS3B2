package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;


public class AllemandLourd extends Unite {

    public AllemandLourd(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        force=(int)(150+random()*(150-125));
        loadImage("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_LEFT/AllemandLourd_Deplacement_1.png");
        getImageDimensions();
        prix=750;
    }





}