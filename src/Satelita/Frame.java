package Satelita;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{

	
	Painting shortcutCanvas = new Painting();
	
	public void frameDrawing(){
		setTitle("Test Frame");
		//getContentPane().setBackground(Color.black);
		//Toolkit tk = Toolkit.getDefaultToolkit();  
		//int xSize = ((int) tk.getScreenSize().getWidth());  
		//int ySize = ((int) tk.getScreenSize().getHeight());  
		//setSize(xSize,ySize); 
		setSize(800, 500);
		setLocationRelativeTo(getGlassPane());
		add(shortcutCanvas);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shortcutCanvas.addMouseMotionListener(new Mouse(shortcutCanvas));
		
	}
}
