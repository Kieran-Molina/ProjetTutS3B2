package game;

import javax.swing.*;

/**
 * Created by nico on 04/01/16.
 */
public class BFormation extends Batiment {
    protected boolean isSelect;


    public BFormation(int lx,int ly) {
        super(lx,ly);
        isSelect=false;
        loadImage("IDEA/Images/Tactical/Batiment/BatimentFormation.png");
        getImageDimensions();

    }

    public boolean getSelect(){return isSelect;}

    public void setSelect(){
        if(isSelect==true){
            isSelect=false;
        }else{isSelect=true;}
    }
}

