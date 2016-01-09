package game;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class Grenadier extends Unite {

    public Grenadier(int posX, int posY, int dep, boolean ami) {

        super(posX, posY, dep, ami);
        if(ami==true){
        loadImage("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_LEFT/Grenadier_Deplacement_1.png");}
        else{loadImage("IDEA/Images/Tactical/Unite/GrenadierEnnemi/Normal/Déplacement_LEFT/GrenadierEnnemi_Deplacement_1.png");}
        getImageDimensions();
        force=4;
        prix=75;

    }





}