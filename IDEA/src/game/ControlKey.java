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

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
