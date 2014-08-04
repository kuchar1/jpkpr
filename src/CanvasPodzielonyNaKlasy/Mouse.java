package CanvasPodzielonyNaKlasy;

import java.awt.*;
import java.awt.event.*;

public class Mouse implements MouseListener, MouseMotionListener {

	PaintInFrame mojePaint;

	public Mouse(PaintInFrame obiect2) {
		this.mojePaint = obiect2;
	}

	// @Override
	public void mouseClicked(MouseEvent e) {
		int button = e.getButton();

		if (button == MouseEvent.BUTTON1) {
			System.out.println("Myszka Lewy przycisk");

		}
		if (button == MouseEvent.BUTTON2) {
			System.out.println("Myszka Scroll");
		}
		if (button == MouseEvent.BUTTON3) {
			System.out.println("Myszka Prawy przycisk");
		}

	}

	// @Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Myszka w okienku");

	}

	// @Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Myszka poza okienkiem");

	}

	// @Override
	public void mousePressed(MouseEvent e) {
		// System.out.println("Wciskasz przycisk");
	}

	// @Override
	public void mouseReleased(MouseEvent e) {
		// System.out.println("Pusciles przycisk");

	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {

		PointerInfo a = MouseInfo.getPointerInfo(); // do koordynatow
		Point b = a.getLocation(); // do koordynatow
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.println("Koordynaty myszy:" + "x: " + x + " " + "y: " + y);
		String mousex = Integer.toString(x);
		String mousey = Integer.toString(y);
		mojePaint.MOUSEX = mousex;
		mojePaint.MOUSEY = mousey;
		mojePaint.repaint();

	}

}
