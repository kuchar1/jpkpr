package Satelita;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Painting extends Canvas{

	
	int x;
	int y=400;
	int BallX=250-(70/2);
	int BallY=150;
	int orbitX =250-5;
	int orbitY =110-5;
	int TloX;
	int x1,y1,x2,y2;
	
	
	
	public void paint(Graphics g){
		
		
		
		Image Tlo = new ImageIcon("Tlo.jpg").getImage();
		g.drawImage(Tlo, TloX, 0, this);
		g.drawLine(x1, y1, x2, y2);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, 100, 17);
		g.fillOval(BallX, BallY, 70, 70);
		g.drawOval(250-(150/2),110 , 150, 150);
		g.fillOval(orbitX, orbitY, 10, 10);
		
		
		
	}
	
	
	
	
	
}
