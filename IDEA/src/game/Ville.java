package game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Created by nico on 04/01/16.
 */
public class Ville {
    ArrayList<Batiment> ville;
    Image image;
    int lower = 100;
    int higher =3000;
    int random = (int)(Math.random() * (higher-lower)) + lower;

    Ville() {
        ville = new ArrayList<Batiment>();
    }

    public Image getImage(){
        return this.image;
    }
    public void vider() {
        ville.clear();
    }

    public ArrayList getVille() {
        return ville;
    }

    public Batiment getBat(int index) {return ville.get(index);}

    public void addBat() {ville.add(new QG(random,random));}

    public void removeBat(Batiment u) {ville.remove(u);}

    public void removeBat(int index) {ville.remove(index);}

    public int taille() {return ville.size();}



}
