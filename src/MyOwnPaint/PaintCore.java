package MyOwnPaint;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;



	
import javax.swing.ImageIcon;

	public class PaintCore extends Applet implements MouseMotionListener, KeyListener {

		int x, y, z, c, R, G, B;
		int stroke = 1;
		float r, g, b;
		Color color;
		Color color2;
		Image Beagle;
		

		public PaintCore() {
			addMouseMotionListener(this);
			addKeyListener(this);

		}
	

		public void rysuj(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(stroke));

			R = (int) (Math.random() * 256);
			G = (int) (Math.random() * 256);
			B = (int) (Math.random() * 256);
			color2 = new Color(R, G, B);

			Beagle = new ImageIcon("Beagle.jpg").getImage();

			g.setColor(color);
			g2.drawLine(x, y, z, c);
			
		}

		public void mouseDragged(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			rysuj(this.getGraphics());
			z = x;
			c = y;
		}

		public void mouseMoved(MouseEvent e) {
			z = e.getX();
			c = e.getY();

			// repaint();
		}

		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_1) {
				color = Color.black;
			}
			if (key == KeyEvent.VK_2) {
				color = Color.red;
			}
			if (key == KeyEvent.VK_3) {
				color = Color.yellow;
			}

			if (key == KeyEvent.VK_4) {
				color = Color.blue;
			}
			if (key == KeyEvent.VK_0) {
				color = new Color(R, G, B);
			}
			if (key == KeyEvent.VK_B) {
				stroke = stroke + 2;

			}
			if (key == KeyEvent.VK_C) {
				stroke = stroke - 2;
				if (stroke <= 0) {
					stroke = 0;
				}
				if (key == KeyEvent.VK_5) {

					
				}
			}

		}

		public void keyReleased(KeyEvent e) {

		}

		public void keyTyped(KeyEvent e) {
		}
	}
	
	
	
	/* 
	 * INNY PRZYKLAD WSTAWIANIA GRAFIKI*
	 * 
	 * 
	 * 
	 * public void paintComponent(Graphics g) {

         super.paintComponent(g);

         Graphics2D g2d = (Graphics2D) g.create();
         String text = "Look ma, no hands";
         FontMetrics fm = g2d.getFontMetrics();
         int x = (getWidth() - fm.stringWidth(text)) / 2;
         int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
         g2d.drawString(text, x, y);
         g2d.dispose();
	*/
	
         
         
         
         
         
         