package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 03/01/16.
 */
public class R17 extends Unite {

    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/up.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/right.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/down.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/left.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;
    private int dx;
    private int dy;



    public R17(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Unite/Proto/tank.png");
        //ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Unite/Renault_FT17/DeplacementLEFT.avi");
        image = ii.getImage();
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }

    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }


}
