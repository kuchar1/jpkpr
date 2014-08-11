package MyPaintApplet;

import javax.swing.JFrame;

public class AppletCore extends JFrame{

	
	Painting canvas1 = new Painting();
		
	public void makeFrame(){
		setSize(500, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(canvas1);
		setVisible(true);
		canvas1.addMouseMotionListener(new MouseCommands(canvas1));
		
	}
	
	
	
	
	
}
