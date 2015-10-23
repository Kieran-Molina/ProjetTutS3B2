package game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Model {
    public MovePanel movePanel; // fond contenant la carte et tous les elements

    public ArrayList<Unite> units;
    public ArrayList<Unite> ennemis;

    Toolkit tk = Toolkit.getDefaultToolkit();
    ///// IMAGES /////
    protected Image map;

    public Model(){
        units = new ArrayList<Unite>();
        ennemis = new ArrayList<Unite>();

        units.add(new Unite(5,5)); //test affichage

        ///// IMAGES /////
        map = tk.getImage("Images/map.png");
    }

    public Image getMap(){ return map; }
}
