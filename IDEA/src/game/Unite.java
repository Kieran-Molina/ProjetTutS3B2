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
    final static int DEPLACEMENT_MAX=5;//nombre de case de deplacement
    protected boolean side;//ami= true ;enemie=false
    protected int deplacement;
    protected int force;//les degat que fait une unite
    protected int prix;//ce que coute une unité
    protected int munition;//nul si munitions infinis


    //--- CONSTANTES ---//
    private static final ImageIcon img_UP = new ImageIcon("IDEA/Images/Tactical/Unite/Default/up.png");
    private static final ImageIcon img_RIGHT = new ImageIcon("IDEA/Images/Tactical/Unite/Default/right.png");
    private static final ImageIcon img_DOWN = new ImageIcon("IDEA/Images/Tactical/Unite/Default/down.png");
    private static final ImageIcon img_LEFT = new ImageIcon("IDEA/Images/Tactical/Unite/Default/left.png");
    public static final int UP = 1, RIGHT = 2, DOWN = 3, LEFT = 4;

    public Unite(int posX, int posY,boolean ami){
        super(posX,posY);
        direction = RIGHT;
        isSelect=false;
        etat=10;
    }

    /*public void deplaceUnite(int depX, int depY){
        if(isSelect){
        if (depX + depY > DEPLACEMENT_MAX){
            System.out.println("deplacement trop grand : "+(depX+depY)+" max : "+DEPLACEMENT_MAX);
            return;
        }
        x+=depX;
        y+=depY;}
    }*/

    public int getDeplacementMax(){return DEPLACEMENT_MAX;}

    public boolean isDead(){
        if(etat<=0){
            return true;
        }
        return false;
    }

    public void attackUnit(Unite u){
        if(this.side!=u.side){
            if(this.getX()+100==u.getX()
                &&this.getX()-100==u.getX()
                &&this.getY()+100==u.getY()
                &&this.getY()-100==u.getY()){
                    u.prendDegats(this.getForce());

            }
        }
    }

    public int getEtat(){return etat;}

    public void prendDegats(int degats){
        etat-=degats;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        /*switch (direction){
            case UP:
                g.drawImage(img_UP.getImage(),x,y,this);
            case DOWN:
                g.drawImage(img_DOWN.getImage(),x,y,this);
            case LEFT:
                g.drawImage(img_LEFT.getImage(),x,y,this);
            default:
                g.drawImage(img_RIGHT.getImage(),x,y,this);
        }*/
        g.drawImage(getImage(),x,y,null);
    }

    public boolean getSelect(){return isSelect;}
    public void trueSelect(){isSelect=true;}
    public void falseSelect(){isSelect=false;}

    public int getForce(){return force;}

    public void setForce(int f){force=f;}

    public boolean getSide(){return side;}


    public int getPrix(){return prix;}

    public String getTextEtat(int etat){
        String text = Integer.toString(etat);
        return text;
    }


}
