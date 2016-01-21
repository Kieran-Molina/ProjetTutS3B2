package game;

import java.util.ArrayList;

/**
 * Created by nico on 21/01/16.
 */
public class Joueur {

    protected ArrayList<Unite> armee;
    protected ArrayList<Batiment> bat;
    protected int Argent;

    public Joueur(int x){
        armee = new ArrayList<Unite>();
        bat = new ArrayList<Batiment>();
        Argent = Argent+x;

    }



}
