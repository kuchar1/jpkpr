package MyPaintApplet;

import java.applet.Applet;
import java.awt.Color;

public class AppletCore extends Applet{

	Painting canvas1 = new Painting();
		
	public void init(){
		setBackground(Color.black);
		setSize(500, 500);
		add(canvas1);
		addMouseMotionListener(new MouseCommands(canvas1));
	}
}
