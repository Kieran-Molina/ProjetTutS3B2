package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class RenderPanel extends JPanel implements ActionListener {
    protected Vue vue;
    protected Model model;
    protected ControlKey ck;
    private Timer timer;
   // private final int DELAY = 10;

    public RenderPanel(Model m,Vue v) {
        super();
        model = m;
        vue = v;
        setLayout(new GridLayout(50,50,0,0)); //PB
        addKeyListener((KeyListener) new TAdapter());
        setFocusable(true);
        timer = new Timer(model.DELAY, this);
        timer.start();
    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(),0,0,this);

        //Unités
        for (Unite uni : model.units){
           // g.drawImage(uni.getImageIcon().getImage(),uni.getX()*100,uni.getY()*100,this);
            //vehicule
          //  g.drawImage(R17.getImageIcon().getImage(),uni.getX()*100,uni.getY()*100,this);
            g.drawImage(model.tutur.getImage(),model.tutur.getX(),model.tutur.getY(),this);
            g.drawImage(model.armee.getImage(),model.tutur.getX(),model.tutur.getY(),this);

            //batimment
            g.drawImage(model.qg.getImage(), model.qg.getX(), model.qg.getY(), this);//QG
            g.drawImage(model.ecole.getImage(), model.ecole.getX(), model.ecole.getY(), this);//QG
           // g.drawImage(model.ville.getImage(),model.ville.getX(),model.ville.getY,this);

            //curseur
            g.drawImage(model.c.getImage(), model.c.getCurseX(), model.c.getCurseY(), this);//curseur

        }
    }

    public void actionPerformed(ActionEvent e) {

        model.c.move();
        model.tutur.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            model.c.keyReleased(e);
            model.tutur.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            model.c.keyPressed(e);
            model.tutur.keyPressed(e);
        }
    }
}
