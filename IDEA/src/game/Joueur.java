package game;

import javax.swing.*;

/**
 * Created by nico on 21/01/16.
 */
public class Joueur {

    protected int argent;

    public Joueur(int x){
        argent = x;
    }

    public int getArgent(){
        return argent;
    }

    public boolean paye(int somme){
        if (somme < 0 || argent-somme < 0){
            System.out.println("paiement impossible, reste : "+argent);
            JOptionPane.showMessageDialog(null, "Paiement impossible : \nreste : "+argent+"\nprix : "+somme,
                    "avertissement",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            argent-=somme;
            return true;
        }
    }

}
