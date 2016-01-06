package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class MovePanel extends JPanel {
    protected Model model;
    protected Vue vue;
    public RenderPanel renderPanel;

    public MovePanel(Model m,Vue v) {
        model = m;
        vue = v;

        setLayout(null); // on supprime le layout manager

        ComponentMove listener = new ComponentMove(this);
        add(createComponent());
        addMouseListener(listener);
        addMouseMotionListener(listener);

    }

    private JComponent createComponent() {
        renderPanel = new RenderPanel(model,vue); // création du jpanel contenant la map déplaçable
        renderPanel.setLocation(0,0); // position de départ
        renderPanel.setSize(model.getMap().getWidth(null), model.getMap().getHeight(null)); // taille de la map
        //renderPanel.setEnabled(false); // les composants ne doivent pas intercepter la souris (ça va merder...)
        return renderPanel;
    }

    private static class ComponentMove extends MouseAdapter {

        private int relx;
        private JComponent component;
        private int rely;
        private Container container;

        public ComponentMove(Container container) {
            this.container = container;
        }

        @Override
        public void mousePressed(MouseEvent e){
            component = getComponent(e.getX(), e.getY()); // on mémorise le composant en déplacement
            if (component != null) {
                relx = e.getX() - component.getX(); // on mémorise la position relative
                rely = e.getY() - component.getY();
                component.setBorder(BorderFactory.createLineBorder(Color.RED)); // sélectionné -> bordure
            }
        }

        @Override
        public void mouseReleased(MouseEvent e){
            if (component != null) {
                component.setBorder(null);
                component = null;
            }
        }

        private JComponent getComponent(int x, int y) { //-------------- a simplifier
            // on recherche le composant aux coordonnées de la souris
            for (Component component : container.getComponents()) {
                if (component instanceof JComponent && component.getBounds().contains(x, y)) {
                    return (JComponent) component;
                }
            }
            return null;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (component != null) {
                component.setLocation(e.getX() - relx, e.getY() - rely);
            }
        }
    }
}