package Satelita;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Painting extends Canvas{

	
	int x;
	int y=400;
	int BallX=250-(70/2);
	int BallY=150;
	int orbitX =250-5;
	int orbitY =110-5;
	
	
	public void paint(Graphics g){
		
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 100, 17);
		g.fillOval(BallX, BallY, 70, 70);
		g.drawOval(250-(150/2),110 , 150, 150);
		g.fillOval(orbitX, orbitY, 10, 10);
		
		
		
	}
	
	
	
	
	
}
