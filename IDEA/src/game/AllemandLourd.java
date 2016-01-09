package game;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class AllemandLourd extends Unite {

    public AllemandLourd(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        force=5;
        loadImage("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_LEFT/AllemandLourd_Deplacement_1.png");
        getImageDimensions();
        prix=750;
    }





}