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
    public British b;
    public Infanterie inf;
    public Infanterie inf2;
    public BFormation ecole;
    public Cursor c;
    public R17 tutur;
    public R17 tutur2;
    public AllemandLeger rolf;
    public AllemandLourd elga;
    public Grenadier bilbon;
    public Grenadier sam;


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
        c=new Cursor(100,100);
        tutur = new R17(300,100,5,true);
        tutur2 = new R17(300,100,5,false);
        b = new British(500,200,5,true);
        inf = new Infanterie(500,200,5,true);
        inf2 = new Infanterie(500,600,5,false);
        rolf = new AllemandLeger(700,700,5,false);
        elga = new AllemandLourd(200,100,5,false);
        bilbon = new Grenadier(100,100,5,true);
        sam = new Grenadier(200,100,5,false);

        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/MapVierge.png").getImage();
        units.add(new R17(5,5,5,true));
        units.add(new R17(100,5,5,true));
        units.add(new R17(200,5,5,true));
        city.addBat();
        city.addBat();
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
