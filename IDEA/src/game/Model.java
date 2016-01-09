package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Model {
    public MovePanel movePanel; // fond contenant la carte et tous les elements

    public ArrayList<Unite> units;
    public ArrayList<Unite> ennemis;
    public ArrayList<Batiment> ville;
    public Cursor c;


    protected int DELAY = 4;

    ///// IMAGES /////
    protected Image map;

    public Model(){
        units = new ArrayList<Unite>();

        units.add(new R17(300,100,true));
        units.add(new British(500,200,true));
        units.add(new Infanterie(500,200,true));
        units.add(new Grenadier(100,100,true));


        ennemis = new ArrayList<Unite>();

        ennemis.add(new R17(300,100,false));
        ennemis.add(new Infanterie(500,600,false));
        ennemis.add(new AllemandLeger(700,700,false));
        ennemis.add(new AllemandLourd(200,100,false));
        ennemis.add(new Grenadier(200,100,false));


        ville = new ArrayList<Batiment>();

        ville.add(new QG(300,4400));
        ville.add(new QG(4100,100));
        ville.add(new BFormation(700,200));

        c=new Cursor(100,100);

        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/MapVierge.png").getImage();

    }

    public Image getMap(){ return map; }

    public int getDELAY(){return DELAY;}
    public void setDELAYUp(){DELAY=DELAY-1;}//augmenter la vitesse
    public void setDELAYDown(){DELAY=DELAY+1;}//la baisse



}
