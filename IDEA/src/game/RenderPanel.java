package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class RenderPanel extends JPanel {
    protected Vue vue;
    protected Model model;
    protected int scale;


    public RenderPanel(Model m, Vue v) {
        super();
        vue = v;
        model = m;
        //scale = model.scale;

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(),0,0,this);
    }
}
