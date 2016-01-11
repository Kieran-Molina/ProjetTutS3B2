package game;

import static java.lang.Math.random;

/**
 * Created by nico on 10/01/16.
 */
public class Chimique extends Unite {

    public Chimique(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        loadImage("IDEA/Images/Tactical/Unite/Chimique/Normal/Déplacement_LEFT/Chimique_Deplacement_11.png");
        getImageDimensions();
        force = (int) (70 + random() * (100 - 70));
        prix = 100;
    }
}
