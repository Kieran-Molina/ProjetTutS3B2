package game;

import static java.lang.Math.random;

/**
 * Created by nico on 10/01/16.
 */
public class Chimique extends Unite {
    public static final int prix = 1500;
    final static int ETAT_MAX=150;

    public Chimique(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        loadImage("IDEA/Images/Tactical/Unite/Chimique/Normal/Déplacement_LEFT/Chimique_Deplacement_11.png");
        getImageDimensions();
        force = (int) (70 + random() * (30));
        munition=3;
        deplacement=2;
        etat=ETAT_MAX;
    }

    public int getEtatMax(){return ETAT_MAX;}

}
