package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class ControlButton implements ActionListener{
    protected Model model;
    protected Vue vue;

    public ControlButton(Model m, Vue v) {
        model = m;
        vue = v;

        vue.setControlButton(this);
    }



    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==vue.acheterTankLeger){
            if (model.allie.paye(TankLeger.prix)) {
                Unite newTank = new TankLeger(1300, 4600, true);
                model.units.add(newTank);
                model.movePanel.ajouterComposant(newTank);
            }
        }

        if (e.getSource()==vue.acheterTankLourd){
            if (model.allie.paye(TankLourd.prix)) {
                Unite newTank = new TankLourd(1300, 4600, true);
                model.units.add(newTank);
                model.movePanel.ajouterComposant(newTank);
            }
        }

        if (e.getSource()==vue.acheterInfanterie){
            if (model.allie.paye(Infanterie.prix)) {
                Unite newUnit = new Infanterie(1300,4600, true);
                model.units.add(newUnit);
                model.movePanel.ajouterComposant(newUnit);
            }
        }

        if (e.getSource()==vue.acheterChimique){
            if (model.allie.paye(Chimique.prix)) {
                Unite newUnit = new Chimique(1300,4600, true);
                model.units.add(newUnit);
                model.movePanel.ajouterComposant(newUnit);
            }
        }

        if (e.getSource()==vue.acheterMoto){
            if (model.allie.paye(Moto.prix)) {
                Unite newUnit = new Moto(1300,4600, true);
                model.units.add(newUnit);
                model.movePanel.ajouterComposant(newUnit);
            }
        }

        if (e.getSource()==vue.acheterGrenadier){
            if (model.allie.paye(Grenadier.prix)) {
                Unite newUnit = new Grenadier(1300,4600, true);
                model.units.add(newUnit);
                model.movePanel.ajouterComposant(newUnit);
            }
        }

        // script d'achat
        /*if (e.getSource()==vue.acheter){
            if (model.allie.paye(.prix)) {
                Unite newUnit = new Unite(1300,4600, true);
                model.units.add(newUnit);
                model.movePanel.ajouterComposant(newUnit);
            }
        }*/
    }
}
