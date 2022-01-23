package Main;

import utils.Slide;

/**
 *
 * @author Iván
 */
public class Movimiento {
    protected int x, y;
    
    public Movimiento (java.awt.event.MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
    }
}
