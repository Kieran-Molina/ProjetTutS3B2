package game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by nico on 04/01/16.
 */
public class Ville {
    ArrayList<Batiment> ville;
    Image image;

    Ville() {
        ville = new ArrayList<Batiment>();
    }

    public Image getImage(){
        return this.image;
    }
    public void vider() {
        ville.clear();
    }

    public Batiment getBat(int index) {return ville.get(index);}

    public void addBat(Batiment u) {ville.add(u);}

    public void removeBat(Batiment u) {ville.remove(u);}

    public void removeBat(int index) {ville.remove(index);}

    public int taille() {return ville.size();}

}
