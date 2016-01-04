package game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by nico on 03/01/16.
 */
public class Armee {

    ArrayList<Unite> armee;
    Image image;

    Armee() {
        armee = new ArrayList<Unite>();
    }

    public Image getImage(){
        return this.image;
    }
    public void vider() {
        armee.clear();
    }

    public Unite getUnite(int index) {
        return armee.get(index);
    }

    public void addUnite(Unite u) {
        armee.add(u);
    }

    public void removeUnite(Unite u) {
        armee.remove(u);
    }

    public void removeUnite(int index) {
        armee.remove(index);
    }

    public int taille() {
        return armee.size();
    }
}
