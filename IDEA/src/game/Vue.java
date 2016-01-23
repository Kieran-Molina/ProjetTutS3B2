package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Vue extends JFrame{
    public Dimension dimension;
    protected Model model;


    public Vue(Model m){
        model = m;
        dimension = Toolkit.getDefaultToolkit().getScreenSize();

        initAttribut();
        setSize(dimension.width - 100, dimension.height - 70);

        creerVueJeu();

        setLocation((dimension.width / 2) - (getWidth() / 2), (dimension.height / 2) - (getHeight() / 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Projet Tut "); //--------------------- TITRE ?

        setVisible(true);

    }

    private void creerVueJeu() {
        JPanel tout = new JPanel(new BorderLayout());
        JPanel bar = new JPanel();
        JPanel hub = new JPanel();

        for(Unite unit : model.units){model.movePanel.ajouterComposant(unit);}
        for(Unite unit : model.ennemis){model.movePanel.ajouterComposant(unit);}

        model.movePanel.repaint();
        hub.add(new JLabel("Nombre unités"+ model.getListUnit()));
        bar.setOpaque(true);
        bar.setBackground(new Color(0,0,0,0));
        bar.add(new JButton("Se deplacer"));
        bar.add(new JButton("Attaquer"));
        bar.add(new JButton("Attendre"));
        bar.add(new JButton("Fin de tour"));
        tout.add(model.movePanel, BorderLayout.CENTER);
        tout.add(bar, BorderLayout.PAGE_END);
        setContentPane(tout);
    }

    private void initAttribut() {
        model.movePanel = new MovePanel(model,this);
    }

    public void setControlButton(ActionListener listener) {
        // xxx.addActionListener(listener);
    }

    public void setControlMenu(ActionListener listener) {
        // xxx.addActionListener(listener);
    }

    public void setControlKey(KeyAdapter listener) {
        addKeyListener(listener);
        model.movePanel.addKeyListener(listener);
        model.movePanel.renderPanel.addKeyListener(listener);

    }
}
