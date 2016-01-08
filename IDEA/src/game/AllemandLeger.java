package game;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class AllemandLeger extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_UP/AllemandLeger_Deplacement_1.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_RIGHT/AllemandLeger_Deplacement_1.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_DOWN/AllemandLeger_Deplacement_1.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_LEFT/AllemandLeger_Deplacement_1.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;




    public AllemandLeger(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        force=3;

        loadImage("IDEA/Images/Tactical/Unite/AllemandLeger/Normal/Déplacement_LEFT/AllemandLeger_Deplacement_1.png");
        getImageDimensions();
        prix=500;
    }





}