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

    public void videArme(){ armee.clear();}//vidage de la liste

    public void addUnite(Unite u){armee.add(u);}

    public Unite getUnite(int index){
        return armee.get(index);

    }

    public void removeUnite(int index){
        armee.remove(index);
    }

    public void videbat(){ bat.clear();}//vidage de la liste

    public void addBatiment(Batiment b){bat.add(b);}

    public Batiment getBatment(int index){
        return bat.get(index);
    }

    public void removeBatiment(int index){
        bat.remove(index);
    }

    public int getArgent(){
        return Argent;
    }
    public void setARgent(int somme){
        Argent=Argent+somme;
    }





}
