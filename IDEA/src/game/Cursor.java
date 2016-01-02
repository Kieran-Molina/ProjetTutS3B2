package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by nico on 22/12/15.
 */
public class Cursor {

    private int dx;
    private int dy;
    protected int x;
    protected int y;
    protected boolean select;
    protected int longY;
    protected int longX;
    private Image image;

    public Cursor (){
        initCursor();
    }

    private void initCursor() {

        ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Cursor/Cursor.png");
        image = ii.getImage();
        x=0;
        y=0;
        select=false;
        longX=x+10;//def du la longueur du curseur pareil en dessous
        longY=y+10;
    }

    public int getCurseX(){return x;}

    public int getCurseY(){return y;}

    public boolean getEtatCurse(){return select;}

    public void setCurseX(int nx){
        x=x+nx;
        longX=longX+nx;
    }

    public void setCurseY(int ny){
        y=y+ny;
        longY=longY+ny;
    }

    public void move() {
        x += dx;
        y += dy;
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
            System.out.println("llll");
        }

        if (key == KeyEvent.VK_D) {
            dx = 1;
            System.out.println("llll");
        }

        if (key == KeyEvent.VK_Z) {
            dy = -1;
            System.out.println("llll");
        }

        if (key == KeyEvent.VK_S) {
            dy = 1;
            System.out.println("llll");
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
