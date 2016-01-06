package game;

/**
 * Created by nico on 04/01/16.
 */
public class Tour {

    protected int NBTour;
    protected boolean fin;
    protected int NBaction;


    public Tour(int s){
        NBTour=0;
        fin = false;
        NBaction= s;
    }

    public int getTour(){return NBTour;}
    public void setTour(){NBTour=NBTour+1;}

    public boolean getFin(){return fin;}
    public void setFin(boolean i){fin=i;}

    public int getNBaction(){return NBaction;}
    public void setNBaction(int i){NBaction=i;}
}
