package JFramePaint08_08_2014;

import java.awt.*;
import java.awt.event.*;

public class Mouse implements MouseMotionListener {

	int MouseX, MouseY;

	Painting refPainting;

	public Mouse(Painting obiect2) {
		this.refPainting = obiect2;
	}

	public void mouseDragged(MouseEvent e) {
		//refPainting.x1 = (int) e.getX();
		//refPainting.y1 = (int) e.getY();
		//refPainting.repaint();
		
	}
	public void mouseMoved(MouseEvent e) {}

}
