package game;

/**
 * Created by nico on 14/03/16.
 */
public class Field extends Sprite {

    protected boolean traversable;
    protected int handicap;

    public Field(int x,int y,boolean t,int h){
        super(x,y);
        this.traversable= t;
        this.handicap= h;
    }


}
