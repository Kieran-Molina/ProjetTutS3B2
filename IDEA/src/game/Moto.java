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
        force = (int) (35 + random() * (15));
        prix = 500;
        munition=100;
        deplacement=8;
    }
}
