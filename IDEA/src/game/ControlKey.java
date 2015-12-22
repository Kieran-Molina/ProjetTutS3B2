package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class ControlKey implements KeyListener{
    protected Model model;
    protected Vue vue;

    public ControlKey(Model m, Vue v){
        model = m;
        vue = v;
    }

    public void keyTyped(KeyEvent e) {
        int i = e.getKeyCode();

        if(i==KeyEvent.VK_Z){
            model.c.setCurseY(-1);
            System.out.println(model.c.getCurseY());
        }
        if(i==KeyEvent.VK_S){
            model.c.setCurseY(+1);
            System.out.println(model.c.getCurseY());
        }
        if(i==KeyEvent.VK_Q){
            model.c.setCurseX(-1);
            System.out.println(model.c.getCurseX());
        }
        if(i==KeyEvent.VK_D){
            model.c.setCurseX(+1);
            System.out.println(model.c.getCurseX());
        }
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
