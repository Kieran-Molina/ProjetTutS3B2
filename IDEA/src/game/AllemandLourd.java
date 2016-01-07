package game;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class AllemandLourd extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_UP/AllemandLourd_Deplacement_1.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_RIGHT/AllemandLourd_Deplacement_1.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_DOWN/AllemandLourd_Deplacement_1.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_LEFT/AllemandLourd_Deplacement_1.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;




    public AllemandLourd(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Unite/AllemandLourd/Normal/Déplacement_LEFT/AllemandLourd_Deplacement_1.png");
        image = ii.getImage();
    }





}