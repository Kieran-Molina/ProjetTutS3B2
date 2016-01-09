package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Kiéran on 23/10/2015.
 */
public class Unite extends Sprite {
    private static int direction; // sera en abstract
    //public int x, y;
    protected int etat;//jauge d'énergie
    protected boolean isSelect;//savoir si il est selectionner avec le curseur
    protected int DEPLACEMENT_MAX;//nombre de case de deplacement
    protected boolean side;//ami= true ;enemie=false
    protected int force;//les degat que fait une unite
    protected int prix;//ce que coute une unité
    protected int dx;//dir de depl
    protected int dy;//pareil


    //--- CONSTANTES ---//
    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/Default/up.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/Default/right.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/Default/down.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/Default/left.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;

    public Unite(int posX, int posY, int dep,boolean ami){
        super(posX,posY);
        direction = RIGHT;
        DEPLACEMENT_MAX=dep;
        isSelect=false;
        etat=10;
    }

    public void deplaceUnite(int depX, int depY){
        if(isSelect==true){
        if (depX + depX > DEPLACEMENT_MAX){
            System.out.println("deplacement trop grand : "+(depX+depY)+" max : "+DEPLACEMENT_MAX);
            return;
        }
        x+=depX;
        y+=depY;}
    }

    public boolean isDead(){
        if(etat<=0){
            return true;
        }
        return false;
    }

    public int getEtat(){return etat;}

    public void prendDegats(int degats){
        etat-=degats;
        if (isDead()){

        }
    }

    public static ImageIcon getImageIcon(){
        switch (direction){
            case UP:
                return img_UP;
            case DOWN:
                return img_DOWN;
            case LEFT:
                return img_LEFT;
            default:
                return img_RIGHT;
        }
    }

    public int getX(){return x;}
    public int getY(){return y;}

    public boolean getSelect(){return isSelect;}
    public void trueSelect(){isSelect=true;}
    public void falseSelect(){isSelect=false;}

    public void move() {
        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }

        if (x > 4900) {
            x =4900;
        }

        if (y >4900) {
            y = 4900;
        }
    }
   /* public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {dx = -1;}

        if (key == KeyEvent.VK_RIGHT) {dx = 1;}

        if (key == KeyEvent.VK_UP) {dy = -1;}

        if (key == KeyEvent.VK_DOWN) {dy = 1;}

    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {dx = 0;}

        if (key == KeyEvent.VK_RIGHT) {dx = 0;}

        if (key == KeyEvent.VK_UP) {dy = 0;}

        if (key == KeyEvent.VK_DOWN) {dy = 0;}
    }*/

    public int getForce(){return force;}

    public void setForce(int f){force=f;}

    public boolean getSide(){return side;}

    public void attack(Unite a, Unite b){
        if (a.getSide()==true && b.getSide()==false||a.getSide()==false&&b.getSide()==true){
            b.prendDegats(a.getForce());
        }
    }

    public int getPrix(){return prix;}

    public String getTextEtat(int etat){
        String text = Integer.toString(etat);
        return text;
    }


}
