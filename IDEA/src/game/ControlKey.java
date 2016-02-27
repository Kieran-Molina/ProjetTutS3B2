package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class ControlKey extends KeyAdapter implements KeyListener{
    protected Model model;
    protected Vue vue;

    public ControlKey(Model m, Vue v){
        model = m;
        vue = v;
    }

    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();

        //deplacement map
        if(i==KeyEvent.VK_UP){
            model.movePanel.renderPanel.deplacer(0, 15);
        }
        if(i==KeyEvent.VK_LEFT){
            model.movePanel.renderPanel.deplacer(15, 0);
        }
        if(i==KeyEvent.VK_DOWN){
            model.movePanel.renderPanel.deplacer(0, -15);
        }
        if(i==KeyEvent.VK_RIGHT){
            model.movePanel.renderPanel.deplacer(-15, 0);
        }



        if (i== KeyEvent.VK_SPACE) {
            model.setDELAYUp();
        }
    }


    public void keyReleased(KeyEvent e) {
        int i = e.getKeyCode();

        if (i== KeyEvent.VK_SPACE) {
            model.setDELAYDown();
        }
    }
}
