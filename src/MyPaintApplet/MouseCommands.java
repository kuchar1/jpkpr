package MyPaintApplet;

import java.awt.event.*;

public class MouseCommands implements MouseMotionListener{

	Painting refToPainting;

	public MouseCommands(Painting virtyalObiect) {
		this.refToPainting = virtyalObiect;
	}

	public void mouseDragged(MouseEvent e) {
		refToPainting.POINTX = (int) e.getX();
		refToPainting.POINTY = (int) e.getY();
		refToPainting.paint(refToPainting.getGraphics());
	}

	public void mouseMoved(MouseEvent e) {}
}
