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
    public Armee armee;
    public Ville city;
    public QG qg;
    public BFormation ecole;
    public Cursor c;
    public R17 tutur;
    protected int DELAY = 4;

    ///// IMAGES /////
    protected Image map;

    public Model(){
        units = new ArrayList<Unite>();
        ennemis = new ArrayList<Unite>();
        ville = new ArrayList<Batiment>();
        armee = new Armee();
        city = new Ville();
        qg = new QG(300,200);
        ecole= new BFormation(1000,200);
        c=new Cursor();
        tutur = new R17(300,100,5,true);

        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/PetitTest.png").getImage();
        armee.addUnite(new R17(5,5,5,true));
        armee.addUnite(new R17(100,5,5,true));
        armee.addUnite(new R17(200,5,5,true));
        city.addBat(new QG(800,100));
        city.addBat(new QG(1000,100));
        city.addBat(new QG(2000,100));
        units.add(new R17(5,5,5,true)); //test ami affichage
        ennemis.add(new R17(100,100,5,false));//test ennemis
        ville.add(new QG(600,0));
        ville.add(new BFormation(2000,0));
    }

    public Image getMap(){ return map; }

    public int getDELAY(){return DELAY;}
    public void setDELAYUp(){DELAY=DELAY-1;}
    public void setDELAYDown(){DELAY=DELAY+1;}


}
