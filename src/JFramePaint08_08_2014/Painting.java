package JFramePaint08_08_2014;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Painting extends Canvas{

	int x1,y1;
	
	public void paint(Graphics g){	
		
		g.setColor(Color.red);
		g.fillOval(x1, y1, 5, 5);
	}
}
