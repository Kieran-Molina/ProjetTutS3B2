package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kiéran on 23/10/2015.
 */
public class Unite { // sera en abstract
    public int x, y, direction;
    public int etat;


    //--- CONSTANTES ---//
    private static final ImageIcon img_UP = new ImageIcon("Images/Unite/Default/up.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("Images/Unite/Default/right.png");
    private static final ImageIcon img_DOWN = new ImageIcon("Images/Unite/Default/down.png");
    private static final ImageIcon img_LEFT = new ImageIcon("Images/Unite/Default/left.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;
    public static final int DEPLACEMENT_MAX = 5;

    public Unite(int posX, int posY){
        direction = RIGHT;
        x = posX; y = posY;
    }

    public void deplaceUnite(int depX, int depY){
        if (depX + depX > DEPLACEMENT_MAX){
            System.out.println("deplacement trop grand : "+(depX+depY)+" max : "+DEPLACEMENT_MAX);
            return;
        }
        x+=depX;
        y+=depY;
    }

    public int getEtat(){return etat;}
    public void prendDegats(int degats){
        etat-=degats;
        if (etat <= 0){
            //destruction
        }
    }

    public ImageIcon getImage(){
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

    public int getX(){return x;}
    public int getY(){return y;}
}
