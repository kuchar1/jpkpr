package MyPaintApplet;

import javax.swing.JFrame;

public class AppletCore extends JFrame{

	
	Painting canvas1 = new Painting();
		
	public void makeFrame(){
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(canvas1);
		canvas1.addMouseMotionListener(new MouseCommands(canvas1));
		
	}
	
	
	
	
	
}
