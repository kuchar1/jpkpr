package CanvasPodzielonyNaKlasy;

import java.awt.*;
import javax.swing.*;

public class PaintInFrame extends Canvas {

int x=20;
int y=20;
int zoom=40;

	public void paint(Graphics g){
		Image Beagle = new ImageIcon("Beagle.jpg").getImage();
		g.drawImage(Beagle, 0, 0, this);
		g.setColor(Color.BLUE);
		g.drawOval(x, y, zoom, zoom);
	}
}