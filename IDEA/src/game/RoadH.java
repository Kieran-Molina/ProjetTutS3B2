package game;

/**
 * Created by nico on 14/03/16.
 */
public class RoadH extends Field {

    public RoadH(int x, int y, boolean t, int h){
        super(x,y,t,h);
        loadImage("IDEA/Images/Tactical/Map/routeH.png");
        getImageDimensions();
    }
}
