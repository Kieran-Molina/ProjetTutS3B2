package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 22/12/15.
 */
public class Cursor extends Sprite {

    private int dx;
    private int dy;
    protected int x;
    protected int y;
    protected boolean select;
    protected int longY;
    protected int longX;
    private Image image;

    public Cursor (int posx,int posy){
        super(posx,posy);
        initCursor();
    }

    private void initCursor() {

        ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Cursor/Cursor.png");
        image = ii.getImage();
        select=false;

    }

    public int getX(){return x;}

    public int getY(){return y;}

    public boolean getEtatCurse(){return select;}


    public void move() {
        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }

        if (x > 4900) {
            x =4900;
        }

        if (y >4900) {
            y = 4900;
        }
        
    }

    public void setCurseSelect(){
        if (select==false){select=true;}
        if (select==true){select =false;}
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_Q) {
            dx = -1;
        }

        if (key == KeyEvent.VK_D) {
            dx = 1;
        }

        if (key == KeyEvent.VK_Z) {
            dy = -1;
        }

        if (key == KeyEvent.VK_S) {
            dy = 1;
        }

    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_Q) {
            dx = 0;
        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
        }

        if (key == KeyEvent.VK_Z) {
            dy = 0;
        }

        if (key == KeyEvent.VK_S) {
            dy = 0;
        }
    }


}
