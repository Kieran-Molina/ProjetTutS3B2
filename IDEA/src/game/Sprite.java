package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nico on 05/01/16.
 */
public class Sprite extends JPanel{
    protected int x;
    protected int y;
    protected int initX, initY; // position d'origine pour limite deplacement
    protected int width;
    protected int height;
    protected boolean vis;
    protected Image image;
    public int relx,rely; // deplacement

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        initX = x;
        initY = y;
        width = 100; height = 100;
        vis = true;
        setOpaque(false);
        setSize(100,100);
        setEnabled(false);
    }

    public void resetInitPos(int mapX, int mapY){
        initX = x-mapX; initY = y-mapY;
    }

    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {return y;}

    public void setX(int dx){x=dx;}
    public void setY(int dy){y=dy;}

    public boolean isVisible() {
        return vis;
    }

    public Rectangle getBounds() {//sert a la detection des sprites
        return new Rectangle(x, y, 100, 100);
    }
}
