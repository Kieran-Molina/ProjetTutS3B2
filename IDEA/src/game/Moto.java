package game;

import static java.lang.Math.random;

/**
 * Created by nico on 10/01/16.
 */
public class Moto extends Unite {

    public Moto(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        loadImage("IDEA/Images/Tactical/Unite/Moto/Normal/Déplacement_LEFT/Moto_Deplacement_11.png");
        getImageDimensions();
        force = (int) (25 + random() * (50 - 25));
        prix = 100;
    }
}
