package CanvasDemo;

import java.awt.*;
import javax.swing.*;

public class CanvasDemo extends JFrame {

	private MyCanvas canvas = new MyCanvas();

	public static void main(String[] args) {
		CanvasDemo fr = new CanvasDemo();
	}

	public CanvasDemo() {

		setLayout(new BorderLayout());
		setSize(500, 400);
		setTitle("Canvas demo");
		add(canvas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
		setVisible(true);

	}

	private class MyCanvas extends Canvas {

		public void paint(Graphics g) {
			g.drawString("My first text", 10, 20);
			g.drawOval(200, 50, 100, 25);
			g.drawRect(200, 50, 100, 25);
			g.setColor(Color.BLUE);
			g.fillOval(50, 100, 70, 70);
			g.fillRect(200, 100, 90, 90);
			Image andy = new ImageIcon("C:/Users/4/workspace/andy.jpg")//brak obrazka
					.getImage();
			Image lary = new ImageIcon("C:/Users/4/workspace/lary.jpg")//brak obrazka
					.getImage();
			g.drawImage(andy, 330, 30, this);
			g.drawImage(lary, 345, 190, this);

		}
	}
}
