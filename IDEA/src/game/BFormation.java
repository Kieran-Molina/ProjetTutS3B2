package game;

import javax.swing.*;

/**
 * Created by nico on 04/01/16.
 */
public class BFormation extends Batiment {
    protected boolean isSelect;


    public BFormation(int lx,int ly,boolean s) {
        super(lx,ly,s);
        isSelect=false;
        if(s==true){
            loadImage("IDEA/Images/Tactical/Batiment/UsineNeutre.png");
            getImageDimensions();
        }else{
            loadImage("IDEA/Images/Tactical/Batiment/UsineNeutre.png");
            getImageDimensions();
        }


    }

    public boolean getSelect(){return isSelect;}

    public void setSelect(){
        if(isSelect==true){
            isSelect=false;
        }else{isSelect=true;}
    }
}

