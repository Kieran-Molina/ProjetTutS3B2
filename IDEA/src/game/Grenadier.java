package game;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class Grenadier extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_UP/Grenadier_Deplacement_1.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_RIGHT/Grenadier_Deplacement_1.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_DOWN/Grenadier_Deplacement_1.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_LEFT/Grenadier_Deplacement_1.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;




    public Grenadier(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);

        loadImage("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_LEFT/Grenadier_Deplacement_1.png");
        getImageDimensions();
        force=4;
        prix=75;

    }





}