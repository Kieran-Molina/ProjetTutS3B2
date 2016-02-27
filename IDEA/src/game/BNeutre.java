package game;

/**
 * Created by mvava on 28/01/2016.
 */
public class BNeutre extends Batiment {

    protected boolean isSelect;

    public BNeutre(int xb, int yb) {
        super(xb, yb);
        loadImage("IDEA/Images/Tactical/Batiment/BatimentCapture.png");
        getImageDimensions();
        isSelect=false;

    }
    public boolean getSelect(){return isSelect;}

    public void setSelect(){
        if(isSelect==true){
            isSelect=false;
        }else{isSelect=true;}
    }
}
