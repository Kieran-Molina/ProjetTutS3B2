package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nico on 03/01/16.
 */
public class Batiment extends Sprite {
    protected int impot;//a chaque tour le NB de batiment ramene de l'argent
    protected boolean capture;//si false, le batiment est neutre
    protected boolean batSide;//true batment ami rapport une somme au camp a lequel elle appartient

    public Batiment (int xb,int yb,boolean s){
        super(xb,yb);
        impot=100;
        capture=false;
        this.batSide=s;

    }

    public int getPrix(){return impot;}

    public boolean getCapture(){return capture;}

    public void setCapture(){
        capture=true;
    }

    public boolean getSide(){return batSide;}

    public void setside(Unite uni){
        if(uni.getSide()==true){batSide=true;}
        else{batSide=false;}
    }


}
