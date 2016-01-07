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
    private Timer timer;
   // private final int DELAY = 10;

    public RenderPanel(Model m,Vue v) {
        super();
        model = m;
        vue = v;
        setLayout(new GridLayout(50,50,0,0)); //PB
        addKeyListener( new TAdapter());
        setFocusable(true);
        timer = new Timer(model.DELAY, this);
        timer.start();
    }

    public void deplacer(int x, int y){
        setLocation(getX()+x , getY()+y);
        if (getX() > 0) setLocation(0,getY());
        if (getY() > 0) setLocation(getX(),0);

        int hmax = getParent().getWidth() - model.getMap().getWidth(null);
        int lmax = getParent().getHeight() - model.getMap().getHeight(null);

        if (getX() < hmax) setLocation(hmax,getY());
        if (getY() < lmax) setLocation(getX(),lmax);


        revalidate();
    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(),0,0,this);

        for (Batiment city: model.ville) {
            //batimment
            g.drawImage(model.qg.getImage(), model.qg.getX(), model.qg.getY(), this);//QG
            g.drawImage(model.ecole.getImage(), model.ecole.getX(), model.ecole.getY(), this);//QG
            //g.drawImage(model.ville.getImage(),model.ville.getX(),model.ville.getY,this);
            g.drawImage(model.city.getImage(), city.getX(), city.getY(), this);
        }

        //Unités
        for (Unite uni : model.units) {
             g.drawImage(uni.getImageIcon().getImage(),uni.getX()*100,uni.getY()*100,this);
            //vehicule
            //  g.drawImage(R17.getImageIcon().getImage(),uni.getX()*100,uni.getY()*100,this);
            g.drawImage(model.tutur.getImage(), model.tutur.getX(), model.tutur.getY(), this);
            g.drawImage(model.armee.getImage(), model.tutur.getX(), model.tutur.getY(), this);
            g.drawImage(model.b.getImage(), model.b.getX(), model.b.getY(), this);
            g.drawImage(model.inf.getImage(), model.inf.getX(), model.inf.getY(), this);
        }

            //curseur
            g.drawImage(model.c.getImage(), model.c.getX(), model.c.getY(), this);//curseur


    }

    public void actionPerformed(ActionEvent e) {

        model.c.move();
        model.tutur.move();
        model.inf.move();
        model.b.move();
        model.city.addBat();//
        model.city.getVille();//it doesn't work
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            model.c.keyReleased(e);
            model.tutur.keyReleased(e);
            model.b.keyReleased(e);
            model.inf.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            model.c.keyPressed(e);
            model.tutur.keyPressed(e);
            model.b.keyPressed(e);
            model.inf.keyReleased(e);
        }
    }
}
