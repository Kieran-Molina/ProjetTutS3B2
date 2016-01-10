package game;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.random;


public class Grenadier extends Unite {

    public Grenadier(int posX, int posY, boolean ami) {

        super(posX, posY, ami);
        if(ami==true){
        loadImage("IDEA/Images/Tactical/Unite/Grenadier/Normal/Déplacement_LEFT/Grenadier_Deplacement_11.png");}
        else{loadImage("IDEA/Images/Tactical/Unite/GrenadierEnnemi/Normal/Déplacement_LEFT/GrenadierEnnemi_Deplacement_1.png");}
        getImageDimensions();
        force=(int)(50+random()*(80-50));
        prix=75;

    }





}