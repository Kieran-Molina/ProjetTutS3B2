package game;

import javax.swing.*;

/**
 * Created by nico on 04/01/16.
 */
public class BFormation extends Batiment {

    public BFormation(int lx,int ly) {
        super(lx,ly);
        ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Batiment/BatimentFormation.png");
        image = ii.getImage();

    }
}

