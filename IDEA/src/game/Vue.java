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
    protected JButton acheterTankLeger, acheterTankLourd, acheterChimique, acheterInfanterie, acheterGrenadier, acheterMoto;
    protected JButton finTour;

    protected JLabel lblTour, lblEffectif, lblArgent;


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
        JPanel bas = new JPanel();

        for(Unite unit : model.units){model.movePanel.ajouterComposant(unit);}
        for(Unite unit : model.ennemis){model.movePanel.ajouterComposant(unit);}

        lblTour = new JLabel("Joueur "+model.tour);
        lblEffectif = new JLabel("Effectif : "+ model.getNbUnit());
        lblArgent = new JLabel("Argent : "+model.getArgent());
        hub.add(lblTour);
        hub.add(lblEffectif);
        hub.add(lblArgent);
        bas.setOpaque(true);
        bas.setBackground(new Color(0,0,0,0));
        bas.setLayout(new BoxLayout(bas,BoxLayout.Y_AXIS));

        // achats
        acheterTankLeger = new JButton("Tank Leger");
        acheterTankLourd = new JButton("Tank Lourd");
        acheterChimique = new JButton("Unite Chimique");
        acheterGrenadier = new JButton("Grenadier");
        acheterInfanterie = new JButton("Infanterie");
        acheterMoto = new JButton("Moto");

        bar.add(new JLabel("Achat : "));
        acheterInfanterie.setToolTipText("<HTML>Prix : "+Infanterie.prix+" <br>Deplacement : "+Infanterie.DEPLACEMENT_MAX
                +" <br>force : 35/50 <br>resistance : "+Infanterie.ETAT_MAX+"</HTML>");
        bar.add(acheterInfanterie);
        acheterMoto.setToolTipText("<HTML>Prix : "+Moto.prix+" <br>Deplacement : "+Moto.DEPLACEMENT_MAX
                +" <br>force : 35/50 <br>resistance : "+Moto.ETAT_MAX+"</HTML>");
        bar.add(acheterMoto);
        acheterTankLeger.setToolTipText("<HTML>Prix : "+TankLeger.prix+" <br>Deplacement : "+TankLeger.DEPLACEMENT_MAX
                +" <br>force : 150/175 <br>resistance : "+TankLeger.ETAT_MAX+"</HTML>");
        bar.add(acheterTankLeger);
        acheterTankLourd.setToolTipText("<HTML>Prix : "+TankLourd.prix+" <br>Deplacement : "+TankLourd.DEPLACEMENT_MAX
                +" <br>force : 180/230 <br>resistance : "+TankLourd.ETAT_MAX+"</HTML>");
        bar.add(acheterTankLourd);
        acheterChimique.setToolTipText("<HTML>Prix : "+Chimique.prix+" <br>Deplacement : "+Chimique.DEPLACEMENT_MAX
                +" <br>force : 70/100 <br>resistance : "+Chimique.ETAT_MAX+"</HTML>");
        bar.add(acheterChimique);
        acheterGrenadier.setToolTipText("<HTML>Prix : "+Grenadier.prix+" <br>Deplacement : "+Grenadier.DEPLACEMENT_MAX
                +" <br>force : 50/80 <br>resistance : "+Grenadier.ETAT_MAX+"</HTML>");
        bar.add(acheterGrenadier);

        bar.add(new JLabel("Actions : "));
        finTour = new JButton("Fin de tour");
        bar.add(finTour);

        bas.add(bar);
        bas.add(hub);
        tout.add(model.movePanel, BorderLayout.CENTER);
        tout.add(bas, BorderLayout.PAGE_END);
        setContentPane(tout);
    }

    private void initAttribut() {
        model.movePanel = new MovePanel(model,this);
    }

    public void setControlButton(ActionListener listener) {
        finTour.addActionListener(listener);

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
