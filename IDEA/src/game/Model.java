package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.lang.Math.abs;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Model {
    public MovePanel movePanel; // fond contenant la carte et tous les elements
    public Joueur allie;
    public Joueur ennemi;
    public ArrayList<Unite> units;
    public ArrayList<Unite> ennemis;
    public ArrayList<Batiment> ville;
    public int tour;

    ///// IMAGES /////
    protected Image map, grille;

    public Model(){
        units = new ArrayList<Unite>();

        units.add(new TankLeger(1400,4700,true));
        units.add(new Infanterie(1300,4700,true));

        tour = 1;


        ennemis = new ArrayList<Unite>();

        ennemis.add(new TankLourd(1300,4500,false));


        ville = new ArrayList<Batiment>();

        ville.add(new QG(300,4400,true));
        ville.add(new QG(4100,100,false));
        ville.add(new BFormation(900,4100));
        ville.add(new BFormation(3200,100));

        allie=new Joueur(15000);
        ennemi=new Joueur(15000);

        ///// IMAGES /////
        map = new ImageIcon("IDEA/Images/Tactical/Map/MapVierge.png").getImage();
        grille = new ImageIcon("IDEA/Images/Tactical/Map/Cadrillage.png").getImage();

    }

    public Image getMap(){ return map; }


    public int getNbUnit(){
        return tour==1 ? units.size() : ennemis.size();
    }

    public void finTour(){
        if (tour == 1) tour = 2;
        else tour = 1;

        gagne();

        for (int i = 0; i<units.size(); i++){
            Unite unit = units.get(i);
            unit.resetInitPos(movePanel.renderPanel.getX(),movePanel.renderPanel.getY());
            for (int j = 0; j<ennemis.size(); j++){
                Unite enn = ennemis.get(j);
                if (abs(unit.getX()-enn.getX())==100 && unit.getY()==enn.getY()
                        || abs(unit.getY()-enn.getY())==100 && unit.getX()==enn.getX()){
                    unit.prendDegats(enn.getForce());
                    enn.prendDegats(unit.getForce());
                }
                if (enn.getEtat()<=0){
                    movePanel.remove(enn);
                    ennemis.remove(enn);

                    movePanel.revalidate();
                    movePanel.repaint();
                }
            }
            if (unit.getEtat()<=0){
                movePanel.remove(unit);
                units.remove(unit);

                movePanel.revalidate();
                movePanel.repaint();
            }
            gagne();
        }
        for (Unite enn : ennemis){
            enn.resetInitPos(movePanel.renderPanel.getX(),movePanel.renderPanel.getY());
        }
        movePanel.revalidate();
        movePanel.repaint();
    }

    public int getArgent() {
        return tour==1 ? allie.getArgent() : ennemi.getArgent();
    }

    public void gagne(){
        if (ennemis.size()<=0){
            JOptionPane.showMessageDialog(null, "Le joueur 1 gagne!",
                    "Fin de partie!",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }else if (units.size()<=0){
            JOptionPane.showMessageDialog(null, "Le joueur 2 gagne!",
                    "Fin de partie!",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }


}
