package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class RenderPanel extends JPanel {
    protected Vue vue;
    protected Model model;

    public RenderPanel(Model m,Vue v) {
        super();
        model = m;
        vue = v;
        setLayout(new GridLayout(50,50,0,0)); //PB
    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        //fond map
        g.setColor(Color.green);
        //g.drawImage(model.getMap(),0,0,this);
        for (Unite uni : model.units){
           // g.drawImage(uni.getImage().getImage(),uni.getX()*100,uni.getY()*100,this);
            g.setColor(Color.RED);
            g.drawRect (10, 10,model.c.getCurseX()*10 ,model.c.getCurseY()*10);

            g.setColor(Color.green);
            //g.draw3DRect (10, 10,uni.getX()*10,uni.getY()*10,true);
        }
    }
}
