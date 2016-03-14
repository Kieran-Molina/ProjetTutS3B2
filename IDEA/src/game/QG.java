package game;

import javax.swing.*;

/**
 * Created by nico on 03/01/16.
 */
public class QG extends Batiment {



    public QG (int lx,int ly,boolean s){
        super(lx,ly,s);
        if(s==true){
        loadImage("IDEA/Images/Tactical/Batiment/QGRouge.png");
        getImageDimensions();}
        else{
            loadImage("IDEA/Images/Tactical/Batiment/QGBleu.png");
            getImageDimensions();
        }

    }
}
