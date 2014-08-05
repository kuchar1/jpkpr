package CanvasPodzielonyNaKlasy;

import java.awt.event.*;

public class Keys implements KeyListener {

	PaintInFrame paintInFrameSkrut;

	public Keys(PaintInFrame obiect1) {
		this.paintInFrameSkrut = obiect1;
	}

	//@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			paintInFrameSkrut.x = paintInFrameSkrut.x + 10;
			System.out.println("right");
			paintInFrameSkrut.repaint();
		}
		
		if (key == KeyEvent.VK_LEFT) {
			paintInFrameSkrut.x = paintInFrameSkrut.x - 10;
			System.out.println("left");
			paintInFrameSkrut.repaint();
		}
		if (key == KeyEvent.VK_UP) {
			paintInFrameSkrut.y = paintInFrameSkrut.y - 10;
			System.out.println("up");
			paintInFrameSkrut.repaint();
		}
		if (key == KeyEvent.VK_DOWN) {
			paintInFrameSkrut.y = paintInFrameSkrut.y + 10;
			System.out.println("down");
			paintInFrameSkrut.repaint();
		}
		
		if (key == KeyEvent.VK_PAGE_UP) {
			paintInFrameSkrut.zoom = paintInFrameSkrut.zoom + 10;
			System.out.println("zoom+");
			paintInFrameSkrut.repaint();
		}
		
		if (key == KeyEvent.VK_PAGE_DOWN) {
			paintInFrameSkrut.zoom = paintInFrameSkrut.zoom - 10;
			System.out.println("zoom-");
			paintInFrameSkrut.repaint();
		}
		
		if (key == KeyEvent.VK_C) {
			
			if (paintInFrameSkrut.tlo == true){
				paintInFrameSkrut.tlo = false;
				System.out.println("TLO");
				paintInFrameSkrut.repaint();
			}
			else{
			paintInFrameSkrut.tlo = true;
			System.out.println("TLO");
			paintInFrameSkrut.repaint();
			}
		}	
			
		
	}

	//@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	//@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
