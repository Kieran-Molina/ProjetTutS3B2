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
    public boolean arbres [][];


    protected int DELAY = 4;

    ///// IMAGES /////
    protected Image map;

    public Model(){
        units = new ArrayList<Unite>();

        units.add(new R17(300,100,true));
        units.add(new British(500,200,true));
        units.add(new Infanterie(500,300,true));
        units.add(new Grenadier(100,100,true));


        ennemis = new ArrayList<Unite>();

        ennemis.add(new R17(300,500,false));


        ville = new ArrayList<Batiment>();

        ville.add(new QG(300,4400));
        ville.add(new QG(4100,100));
        ville.add(new QG(900,100));
        ville.add(new BFormation(900,4100));
        ville.add(new BFormation(3200,100));
        ville.add(new BFormation(500,500));


        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/MapVierge.png").getImage();

    }

    public Image getMap(){ return map; }

    public int getDELAY(){return DELAY;}
    public void setDELAYUp(){DELAY=DELAY-1;}//augmenter la vitesse
    public void setDELAYDown(){DELAY=DELAY+1;}//la baisse

    public void creerUneUnite(Unite aCreer){
        if(aCreer.getSide()) {
            units.add(aCreer);

        }else{
            ennemis.add(aCreer);
        }
        movePanel.ajouterComposant(aCreer);
    }

    public void attaquer(Unite attaque,Unite defense){
        if (attaque.getSide() && !defense.getSide()){
            defense.prendDegats(attaque.getForce());
            if(defense.isDead()){
                ennemis.remove(defense);
            }

        }else if(!attaque.getSide() && defense.getSide()){
            defense.prendDegats(attaque.getForce());
            if(defense.isDead()){
                units.remove(defense);
            }
        }
    }

    public boolean isArbre(int x, int y) {
        return arbres[x][y];
    }

    public void initArbres() {
        arbres = new boolean [50][50];

        //Ligne 0
        for (int i=20; i<=32; i++) {
            arbres[i][0]=true;
        }
        //Ligne 1
        for (int i=20; i<=31; i++) {
            arbres[i][1]=true;
        }
        //Ligne 2
        for (int i=4; i<=14; i++) {
            arbres[i][2]=true;
        }
        for (int i=20; i<=31; i++) {
            arbres[i][2]=true;
        }
        //Ligne 3
        for (int i=3; i<=14; i++) {
            arbres[i][3]=true;
        }
        for (int i=20; i<=28; i++) {
            arbres[i][3]=true;
        }
        //Ligne 4
        for (int i=2; i<=14; i++) {
            arbres[i][4]=true;
        }
        for (int i=22; i<=28; i++) {
            arbres[i][4]=true;
        }
        //Ligne 5
        for (int i=1; i<=14; i++) {
            arbres[i][5]=true;
        }
        for (int i=22; i<=28; i++) {
            arbres[i][5]=true;
        }
        //Ligne 6
        for (int i=0; i<=14; i++) {
            arbres[i][6]=true;
        }
        for (int i=24; i<=28; i++) {
            arbres[i][6]=true;
        }
        //Ligne 7
        for (int i=0; i<=14; i++) {
            arbres[i][7]=true;
        }
        for (int i=24; i<=25; i++) {
            arbres[i][7]=true;
        }
        arbres[32][7]=true;
        for (int i=35; i<=38; i++) {
            arbres[i][7]=true;
        }
        //Ligne 8
        arbres[10][8]=true;
        for (int i=35; i<=38; i++) {
            arbres[i][8]=true;
        }
        //Ligne 9
        for (int i=30; i<=38; i++) {
            arbres[i][9]=true;
        }
        //Ligne 10
        for (int i=10; i<=15; i++) {
            arbres[i][10]=true;
        }
        for (int i=34; i<=38; i++) {
            arbres[i][10]=true;
        }
        //Ligne 11
        for (int i=9; i<=15; i++) {
            arbres[i][11]=true;
        }
        for (int i=35; i<=36; i++) {
            arbres[i][11]=true;
        }
        //Ligne 12
        for (int i=9; i<=15; i++) {
            arbres[i][12]=true;
        }
        //Ligne 13
        for (int i=12; i<=14; i++) {
            arbres[i][13]=true;
        }
        for (int i=27; i<=30; i++) {
            arbres[i][13]=true;
        }
        //Ligne 14
        for (int i=13; i<=14; i++) {
            arbres[i][14]=true;
        }
        for (int i=27; i<=30; i++) {
            arbres[i][14]=true;
        }
        //Ligne 15
        for (int i=28; i<=30; i++) {
            arbres[i][15]=true;
        }
        //Ligne 16
        for (int i=27; i<=30; i++) {
            arbres[i][16]=true;
        }
        //Ligne 17
        for (int i=28; i<=34; i++) {
            arbres[i][17]=true;
        }
        //Ligne 18
        for (int i=28; i<=34; i++) {
            arbres[i][18]=true;
        }
        //Ligne 19
        for (int i=29; i<=34; i++) {
            arbres[i][19]=true;
        }
        //Ligne 20
        for (int i=30; i<=33; i++) {
            arbres[i][20]=true;
        }
        //Ligne 21
        arbres[31][21]=true;
        //Ligne 22
        for (int i=38; i<=40; i++) {
            arbres[i][22]=true;
        }
        //Ligne 23
        for (int i=38; i<=42; i++) {
            arbres[i][23]=true;
        }
        //Ligne 24
        for (int i=32; i<=42; i++) {
            arbres[i][24]=true;
        }
        //Ligne 25
        for (int i=32; i<=42; i++) {
            arbres[i][25]=true;
        }
        //Ligne 26
        for (int i=32; i<=43; i++) {
            arbres[i][26]=true;
        }
        //Ligne 27
        for (int i=12; i<=14; i++) {
            arbres[i][27]=true;
        }
        for (int i=26; i<=28; i++) {
            arbres[i][27]=true;
        }
        for (int i=39; i<=42; i++) {
            arbres[i][27]=true;
        }
        //Ligne 28
        for (int i=10; i<=15; i++) {
            arbres[i][28]=true;
        }
        for (int i=24; i<=29; i++) {
            arbres[i][28]=true;
        }
        for (int i=39; i<=43; i++) {
            arbres[i][28]=true;
        }
        //Ligne 29
        for (int i=10; i<=17; i++) {
            arbres[i][29]=true;
        }
        for (int i=24; i<=29; i++) {
            arbres[i][29]=true;
        }
        for (int i=41; i<=44; i++) {
            arbres[i][29]=true;
        }
        //Ligne 30
        for (int i=10; i<=19; i++) {
            arbres[i][30]=true;
        }
        for (int i=26; i<=29; i++) {
            arbres[i][30]=true;
        }
        for (int i=42; i<=45; i++) {
            arbres[i][30]=true;
        }
        //Ligne 31
        for (int i=10; i<=17; i++) {
            arbres[i][31]=true;
        }
        for (int i=28; i<=29; i++) {
            arbres[i][31]=true;
        }
        for (int i=43; i<=44; i++) {
            arbres[i][31]=true;
        }
        //Ligne 32
        for (int i=7; i<=17; i++) {
            arbres[i][32]=true;
        }
        for (int i=44; i<=45; i++) {
            arbres[i][32]=true;
        }
        //Ligne 33
        for (int i=6; i<=14; i++) {
            arbres[i][33]=true;
        }
        for (int i=16; i<=19; i++) {
            arbres[i][33]=true;
        }
        arbres[24][33]=true;
        for (int i=44; i<=45; i++) {
            arbres[i][33]=true;
        }
        //Ligne 34
        for (int i=8; i<=19; i++) {
            arbres[i][34]=true;
        }
        for (int i=23; i<=24; i++) {
            arbres[i][34]=true;
        }
        arbres[24][34]=true;
        //Ligne 35
        for (int i=9; i<=15; i++) {
            arbres[i][35]=true;
        }
        for (int i=22; i<=26; i++) {
            arbres[i][35]=true;
        }
        for (int i=44; i<=45; i++) {
            arbres[i][35]=true;
        }
        //Ligne 36
        for (int i=8; i<=13; i++) {
            arbres[i][36]=true;
        }
        for (int i=21; i<=27; i++) {
            arbres[i][36]=true;
        }
        for (int i=43; i<=45; i++) {
            arbres[i][36]=true;
        }
        //Ligne 37
        for (int i=7; i<=13; i++) {
            arbres[i][37]=true;
        }
        for (int i=20; i<=27; i++) {
            arbres[i][37]=true;
        }
        for (int i=42; i<=45; i++) {
            arbres[i][37]=true;
        }
        //Ligne 38
        for (int i=20; i<=28; i++) {
            arbres[i][38]=true;
        }
        for (int i=36; i<=42; i++) {
            arbres[i][35]=true;
        }
        //Ligne 39
        for (int i=20; i<=30; i++) {
            arbres[i][39]=true;
        }
        for (int i=36; i<=42; i++) {
            arbres[i][39]=true;
        }
        //Ligne 40
        for (int i=6; i<=9; i++) {
            arbres[i][40]=true;
        }
        arbres[25][40]=true;
        for (int i=27; i<=29; i++) {
            arbres[i][40]=true;
        }
        for (int i=37; i<=43; i++) {
            arbres[i][40]=true;
        }
        //Ligne 41
        for (int i=5; i<=10; i++) {
            arbres[i][41]=true;
        }
        for (int i=38; i<=43; i++) {
            arbres[i][41]=true;
        }
        //Ligne 42
        for (int i=5; i<=11; i++) {
            arbres[i][42]=true;
        }
        for (int i=39; i<=42; i++) {
            arbres[i][42]=true;
        }
        //Ligne 43
        for (int i=5; i<=11; i++) {
            arbres[i][43]=true;
        }
        for (int i=39; i<=40; i++) {
            arbres[i][43]=true;
        }
        //Ligne 44
        for (int i=7; i<=11; i++) {
            arbres[i][44]=true;
        }
        //Ligne 45
        for (int i=8; i<=12; i++) {
            arbres[i][45]=true;
        }
    }
}
