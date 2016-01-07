package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 06/01/16.
 */
public class British extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/British MK V/Normal/Déplacement_UP/British_Deplacement_1.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/British MK V/Normal/Déplacement_RIGHT/British_Deplacement_1.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/British MK V/Normal/Déplacement_DOWN/British_Deplacement_1.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/British MK V/Normal/Déplacement_LEFT/British_Deplacement_1.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;




    public British(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Unite/British MK V/Normal/Déplacement_LEFT/British_Deplacement_1.png");
        //ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/DeplacementLEFT.avi");
        image = ii.getImage();
    }





}
