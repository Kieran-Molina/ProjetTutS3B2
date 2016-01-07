package game;

import javax.swing.*;

/**
 * Created by nico on 03/01/16.
 */
public class QG extends Batiment {

    public QG (int lx,int ly){
        super(lx,ly);
       // ImageIcon ii = new ImageIcon("IDEA/Images/Tactical/Batiment/QG.png");
       // image = ii.getImage();

        loadImage("IDEA/Images/Tactical/Batiment/QG.png");
        getImageDimensions();

    }


}
