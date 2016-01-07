package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Kiéran on 23/10/2015.
 */
public class Unite extends Sprite {
    private static int direction; // sera en abstract
    //public int x, y;
    public int etat;
    public boolean isSelect;
    public int DEPLACEMENT_MAX = 5;
    public boolean side;
    private int dx;
    private int dy;


    //--- CONSTANTES ---//
    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/Default/up.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/Default/right.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/Default/down.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/Default/left.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;

    public Unite(int posX, int posY, int dep,boolean ami){
        super(posX,posY);
        direction = RIGHT;
        DEPLACEMENT_MAX=dep;
        isSelect=false;
    //    ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Batiment/Batiment.png");//test image
      //  image = ii.getImage();//pareil

    }

    public void deplaceUnite(int depX, int depY){
        if(isSelect==true){
        if (depX + depX > DEPLACEMENT_MAX){
            System.out.println("deplacement trop grand : "+(depX+depY)+" max : "+DEPLACEMENT_MAX);
            return;
        }
        x+=depX;
        y+=depY;}
    }

    public int getEtat(){return etat;}
    public void prendDegats(int degats){
        etat-=degats;
        if (etat <= 0){
            //destruction
        }
    }

    public static ImageIcon getImageIcon(){
        switch (direction){
            case UP:
                return img_UP;
            case DOWN:
                return img_DOWN;
            case LEFT:
                return img_LEFT;
            default:
                return img_RIGHT;
        }
    }
    public Image getImage() {
        return image;
    }//test d'image

    public int getX(){return x;}
    public int getY(){return y;}

    public boolean getSelect(){return isSelect;}
    public void trueSelect(){isSelect=true;}
    public void falseSelect(){isSelect=false;}

    public void move() {
        x += dx;
        y += dy;
    }
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {dx = -1;}

        if (key == KeyEvent.VK_RIGHT) {dx = 1;}

        if (key == KeyEvent.VK_UP) {dy = -1;}

        if (key == KeyEvent.VK_DOWN) {dy = 1;}

    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {dx = 0;}

        if (key == KeyEvent.VK_RIGHT) {dx = 0;}

        if (key == KeyEvent.VK_UP) {dy = 0;}

        if (key == KeyEvent.VK_DOWN) {dy = 0;}
    }


}
