package CanvasGra;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private MyCanvas canvas = new MyCanvas();
		
	Random generator = new Random();
	int i = 20*generator.nextInt(20);
	int j = 20*generator.nextInt(20);	
	
	int xStart = 60;
	int yStart = 60;
	
	
	int xCoor = xStart;
	int	yCoor = yStart;
	int score=1;
	
	class Key implements KeyListener {
		
		public void keyPressed(KeyEvent e) {
			
			int key = e.getKeyCode();
			
			if (key==KeyEvent.VK_RIGHT)	{
				xCoor = xCoor+20;
				canvas.repaint();
			}
			if (key==KeyEvent.VK_LEFT)	{
				xCoor= xCoor-20;
				canvas.repaint();
			}
			if (key==KeyEvent.VK_UP)	{
				yCoor= yCoor-20;
				canvas.repaint();
			}
			if (key==KeyEvent.VK_DOWN)	{
				yCoor= yCoor+20;
				canvas.repaint();
			}
		}

		//@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		//@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public Frame(){
		
		setBackground(Color.lightGray);
		
		setLayout(new BorderLayout());
		setSize(500,500);
		setTitle("Gra w kratki");
		add("Center", canvas);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.addKeyListener(new Key());
		canvas.setFocusable(true);
		canvas.requestFocusInWindow();
	}
	
	private class MyCanvas extends Canvas {
		@Override
		public void paint( Graphics g) {
	
			super.paint(g);
			g.setColor(Color.GRAY);
			
			for (int i=0; i < this.getWidth() / 10; i++) {
				g.drawLine(i*20, 0, i*20, this.getHeight());
				}
			for (int i=0; i < this.getWidth() / 10; i++) {
				g.drawLine(0, i*20, this.getHeight(), i*20 );
				}
			g.setColor(Color.RED);
			g.fillRect(xCoor, yCoor, 19,19);
			g.setColor(Color.GREEN);
			g.fillRect(xCoor+1, yCoor+1, 17,17);
	
			if (xCoor >= 500){
				xCoor = 0;
			}
			if	(xCoor < 0){
				xCoor = 500;
			}
			if	(yCoor >= 500){
				yCoor = 0;
			}
			if	(yCoor < 0){
				yCoor = 500;
			}
			
			g.setColor(Color.BLUE);
			g.fillRect(i+2, j+2, 16,16);
			
			
			if (xCoor ==  i && yCoor == j){
				System.out.println("Iloœæ punktów: " +(score));
				score++;
				i = 20*generator.nextInt(20);
				j = 20*generator.nextInt(20);
			}
			if (score == 3){
				
				Image andy = new ImageIcon("C:/Users/4/workspace/andy.jpg").getImage();
				g.drawImage(andy, 330, 30, this);
			}
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

