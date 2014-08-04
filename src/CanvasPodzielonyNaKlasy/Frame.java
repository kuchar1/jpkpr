package CanvasPodzielonyNaKlasy;

import javax.swing.JFrame;

public class Frame extends JFrame{

	PaintInFrame canvasShortcut = new PaintInFrame();
	
	//Keys k;
	public void paintTheFrame(){
		setSize(250,230);
		setTitle("Test Frame");
		add(canvasShortcut);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(getGlassPane());
		setVisible(true);
		setResizable(false);
		canvasShortcut.addKeyListener(new Keys(canvasShortcut));
		canvasShortcut.addMouseListener(new Mouse(canvasShortcut));
		canvasShortcut.setFocusable(true);
		canvasShortcut.addMouseMotionListener(new Mouse(canvasShortcut));
	}
}