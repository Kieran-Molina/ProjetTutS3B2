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
    protected JButton acheterTankLeger, acheterTankLourd, acheterChimique, acheterInfanterie, acheterGrenadier, acheterMoto;


    public Vue(Model m){
        model = m;
        dimension = Toolkit.getDefaultToolkit().getScreenSize();

        initAttribut();
        setSize(dimension.width - 100, dimension.height - 70);

        creerVueJeu();

        setLocation((dimension.width / 2) - (getWidth() / 2), (dimension.height / 2) - (getHeight() / 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Projet Tut ");

        setVisible(true);

    }

    private void creerVueJeu() {
        JPanel tout = new JPanel(new BorderLayout());
        JPanel bar = new JPanel();
        JPanel hub = new JPanel();

        for(Unite unit : model.units){model.movePanel.ajouterComposant(unit);}
        for(Unite unit : model.ennemis){model.movePanel.ajouterComposant(unit);}

        //model.movePanel.repaint();
        hub.add(new JLabel("Nombre unités"+ model.getListUnit()));
        bar.setOpaque(true);
        bar.setBackground(new Color(0,0,0,0));

        // achats
        acheterTankLeger = new JButton("Tank Leger");
        acheterTankLourd = new JButton("Tank Lourd");
        acheterChimique = new JButton("Unite Chimique");
        acheterGrenadier = new JButton("Grenadier");
        acheterInfanterie = new JButton("Infanterie");
        acheterMoto = new JButton("Moto");

        bar.add(new JLabel("Achat : "));
        acheterInfanterie.setToolTipText("<HTML>Prix : 100 <br>Deplacement : 3 <br>force : 35/50</HTML>");
        bar.add(acheterInfanterie);
        acheterMoto.setToolTipText("<HTML>Prix : 1000 <br>Deplacement : 8 <br>force : 35/50</HTML>");
        bar.add(acheterMoto);
        acheterTankLeger.setToolTipText("<HTML>Prix : 4000 <br>Deplacement : 5 <br>force : 150/175</HTML>");
        bar.add(acheterTankLeger);
        acheterTankLourd.setToolTipText("<HTML>Prix : 6000 <br>Deplacement : 6 <br>force : 180/230</HTML>");
        bar.add(acheterTankLourd);
        acheterChimique.setToolTipText("<HTML>Prix : 1500 <br>Deplacement : 2 <br>force : 70/100</HTML>");
        bar.add(acheterChimique);
        acheterGrenadier.setToolTipText("<HTML>Prix : 300 <br>Deplacement : 2 <br>force : 50/80</HTML>");
        bar.add(acheterGrenadier);

        bar.add(new JLabel("Actions : "));
        bar.add(new JButton("Fin de tour"));
        tout.add(model.movePanel, BorderLayout.CENTER);
        tout.add(bar, BorderLayout.PAGE_END);
        setContentPane(tout);
    }

    private void initAttribut() {
        model.movePanel = new MovePanel(model,this);
    }

    public void setControlButton(ActionListener listener) {
        acheterTankLeger.addActionListener(listener);
        acheterTankLourd.addActionListener(listener);
        acheterInfanterie.addActionListener(listener);
        acheterMoto.addActionListener(listener);
        acheterGrenadier.addActionListener(listener);
        acheterChimique.addActionListener(listener);
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
