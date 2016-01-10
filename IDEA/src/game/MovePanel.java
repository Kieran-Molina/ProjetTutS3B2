package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class MovePanel extends JLayeredPane{
    protected Model model;
    protected Vue vue;
    public RenderPanel renderPanel;
    public ComponentMove listener;

    public MovePanel(Model m,Vue v) {
        model = m;
        vue = v;

        setLayout(null); // on supprime le layout manager

        ComponentMove listener = new ComponentMove(this);
        add(createRenderPan());
        addMouseListener(listener);
        addMouseMotionListener(listener);

    }

    private JComponent createRenderPan() {
        renderPanel = new RenderPanel(model,vue); // création du jpanel contenant la map déplaçable
        renderPanel.setLocation(0,0); // position de départ
        renderPanel.setSize(model.getMap().getWidth(null), model.getMap().getHeight(null)); // taille de la map
        return renderPanel;
    }

    public void ajouterComposant(Unite unit){

        remove(renderPanel);
        unit.setLocation(unit.x, unit.y);
        unit.setSize(new Dimension(100, 100));
        add(unit);
        add(renderPanel);

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
                if (component instanceof Unite){
                    component.setLocation(component.getX() - (component.getX()+50)%100, component.getY() - (component.getY()+50)%100);
                    ((Unite) component).setX(component.getX() - (component.getX()+50)%100);
                    ((Unite) component).setY(component.getY() - (component.getY()+50)%100);
                }
                component.setBorder(null);
                component = null;
            }
        }

        private JComponent getComponent(int x, int y) { //-------------- a simplifier
            // on recherche le composant aux coordonnées de la souris
            for (Component component : container.getComponents()) {
                if (component.getBounds().contains(x, y)) {
                    return (JComponent) component;
                }
            }
            return null;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (component != null) {
                /*if (component instanceof RenderPanel){
                    for (Component cmp : container.getComponents()){
                        if (cmp instanceof Unite){
                            //cmp.setLocation(e.getX() - relx -cmp.getX(), e.getY() - rely -cmp.getY());
                            ((Unite) cmp).setX(2*(e.getX() - relx)-cmp.getX());
                            ((Unite) cmp).setY(2*(e.getY() - rely)-cmp.getY());
                        }
                    }
                }*/
                component.setLocation(e.getX() - relx, e.getY() - rely);
                if (component instanceof Unite){
                    ((Unite) component).setX(e.getX() - relx);
                    ((Unite) component).setY(e.getY() - rely);
                }
            }
        }
    }
}
