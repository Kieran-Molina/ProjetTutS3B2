package game;

/**
 * Created by mvava on 28/01/2016.
 */
public class BNeutre extends Batiment {

    protected boolean isSelect;

    public BNeutre(int xb, int yb,boolean s) {
        super(xb, yb,s);
        if(s==true){
            loadImage("IDEA/Images/Tactical/Batiment/BatimentRouge.png");
            getImageDimensions();
        }else{
            loadImage("IDEA/Images/Tactical/Batiment/BatimentBleu.png");
            getImageDimensions();
        }
        isSelect=false;

    }
    public boolean getSelect(){return isSelect;}

    public void setSelect(){
        if(isSelect==true){
            isSelect=false;
        }else{isSelect=true;}
    }
}
