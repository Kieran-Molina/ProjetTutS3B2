package game;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Model {
    public MovePanel movePanel; // fond contenant la carte et tous les elements

    public ArrayList<Unite> units;
    public ArrayList<Unite> ennemis;
    public Cursor c;
    protected int DELAY = 10;

    ///// IMAGES /////
    protected Image map;

    public Model(){
        units = new ArrayList<Unite>();
        ennemis = new ArrayList<Unite>();
        c=new Cursor();

        units.add(new Unite(5,5)); //test affichage

        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/PetitTest.png").getImage();
    }

    public Image getMap(){ return map; }

    public int getDELAY(){return DELAY;}
    public void setDELAYUp(){DELAY=DELAY+1;}
    public void setDELAYDown(){DELAY=DELAY-1;}
}
