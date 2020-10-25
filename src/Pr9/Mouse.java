package Pr9;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {
    Window w;
    Mouse(Window w){
        this.w = w;
    }

    @Override
    public void mouseClicked(MouseEvent m) {
        w.paint(w.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent m) {

    }

    @Override
    public void mouseReleased(MouseEvent m) {

    }

    @Override
    public void mouseEntered(MouseEvent m) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}