package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nico on 03/01/16.
 */
public class Batiment extends Sprite {
    protected int impot;//a chaque tour le NB de batiment ramene de l'argent

    public Batiment (int xb,int yb){
        super(xb,yb);

    }

    public int getPrix(){return impot;}
}
