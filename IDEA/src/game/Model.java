package game;

import java.awt.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Model {

    Toolkit tk = Toolkit.getDefaultToolkit();
    ///// IMAGES /////
    protected Image map;

    public Model(){


        ///// IMAGES /////
        map = tk.getImage("Images/map.png");
    }

    public Image getMap(){ return map; }
}
