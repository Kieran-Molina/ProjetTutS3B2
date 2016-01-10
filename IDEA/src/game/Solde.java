package game;

/**
 * Created by nico on 08/01/16.
 */
public class Solde {
    protected int somme;

    public Solde(){
        somme=1000;//sole de départ tous simplement
    }

    public int getSomme(){return somme;}

    public void setSomme(int x){somme = somme + x;}
}
