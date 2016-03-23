package game;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class RenderPanel extends JPanel{
    protected Vue vue;
    protected Model model;


    public RenderPanel(Model m, Vue v) {
        super();
        model = m;
        vue = v;
        setLayout(null);
        setFocusable(true);
    }

    protected void paintComponent(Graphics g) {
        Font font = new Font("Verdana", Font.BOLD, 15);//police pour l'affichage de l'état
        g.setFont(font);
        g.setColor(Color.white);
        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(), 0, 0, this);



        for (Batiment bat : model.ville) {
            //batiment
            g.drawImage(bat.getImage(), bat.getX(), bat.getY(), this);
        }

        //Unités
        for (Unite unit : model.units) {//ami
            g.drawImage(unit.getImage(), unit.getX() - getX(), unit.getY() - getY(), this);
            //test
            //g.drawRect(unit.getX() - getX(), unit.getY() - getY(), 100, 100);
            //g.drawString("Joueur 1", unit.getX() - getX() + 10, unit.getY() - getY() + 40);
            //g.drawString(""+unit.getClass().getSimpleName(), unit.getX() - getX() + 10, unit.getY() - getY() + 70);
            int etat = Math.floorDiv(unit.getEtat() * 100, unit.getEtatMax());
            if (etat >=70) g.setColor(Color.green);
            else if (etat >= 40) g.setColor(Color.yellow);
            else if (etat >= 20) g.setColor(Color.orange);
            else g.setColor(Color.red);
            g.fillRect(unit.getX() - getX(), unit.getY() - getY(), etat, 10);
            g.setColor(Color.white);
        }

        for (Unite ennemi : model.ennemis) {//ennemi
            g.drawImage(ennemi.getImage(), ennemi.getX() - getX(), ennemi.getY() - getY(), this);
            //test
            //g.drawRect(ennemi.getX() - getX(), ennemi.getY() - getY(), 100, 100);
            //g.drawString("Joueur 2", ennemi.getX() - getX() + 10, ennemi.getY() - getY() + 40);
            //g.drawString(""+ennemi.getClass().getSimpleName(), ennemi.getX() - getX() + 10, ennemi.getY() - getY() + 70);
            int etat = Math.floorDiv(ennemi.getEtat() * 100, ennemi.getEtatMax());
            if (etat >=70) g.setColor(Color.green);
            else if (etat >= 40) g.setColor(Color.yellow);
            else if (etat >= 20) g.setColor(Color.orange);
            else g.setColor(Color.red);
            g.fillRect(ennemi.getX() - getX(), ennemi.getY() - getY(), etat, 10);
            g.setColor(Color.white);
        }

    }
}
