package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class Vue extends JFrame{
    public Dimension dimension;
    protected Model model;
    protected Vue vue;


    public Vue(Model m,Vue v){
        model = m;
        vue = v;
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
        model.movePanel.repaint();
        bar.add(new JButton("fonction 1"));
        bar.add(new JButton("fonction 2"));
        bar.add(new JButton("fonction 3"));
        tout.add(model.movePanel, BorderLayout.CENTER);
        tout.add(bar, BorderLayout.PAGE_END);
        setContentPane(tout);
    }

    private void initAttribut() {
        model.movePanel = new MovePanel(model,vue);
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
