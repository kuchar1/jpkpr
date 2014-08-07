package MyPaintApplet;

import java.awt.*;

public class Painting extends Canvas{

	int POINTX,POINTY;

	
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.fillOval(POINTX, POINTY, 10, 10);
	}
}
