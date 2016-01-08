package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 06/01/16.
 */
public class InfanterieEnnemi extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_UP/InfanterieEnnemi_Deplacement_1.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_RIGHT/InfanterieEnnemi_Deplacement_1.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_DOWN/InfanterieEnnemi_Deplacement_1.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_LEFT/InfanterieEnnemi_Deplacement_1.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;




    public InfanterieEnnemi(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        loadImage("IDEA/Images/Tactical/Unite/InfanterieEnnemi/Normal/Déplacement_LEFT/InfanterieEnnemi_Deplacement_1.png");
        getImageDimensions();
        force=2;
        prix=50;
    }





}