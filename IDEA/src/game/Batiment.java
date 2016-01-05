package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nico on 03/01/16.
 */
public class Batiment {

    protected int x, y;

    protected Image image;

    public Batiment (int xb,int yb){

        x=xb;
        y=yb;
       // ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Batiment/Batiment.png");
        //image = ii.getImage();

    }

    public Image getImage() {
        return image;
    }

    public int getX(){return x;}
    public int getY(){return y;}
}
