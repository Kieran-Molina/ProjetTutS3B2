package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class RenderPanel extends JPanel implements ActionListener {
    protected Vue vue;
    protected Model model;
    private Timer timer;
    private final int DELAY = 10;

    public RenderPanel(Model m,Vue v) {
        super();
        model = m;
        vue = v;
        setLayout(new GridLayout(50,50,0,0)); //PB
        addKeyListener((KeyListener) new TAdapter());
        setFocusable(true);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        //fond map
        g.drawImage(model.getMap(),0,0,this);

        //Unités
        for (Unite uni : model.units){
            g.drawImage(uni.getImageIcon().getImage(),uni.getX()*100,uni.getY()*100,this);
            g.setColor(Color.RED);
           // g.drawRect (10, 10,model.c.getCurseX()*10 ,model.c.getCurseY()*10);
            g.drawImage(model.c.getImage(), model.c.getCurseX(), model.c.getCurseY(), this);
            /*g.setColor(Color.green);
            g.draw3DRect (10, 10,uni.getX()*100,uni.getY()*100,true);*/
        }
    }

    public void actionPerformed(ActionEvent e) {

        model.c.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            model.c.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            model.c.keyPressed(e);
        }
    }
}
