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
        setLayout(null);
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
        Font font = new Font("Verdana", Font.BOLD, 30);//police pour l'affichage de l'état
        g.setFont(font);
        g.setColor(Color.white);//couleur biensur
        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(),0,0,this);


        for (Batiment bat : model.ville) {
            //batiment
            g.drawImage(bat.getImage(),bat.getX(),bat.getY(),this);
        }

        //Unités
        for (Unite unit : model.units) {//ami
            g.drawImage(unit.getImage(),unit.getX()-getX(),unit.getY()-getY(),this);
            //test
            g.drawRect(unit.getX()-getX(),unit.getY()-getY(),100,100);
            g.drawString("alli",unit.getX()-getX()+10,unit.getY()-getY()+40);

        }

        for (Unite ennemi : model.ennemis) {//ennemi
            g.drawImage(ennemi.getImage(),ennemi.getX()-getX(),ennemi.getY()-getY(),this);
            //test
            g.drawRect(ennemi.getX()-getX(),ennemi.getY()-getY(),100,100);
            g.drawString("enn",ennemi.getX()-getX()+10,ennemi.getY()-getY()+40);
        }

            //curseur
            //g.drawImage(model.c.getImage(), model.c.getX(), model.c.getY(), this);//curseur

    }

    public void actionPerformed(ActionEvent e) {

        //model.c.move();

        for(Unite unit :model.units){
            unit.move();
        }
        /*for(Unite ennemi :model.ennemis){
            ennemi.move();
        }*/
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            //model.c.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //model.c.keyPressed(e);
        }
    }
}
