package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class ControlButton implements ActionListener{
    protected Model model;
    protected Vue vue;

    protected int allX, allY, ennX, ennY;

    public ControlButton(Model m, Vue v) {
        model = m;
        vue = v;
        //points de spawn
        allX = 900 ; allY = 4200;
        ennX = 1200 ; ennY = 4000; // base : 3500 600

        vue.setControlButton(this);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vue.finTour){
            model.finTour();
        }

        if (e.getSource()==vue.acheterTankLeger){
            if (model.tour == 1) {
                if (model.allie.paye(TankLeger.prix)) {
                    Unite newTank = new TankLeger(allX,allY,true);
                    model.units.add(newTank);
                    model.movePanel.ajouterComposant(newTank);
                }
            }else{
                if (model.ennemi.paye(TankLeger.prix)) {
                    Unite newTank = new TankLeger(ennX,ennY, false);
                    model.ennemis.add(newTank);
                    model.movePanel.ajouterComposant(newTank);
                }
            }
        }

        if (e.getSource()==vue.acheterTankLourd){
            if (model.tour == 1){
                if (model.allie.paye(TankLourd.prix)) {
                    Unite newTank = new TankLourd(allX,allY,true);
                    model.units.add(newTank);
                    model.movePanel.ajouterComposant(newTank);
                }
            }else{
                if (model.ennemi.paye(TankLourd.prix)) {
                    Unite newTank = new TankLourd(ennX,ennY,false);
                    model.ennemis.add(newTank);
                    model.movePanel.ajouterComposant(newTank);
                }
            }
        }

        if (e.getSource()==vue.acheterInfanterie){
            if (model.tour == 1){
                if (model.allie.paye(Infanterie.prix)) {
                    Unite newUnit = new Infanterie(allX,allY,true);
                    model.units.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }else{
                if (model.ennemi.paye(Infanterie.prix)) {
                    Unite newUnit = new Infanterie(ennX,ennY, false);
                    model.ennemis.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }
        }

        if (e.getSource()==vue.acheterChimique){
            if (model.tour == 1) {
                if (model.allie.paye(Chimique.prix)) {
                    Unite newUnit = new Chimique(allX,allY,true);
                    model.units.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }else{
                if (model.ennemi.paye(Chimique.prix)) {
                    Unite newUnit = new Chimique(ennX,ennY, false);
                    model.ennemis.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }
        }

        if (e.getSource()==vue.acheterMoto){
            if (model.tour == 1) {
                if (model.allie.paye(Moto.prix)) {
                    Unite newUnit = new Moto(allX,allY,true);
                    model.units.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }else{
                if (model.ennemi.paye(Moto.prix)) {
                    Unite newUnit = new Moto(ennX,ennY, false);
                    model.ennemis.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }
        }

        if (e.getSource()==vue.acheterGrenadier){
            if (model.tour == 1) {
                if (model.allie.paye(Grenadier.prix)) {
                    Unite newUnit = new Grenadier(allX,allY,true);
                    model.units.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }else{
                if (model.ennemi.paye(Grenadier.prix)) {
                    Unite newUnit = new Grenadier(ennX,ennY, false);
                    model.ennemis.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }
        }

        vue.lblTour.setText("Joueur "+model.tour);
        vue.lblEffectif.setText("Effectif : "+model.getNbUnit());
        vue.lblArgent.setText("Argent : "+model.getArgent());

        // script d'achat
        /*
        if (e.getSource()==vue.acheterType){
            if (model.tour == 1){
                if (model.allie.paye(Type.prix)) {
                    Unite newUnit = new Type(allX,allY, true);
                    model.units.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }else{
                if (model.ennemi.paye(Type.prix)) {
                    Unite newUnit = new Type(ennX,ennY, false);
                    model.ennemis.add(newUnit);
                    model.movePanel.ajouterComposant(newUnit);
                }
            }
        }
        */
    }
}
