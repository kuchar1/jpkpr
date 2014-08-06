package Satelita;


import java.awt.*;
import java.awt.event.*;


public class Mouse implements MouseMotionListener {

	int MouseX, MouseY;

	Painting refPainting;

	public Mouse(Painting obiect2) {
		this.refPainting = obiect2;
	}

	public void mouseDragged(MouseEvent e) {
		refPainting.x1 = (int) e.getX();
		refPainting.x2=refPainting.x1+10;
		refPainting.y1 = (int) e.getY();
		refPainting.y2=refPainting.y1+10;
		
		
	}

	public void mouseMoved(MouseEvent e) {

		// PointerInfo a = MouseInfo.getPointerInfo();
		// Point b = a.getLocation(); // lokacja jezeli obiektem jest ekran

		MouseX = (int) e.getX();
		// MouseY = (int) b.getY();
		refPainting.x = MouseX;
		// MouseY =refPainting.y;

		// System.out.println("Koordynaty myszy:" + "x:" + MouseX + " " + "y:" +
		// refPainting.y);
		/*
		if (MouseX <= 380) {
			refPainting.repaint();
		}
		*/
	}

}
