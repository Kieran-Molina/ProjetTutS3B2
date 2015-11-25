package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class RenderPanel extends JPanel {
    protected Model model;

    public RenderPanel(Model m) {
        super();
        model = m;
        setLayout(new GridLayout(50,50,0,0)); //PB
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(),0,0,this);
        for (Unite uni : model.units){
            g.drawImage(uni.getImage().getImage(),uni.getX()*100,uni.getY()*100,this);
        }
    }
}
