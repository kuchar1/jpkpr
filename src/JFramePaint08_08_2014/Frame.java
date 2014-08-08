package JFramePaint08_08_2014;


import javax.swing.JFrame;

public class Frame extends JFrame{

	
	Painting shortcutCanvas = new Painting();
	
	public void frameDrawing(){
		setTitle("Test Frame");
		setSize(800, 500);
		setLocationRelativeTo(getGlassPane());
		add(shortcutCanvas);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shortcutCanvas.addMouseMotionListener(new Mouse(shortcutCanvas));
		
	}
}
