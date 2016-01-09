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
        qg = new QG(300,200);
        ecole= new BFormation(1000,200);
        c=new Cursor(100,100);
        tutur = new R17(300,100,true);
        tutur2 = new R17(300,100,false);
        b = new British(500,200,true);
        inf = new Infanterie(500,200,true);
        inf2 = new Infanterie(500,600,false);
        rolf = new AllemandLeger(700,700,false);
        elga = new AllemandLourd(200,100,false);
        bilbon = new Grenadier(100,100,true);
        sam = new Grenadier(200,100,false);

        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/MapVierge.png").getImage();
        units.add(tutur);
        units.add(new Infanterie(1000, 5, true));
        ennemis.add(tutur2);//test ennemis
        ville.add(qg);
        ville.add(ecole);
    }

    public Image getMap(){ return map; }

    public int getDELAY(){return DELAY;}
    public void setDELAYUp(){DELAY=DELAY-1;}//augmenter la vitesse
    public void setDELAYDown(){DELAY=DELAY+1;}//la baisse

    public void attaquer(Unite attaque,Unite defense){
        if (attaque.getSide() && defense.getSide()==false){
            defense.prendDegats(attaque.getForce());
            if(defense.isDead()){
                ennemis.remove(defense);
            }

        }else if(attaque.getSide()==false&&defense.getSide()==true){
            defense.prendDegats(attaque.getForce());
            if(defense.isDead()){
                units.remove(defense);
            }
        }
    }





}
