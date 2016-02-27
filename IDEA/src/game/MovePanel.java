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
        renderPanel.setLocation(0,-4000); // position de départ
        renderPanel.setSize(model.getMap().getWidth(null), model.getMap().getHeight(null)); // taille de la map
        return renderPanel;
    }

    public void ajouterComposant(Unite unit){

        remove(renderPanel);
        unit.setX(unit.initX + renderPanel.getX());
        unit.setY(unit.initY + renderPanel.getY());
        unit.setSize(new Dimension(100, 100));
        add(unit);
        add(renderPanel);
        repaint();
    }

    private static class ComponentMove extends MouseAdapter {

        private int relx;
        private JComponent component;
        private int rely;
        private Container container;
        private int rpx = 0, rpy = -4000; // position de départ du renderPanel

        public ComponentMove(Container container) {
            this.container = container;
        }

        @Override
        public void mousePressed(MouseEvent e){
            component = getComponent(e.getX(), e.getY()); // on mémorise le composant en déplacement
            if (component != null) {
                relx = e.getX() - component.getX(); // on mémorise la position relative
                rely = e.getY() - component.getY();

                if (component instanceof RenderPanel){
                    for (Component cmp : container.getComponents()){
                        if (cmp != component){
                            ((Unite)cmp).relx = e.getX() - ((Unite)cmp).getX();
                            ((Unite)cmp).rely = e.getY() - ((Unite)cmp).getY();
                        }

                    }
                }

                component.setBorder(BorderFactory.createLineBorder(Color.RED)); // sélectionné -> bordure
            }
        }

        @Override
        public void mouseReleased(MouseEvent e){
            if (component != null) {
                if (component instanceof Unite){
                    ((Unite) component).setX((e.getX()-rpx%100) - (e.getX()-rpx%100)%100 + rpx%100 );
                    ((Unite) component).setY((e.getY()-rpy%100) - (e.getY()-rpy%100)%100 + rpy%100 );

                    //anti sortie
                    if(component.getX()<rpx)((Unite) component).setX(rpx);
                    if(component.getX()>rpx+4900) ((Unite) component).setX(rpx+4900);

                    if(component.getY()<rpy)((Unite) component).setY(rpy);
                    if(component.getY()>rpy+4900) ((Unite) component).setY(rpy+4900);

                    //anti depassement
                    if(Math.abs(component.getX()-(((Unite) component).initX)-rpx)
                            + Math.abs(component.getY()-(((Unite) component).initY)-rpy)
                        > 100*((Unite) component).getDeplacementMax()){

                        ((Unite) component).setX(((Unite) component).initX + rpx);
                        ((Unite) component).setY(((Unite) component).initY + rpy);
                    }

                    // anti superposition
                    for (Component cmp : container.getComponents()){
                        if (cmp instanceof Unite && cmp!=component){
                            if (cmp.getX() == component.getX() && cmp.getY() == component.getY()) {
                                ((Unite) component).setX(((Unite) component).initX + rpx);
                                ((Unite) component).setY(((Unite) component).initY + rpy);
                            }
                        }

                    }
                }
                System.out.println(component.getX()+" "+component.getY());
                component.setBorder(null);
                component = null;
            }
            container.repaint();
        }

        private JComponent getComponent(int x, int y) {
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
                component.setLocation(e.getX() - relx, e.getY() - rely);
                if (component instanceof RenderPanel){
                    rpx = component.getX();
                    rpy = component.getY();
                    for (Component cmp : container.getComponents()){
                        if (cmp != component){
                            ((Unite)cmp).setX(e.getX() - ((Unite) cmp).relx);
                            ((Unite)cmp).setY(e.getY() - ((Unite)cmp).rely);
                        }

                    }
                }

                if (component instanceof Unite){
                    ((Unite) component).setX(e.getX() - relx);
                    ((Unite) component).setY(e.getY() - rely);

                    //anti sortie
                    if(component.getX()<rpx)((Unite) component).setX(rpx);
                    if(component.getX()>rpx+4900) ((Unite) component).setX(rpx+4900);

                    if(component.getY()<rpy)((Unite) component).setY(rpy);
                    if(component.getY()>rpy+4900) ((Unite) component).setY(rpy + 4900);
                }
            }
            container.repaint();
        }
    }
}
