package CanvasPodzielonyNaKlasy;

import java.awt.*;
import javax.swing.*;

public class PaintInFrame extends Canvas {

int x=20;
int y=20;
int zoom=40;
String MOUSEX="x";
String  MOUSEY="y";


	public void paint(Graphics g){
		Image Beagle = new ImageIcon("Beagle.jpg").getImage();
		g.drawImage(Beagle, 0, 0, this);
		g.setColor(Color.BLUE);
		g.drawOval(x, y, zoom, zoom);
		g.setColor(Color.WHITE);
		g.drawString("x: "+ MOUSEX,150, 200);
		g.drawString("y: "+MOUSEY, 200, 200);
	}
}