package game;

import javax.swing.*;

/**
 * Created by nico on 03/01/16.
 */
public class R17 extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/up.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/right.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/down.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/left.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;


    public R17(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
    }


}
