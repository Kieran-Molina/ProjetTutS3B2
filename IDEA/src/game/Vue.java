package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Vue extends JFrame{
    public Dimension dimension;
    protected Model model;

    public MovePanel movePanel; // fond contenant la carte et tous les elements

    public Vue(Model m){
        model = m;
        dimension = Toolkit.getDefaultToolkit().getScreenSize();

        initAttribut();
        setSize(1005, 850);

        creerVueJeu();

        setLocation((dimension.width / 2) - (getWidth() / 2), (dimension.height / 2) - (getHeight() / 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Faudra trouver un nom ... "); //--------------------- TITRE ?

        setVisible(true);

    }

    private void creerVueJeu() {
        movePanel.repaint();
        setContentPane(movePanel);
    }

    private void initAttribut() {
        movePanel = new MovePanel(model, this);
    }

    public void setControlButton(ActionListener listener) {
        // xxx.addActionListener(listener);
    }

    public void setControlMenu(ActionListener listener) {
        // xxx.addActionListener(listener);
    }
}
