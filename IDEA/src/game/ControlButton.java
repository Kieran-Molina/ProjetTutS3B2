package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class ControlButton implements ActionListener{
    protected Model model;
    protected Vue vue;

    public ControlButton(Model m, Vue v) {
        model = m;
        vue = v;

        vue.setControlButton(this);
    }



    public void actionPerformed(ActionEvent e) {

    }
}
