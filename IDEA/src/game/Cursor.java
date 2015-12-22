package game;

/**
 * Created by nico on 22/12/15.
 */
public class Cursor {

    protected int x;
    protected int y;
    protected boolean select;

    public Cursor (){

        x=0;
        y=0;
        select=false;
    }

    public int getCurseX(){return x;}

    public int getCurseY(){return y;}

    public boolean getEtatCurse(){return select;}

    public void setCurseX(int nx){
        x=x+nx;
    }

    public void setCurseY(int ny){
        y=y+ny;
    }

    public void setCurseSelect(){
        if (select==false){select=true;}
        if (select==true){select =false;}
    }
}
