package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nico on 05/01/16.
 */
public class Sprite extends JPanel{
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean vis;
    protected Image image;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        width = 100; height = 100;
        vis = true;
        setOpaque(false);
        setSize(100,100);
        setEnabled(false);
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

    public void setVisible(Boolean visible) {
        vis = visible;
    }

    public Rectangle getBounds() {//sert a la detection des sprites
        return new Rectangle(x, y, 100, 100);
    }
}
