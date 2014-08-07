package MyPaintApplet;

import java.awt.event.*;

public class MouseCommands implements MouseMotionListener{

	Painting refToPainting;

	public MouseCommands(Painting virtyalObiect) {
		this.refToPainting = virtyalObiect;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		refToPainting.POINTX = (int) e.getX();
		refToPainting.POINTY = (int) e.getY();
		System.out.println(refToPainting.POINTX);
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
}
